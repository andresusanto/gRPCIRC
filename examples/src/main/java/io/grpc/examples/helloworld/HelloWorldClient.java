/*
 * Copyright 2015, Google Inc. All rights reserved.
 */

package io.grpc.examples.helloworld;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HelloWorldClient {
  private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());

  private final ManagedChannel channel;
  private final ChatGrpc.ChatBlockingStub blockingStub;

  public HelloWorldClient(String host, int port) {
    channel = ManagedChannelBuilder.forAddress(host, port)
        .usePlaintext(true)
        .build();
    blockingStub = ChatGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }

  public boolean nick(String selectednick) {
    try {
      NickRequest request = NickRequest.newBuilder().setNick(selectednick).build();
      StatusResponse response = blockingStub.setNick(request);
      return response.getStatus();
    } catch (RuntimeException e) {
      System.out.println("RPC FAIL");
      return false;
    }
  }

  public boolean join(String nick, String channelName) {
    try {
      ChannelRequest request = ChannelRequest.newBuilder().setNick(nick).setChannel(channelName).build();
      StatusResponse response = blockingStub.join(request);
      return response.getStatus();
    } catch (RuntimeException e) {
      System.out.println("RPC FAIL");
      return false;
    }
  }
 
 public boolean leave(String nick, String channelName) {
    try {
      ChannelRequest request = ChannelRequest.newBuilder().setNick(nick).setChannel(channelName).build();
      StatusResponse response = blockingStub.leave(request);
      return response.getStatus();
    } catch (RuntimeException e) {
      System.out.println("RPC FAIL");
      return false;
    }
  }
  
  public boolean sendto(String message, String channelName, String nick) {
    try {
      SendToRequest request = SendToRequest.newBuilder().setNick(nick).setChannel(channelName).setMessage(message).build();
      StatusResponse response = blockingStub.sendTo(request);
      return response.getStatus();
    } catch (RuntimeException e) {
      System.out.println("RPC FAIL");
      return false;
    }
  }
  
  public boolean sendall(String message, String nick) {
    try {
      SendAllRequest request = SendAllRequest.newBuilder().setNick(nick).setMessage(message).build();
      StatusResponse response = blockingStub.sendAll(request);
      return response.getStatus();
    } catch (RuntimeException e) {
      System.out.println("RPC FAIL");
      return false;
    }
  }
  
  public List<String> getmessage(String nick) {
    List<String> messages = new ArrayList<String>();
    try {
      
      NickRequest request = NickRequest.newBuilder().setNick(nick).build();
      MessageResponse response = blockingStub.getMessages(request);
      
      for (int i = 0 ; i < response.getMessageCount(); i++){
        messages.add(response.getMessage(i));
      }
      
      
    } catch (RuntimeException e) {
      System.out.println("RPC FAIL");
    }
    return messages;
  }
  
  public static void main(String[] args) throws Exception {
    HelloWorldClient client = new HelloWorldClient("localhost", 50051);
    
    String nick = "", command = "";
    Scanner scn = new Scanner(System.in);
    
    System.out.println("Welcome to gPRC IRC Chat Client. (c) 2015 by Andre Susanto 13512028");
    System.out.println("Please choose nick by using /nick <your nick>");
    
        /*
    try {
      String user = "world";
      if (args.length > 0) {
        user = args[0]; 
      }
      client.greet(user);
    } finally {
      
    }*/
      while( !(command = scn.next()).equals("/exit") ) {
        
          if (nick.equals("")){
              if (command.equals("/nick")){
                  String userPickNick = scn.next();
                  if (client.nick(userPickNick)){
                      nick = userPickNick;
                      System.out.println("Nick changed to " + nick);
                  }else{
                      System.out.println("Nick " + nick + " is used by someone else ... Please choose another");
                  }
              }else{
                  System.out.println("Please select you nick by using /nick <nickname>");
              }
          }else{
              if (command.equals("/join")){
                  String channelName = scn.next();
                  if (client.join(channelName, nick)){
                      System.out.println("You are now a member of #" + channelName);
                  }else{
                      System.out.println("You are already a member of #" + channelName);
                  }
                  
              }else if (command.equals("/leave")){
                  String channelName = scn.next();
                  if (client.leave(channelName, nick)){
                      System.out.println("You are out of #" + channelName);
                  }else{
                      System.out.println("You are not a member of #" + channelName);
                  }
              }else if (command.equals("/read")){
                  List<String> messages = client.getmessage(nick);
                  if (messages.size() == 0){
                      System.out.println("No new messages.");
                  }else{
                      System.out.println("=================NEW MESSAGES=================");
                      for (String message : messages){
                          System.out.println(message);
                      }
                      System.out.println("==============================================");
                  }
              }else{
                  StringBuffer messageBuffer = new StringBuffer();
                  if (command.substring(0, 1).equals("@")){
                      messageBuffer.append(scn.nextLine());
                      messageBuffer.trimToSize();
                      
                      client.sendto(messageBuffer.toString(), command.substring(1, command.length()), nick);
                      System.out.println("Message sent to " + command.substring(1, command.length()));
                  }else{
                      messageBuffer.append(command);
                      messageBuffer.append(scn.nextLine());
                      messageBuffer.trimToSize();
                      
                      client.sendall(messageBuffer.toString(), nick);
                      System.out.println("Message sent to all #channel.");
                  }
              }
          }
      }
      
      System.out.println("Bye bye!");
    
    client.shutdown();
  }
}
