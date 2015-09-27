package com.ganesus.pat.tugas3;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class ChatGrpc {

  private ChatGrpc() {}

  public static final String SERVICE_NAME = "tugas3pat.Chat";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.ganesus.pat.tugas3.NickRequest,
      com.ganesus.pat.tugas3.StatusResponse> METHOD_SET_NICK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "tugas3pat.Chat", "SetNick"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.NickRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.StatusResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.ganesus.pat.tugas3.NickRequest,
      com.ganesus.pat.tugas3.MessageResponse> METHOD_GET_MESSAGES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "tugas3pat.Chat", "GetMessages"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.NickRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.MessageResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.ganesus.pat.tugas3.ChannelRequest,
      com.ganesus.pat.tugas3.StatusResponse> METHOD_JOIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "tugas3pat.Chat", "Join"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.ChannelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.StatusResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.ganesus.pat.tugas3.ChannelRequest,
      com.ganesus.pat.tugas3.StatusResponse> METHOD_LEAVE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "tugas3pat.Chat", "Leave"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.ChannelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.StatusResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.ganesus.pat.tugas3.SendToRequest,
      com.ganesus.pat.tugas3.StatusResponse> METHOD_SEND_TO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "tugas3pat.Chat", "SendTo"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.SendToRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.StatusResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.ganesus.pat.tugas3.SendAllRequest,
      com.ganesus.pat.tugas3.StatusResponse> METHOD_SEND_ALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "tugas3pat.Chat", "SendAll"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.SendAllRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ganesus.pat.tugas3.StatusResponse.getDefaultInstance()));

  public static ChatStub newStub(io.grpc.Channel channel) {
    return new ChatStub(channel);
  }

  public static ChatBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatBlockingStub(channel);
  }

  public static ChatFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatFutureStub(channel);
  }

  public static interface Chat {

    public void setNick(com.ganesus.pat.tugas3.NickRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver);

    public void getMessages(com.ganesus.pat.tugas3.NickRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.MessageResponse> responseObserver);

    public void join(com.ganesus.pat.tugas3.ChannelRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver);

    public void leave(com.ganesus.pat.tugas3.ChannelRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver);

    public void sendTo(com.ganesus.pat.tugas3.SendToRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver);

    public void sendAll(com.ganesus.pat.tugas3.SendAllRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver);
  }

  public static interface ChatBlockingClient {

    public com.ganesus.pat.tugas3.StatusResponse setNick(com.ganesus.pat.tugas3.NickRequest request);

    public com.ganesus.pat.tugas3.MessageResponse getMessages(com.ganesus.pat.tugas3.NickRequest request);

    public com.ganesus.pat.tugas3.StatusResponse join(com.ganesus.pat.tugas3.ChannelRequest request);

    public com.ganesus.pat.tugas3.StatusResponse leave(com.ganesus.pat.tugas3.ChannelRequest request);

    public com.ganesus.pat.tugas3.StatusResponse sendTo(com.ganesus.pat.tugas3.SendToRequest request);

    public com.ganesus.pat.tugas3.StatusResponse sendAll(com.ganesus.pat.tugas3.SendAllRequest request);
  }

  public static interface ChatFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.StatusResponse> setNick(
        com.ganesus.pat.tugas3.NickRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.MessageResponse> getMessages(
        com.ganesus.pat.tugas3.NickRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.StatusResponse> join(
        com.ganesus.pat.tugas3.ChannelRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.StatusResponse> leave(
        com.ganesus.pat.tugas3.ChannelRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.StatusResponse> sendTo(
        com.ganesus.pat.tugas3.SendToRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.StatusResponse> sendAll(
        com.ganesus.pat.tugas3.SendAllRequest request);
  }

  public static class ChatStub extends io.grpc.stub.AbstractStub<ChatStub>
      implements Chat {
    private ChatStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatStub(channel, callOptions);
    }

    @java.lang.Override
    public void setNick(com.ganesus.pat.tugas3.NickRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_NICK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getMessages(com.ganesus.pat.tugas3.NickRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.MessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MESSAGES, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void join(com.ganesus.pat.tugas3.ChannelRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void leave(com.ganesus.pat.tugas3.ChannelRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void sendTo(com.ganesus.pat.tugas3.SendToRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_TO, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void sendAll(com.ganesus.pat.tugas3.SendAllRequest request,
        io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_ALL, getCallOptions()), request, responseObserver);
    }
  }

  public static class ChatBlockingStub extends io.grpc.stub.AbstractStub<ChatBlockingStub>
      implements ChatBlockingClient {
    private ChatBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.ganesus.pat.tugas3.StatusResponse setNick(com.ganesus.pat.tugas3.NickRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SET_NICK, getCallOptions()), request);
    }

    @java.lang.Override
    public com.ganesus.pat.tugas3.MessageResponse getMessages(com.ganesus.pat.tugas3.NickRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_GET_MESSAGES, getCallOptions()), request);
    }

    @java.lang.Override
    public com.ganesus.pat.tugas3.StatusResponse join(com.ganesus.pat.tugas3.ChannelRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request);
    }

    @java.lang.Override
    public com.ganesus.pat.tugas3.StatusResponse leave(com.ganesus.pat.tugas3.ChannelRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.ganesus.pat.tugas3.StatusResponse sendTo(com.ganesus.pat.tugas3.SendToRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEND_TO, getCallOptions()), request);
    }

    @java.lang.Override
    public com.ganesus.pat.tugas3.StatusResponse sendAll(com.ganesus.pat.tugas3.SendAllRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEND_ALL, getCallOptions()), request);
    }
  }

  public static class ChatFutureStub extends io.grpc.stub.AbstractStub<ChatFutureStub>
      implements ChatFutureClient {
    private ChatFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.StatusResponse> setNick(
        com.ganesus.pat.tugas3.NickRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_NICK, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.MessageResponse> getMessages(
        com.ganesus.pat.tugas3.NickRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MESSAGES, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.StatusResponse> join(
        com.ganesus.pat.tugas3.ChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.StatusResponse> leave(
        com.ganesus.pat.tugas3.ChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.StatusResponse> sendTo(
        com.ganesus.pat.tugas3.SendToRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_TO, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.ganesus.pat.tugas3.StatusResponse> sendAll(
        com.ganesus.pat.tugas3.SendAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_ALL, getCallOptions()), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Chat serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
      .addMethod(
        METHOD_SET_NICK,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              com.ganesus.pat.tugas3.NickRequest,
              com.ganesus.pat.tugas3.StatusResponse>() {
            @java.lang.Override
            public void invoke(
                com.ganesus.pat.tugas3.NickRequest request,
                io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver) {
              serviceImpl.setNick(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_GET_MESSAGES,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              com.ganesus.pat.tugas3.NickRequest,
              com.ganesus.pat.tugas3.MessageResponse>() {
            @java.lang.Override
            public void invoke(
                com.ganesus.pat.tugas3.NickRequest request,
                io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.MessageResponse> responseObserver) {
              serviceImpl.getMessages(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_JOIN,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              com.ganesus.pat.tugas3.ChannelRequest,
              com.ganesus.pat.tugas3.StatusResponse>() {
            @java.lang.Override
            public void invoke(
                com.ganesus.pat.tugas3.ChannelRequest request,
                io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver) {
              serviceImpl.join(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_LEAVE,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              com.ganesus.pat.tugas3.ChannelRequest,
              com.ganesus.pat.tugas3.StatusResponse>() {
            @java.lang.Override
            public void invoke(
                com.ganesus.pat.tugas3.ChannelRequest request,
                io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver) {
              serviceImpl.leave(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_SEND_TO,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              com.ganesus.pat.tugas3.SendToRequest,
              com.ganesus.pat.tugas3.StatusResponse>() {
            @java.lang.Override
            public void invoke(
                com.ganesus.pat.tugas3.SendToRequest request,
                io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver) {
              serviceImpl.sendTo(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_SEND_ALL,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              com.ganesus.pat.tugas3.SendAllRequest,
              com.ganesus.pat.tugas3.StatusResponse>() {
            @java.lang.Override
            public void invoke(
                com.ganesus.pat.tugas3.SendAllRequest request,
                io.grpc.stub.StreamObserver<com.ganesus.pat.tugas3.StatusResponse> responseObserver) {
              serviceImpl.sendAll(request, responseObserver);
            }
          })).build();
  }
}
