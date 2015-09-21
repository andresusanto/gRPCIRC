/*
 * Copyright 2015, Google Inc. All rights reserved.
 *
 */

package io.grpc.examples.helloworld;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;


public class HelloWorldServer {
  private static final Logger logger = Logger.getLogger(HelloWorldServer.class.getName());

  /* The port on which the server should run */
  private int port = 50051;
  private Server server;

  private void start() throws Exception {
    server = ServerBuilder.forPort(port)
        .addService(ChatGrpc.bindService(new ChatImpl()))
        .build()
        .start();
    logger.info("Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** shutting down gRPC server since JVM is shutting down");
        HelloWorldServer.this.stop();
        System.err.println("*** server shut down");
      }
    });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  /**
   * Await termination on the main thread since the grpc library uses daemon threads.
   */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  /**
   * Main launches the server from the command line.
   */
  public static void main(String[] args) throws Exception {
    final HelloWorldServer server = new HelloWorldServer();
    server.start();
    server.blockUntilShutdown();
  }

  private class ChatImpl implements ChatGrpc.Chat {
  
		private Map<String, List<String>> user_membership;
		private Map<String, List<String>> user_message;

		public ChatImpl(){
			user_membership = new HashMap<String, List<String>>();
			user_message = new HashMap<String, List<String>>();
		}

		@Override
		public void setNick(NickRequest req, StreamObserver<StatusResponse> responseObserver) {
			StatusResponse reply;
			String nickname = req.getNick();
			
			System.out.println("Nick " + nickname);
			if (user_membership.containsKey(nickname)){
				reply = StatusResponse.newBuilder().setStatus(false).build();
			}else{
				user_membership.put(nickname, new ArrayList<String>());
				user_message.put(nickname, new ArrayList<String>());
				reply = StatusResponse.newBuilder().setStatus(true).build();
			}
		  
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
		
		@Override
		public void join(ChannelRequest req, StreamObserver<StatusResponse> responseObserver) {
			StatusResponse reply;
			String nickname = req.getNick();
			String channelname = req.getChannel();
			
			System.out.println("Join " + nickname + " #" + channelname);
			if (user_membership.containsKey(nickname)){
				if (user_membership.get(nickname).contains(channelname)){
					reply = StatusResponse.newBuilder().setStatus(false).build();
				}else{
					user_membership.get(nickname).add(channelname);
					reply = StatusResponse.newBuilder().setStatus(true).build();
				}
			}else{
				reply = StatusResponse.newBuilder().setStatus(false).build();
			}
			
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
		
		@Override
		public void leave(ChannelRequest req, StreamObserver<StatusResponse> responseObserver) {
			StatusResponse reply;
			String nickname = req.getNick();
			String channelname = req.getChannel();
			
			if (user_membership.containsKey(nickname)){
				if (user_membership.get(nickname).contains(channelname)){
					user_membership.get(nickname).remove(channelname);
					reply = StatusResponse.newBuilder().setStatus(true).build();
				}else{
					reply = StatusResponse.newBuilder().setStatus(false).build();
				}
			}else{
				reply = StatusResponse.newBuilder().setStatus(false).build();
			}
			
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
		
		@Override
		public void sendTo(SendToRequest req, StreamObserver<StatusResponse> responseObserver) {
			StatusResponse reply;
			String nickname = req.getNick();
			String message = req.getMessage();
			String channelname = req.getChannel();
			
			sendto(message, channelname, nickname);

			reply = StatusResponse.newBuilder().setStatus(true).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
		
		@Override
		public void sendAll(SendAllRequest req, StreamObserver<StatusResponse> responseObserver) {
			StatusResponse reply;
			String nickname = req.getNick();
			String message = req.getMessage();
			
			int allChannel = user_membership.get(nickname).size();
			for (int i = 0; i < allChannel; i++){
				
				sendto(message, user_membership.get(nickname).get(i), nickname);
			}

			reply = StatusResponse.newBuilder().setStatus(true).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
		
		@Override
		public void getMessages(NickRequest req, StreamObserver<MessageResponse> responseObserver) {
			String nickname = req.getNick();
			List<String> message = new ArrayList<String>(user_message.get(nickname));
			user_message.get(nickname).clear();
			
			MessageResponse reply = MessageResponse.newBuilder().addAllMessage(message).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
		
		public void sendto(String message, String channelname, String nickname){
			for (Map.Entry<String, List<String>> entry : user_membership.entrySet()){
				if (entry.getValue().contains(channelname)){
					user_message.get(entry.getKey()).add("[" + channelname + "] (" + nickname + ") " + message.trim());
				}
			}
		}
  }
}
