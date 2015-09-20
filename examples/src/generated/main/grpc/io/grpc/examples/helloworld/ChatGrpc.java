package io.grpc.examples.helloworld;

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

  public static final String SERVICE_NAME = "helloworld.Chat";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.NickRequest,
      io.grpc.examples.helloworld.StatusResponse> METHOD_SET_NICK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "helloworld.Chat", "SetNick"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.NickRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.StatusResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.NickRequest,
      io.grpc.examples.helloworld.MessageResponse> METHOD_GET_MESSAGES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "helloworld.Chat", "GetMessages"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.NickRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.MessageResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.ChannelRequest,
      io.grpc.examples.helloworld.StatusResponse> METHOD_JOIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "helloworld.Chat", "Join"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.ChannelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.StatusResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.ChannelRequest,
      io.grpc.examples.helloworld.StatusResponse> METHOD_LEAVE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "helloworld.Chat", "Leave"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.ChannelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.StatusResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.SendToRequest,
      io.grpc.examples.helloworld.StatusResponse> METHOD_SEND_TO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "helloworld.Chat", "SendTo"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.SendToRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.StatusResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.SendAllRequest,
      io.grpc.examples.helloworld.StatusResponse> METHOD_SEND_ALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "helloworld.Chat", "SendAll"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.SendAllRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld.StatusResponse.getDefaultInstance()));

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

    public void setNick(io.grpc.examples.helloworld.NickRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver);

    public void getMessages(io.grpc.examples.helloworld.NickRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.MessageResponse> responseObserver);

    public void join(io.grpc.examples.helloworld.ChannelRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver);

    public void leave(io.grpc.examples.helloworld.ChannelRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver);

    public void sendTo(io.grpc.examples.helloworld.SendToRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver);

    public void sendAll(io.grpc.examples.helloworld.SendAllRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver);
  }

  public static interface ChatBlockingClient {

    public io.grpc.examples.helloworld.StatusResponse setNick(io.grpc.examples.helloworld.NickRequest request);

    public io.grpc.examples.helloworld.MessageResponse getMessages(io.grpc.examples.helloworld.NickRequest request);

    public io.grpc.examples.helloworld.StatusResponse join(io.grpc.examples.helloworld.ChannelRequest request);

    public io.grpc.examples.helloworld.StatusResponse leave(io.grpc.examples.helloworld.ChannelRequest request);

    public io.grpc.examples.helloworld.StatusResponse sendTo(io.grpc.examples.helloworld.SendToRequest request);

    public io.grpc.examples.helloworld.StatusResponse sendAll(io.grpc.examples.helloworld.SendAllRequest request);
  }

  public static interface ChatFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.StatusResponse> setNick(
        io.grpc.examples.helloworld.NickRequest request);

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.MessageResponse> getMessages(
        io.grpc.examples.helloworld.NickRequest request);

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.StatusResponse> join(
        io.grpc.examples.helloworld.ChannelRequest request);

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.StatusResponse> leave(
        io.grpc.examples.helloworld.ChannelRequest request);

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.StatusResponse> sendTo(
        io.grpc.examples.helloworld.SendToRequest request);

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.StatusResponse> sendAll(
        io.grpc.examples.helloworld.SendAllRequest request);
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
    public void setNick(io.grpc.examples.helloworld.NickRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_NICK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getMessages(io.grpc.examples.helloworld.NickRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.MessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MESSAGES, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void join(io.grpc.examples.helloworld.ChannelRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void leave(io.grpc.examples.helloworld.ChannelRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void sendTo(io.grpc.examples.helloworld.SendToRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_TO, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void sendAll(io.grpc.examples.helloworld.SendAllRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver) {
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
    public io.grpc.examples.helloworld.StatusResponse setNick(io.grpc.examples.helloworld.NickRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SET_NICK, getCallOptions()), request);
    }

    @java.lang.Override
    public io.grpc.examples.helloworld.MessageResponse getMessages(io.grpc.examples.helloworld.NickRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_GET_MESSAGES, getCallOptions()), request);
    }

    @java.lang.Override
    public io.grpc.examples.helloworld.StatusResponse join(io.grpc.examples.helloworld.ChannelRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request);
    }

    @java.lang.Override
    public io.grpc.examples.helloworld.StatusResponse leave(io.grpc.examples.helloworld.ChannelRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request);
    }

    @java.lang.Override
    public io.grpc.examples.helloworld.StatusResponse sendTo(io.grpc.examples.helloworld.SendToRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEND_TO, getCallOptions()), request);
    }

    @java.lang.Override
    public io.grpc.examples.helloworld.StatusResponse sendAll(io.grpc.examples.helloworld.SendAllRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.StatusResponse> setNick(
        io.grpc.examples.helloworld.NickRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_NICK, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.MessageResponse> getMessages(
        io.grpc.examples.helloworld.NickRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MESSAGES, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.StatusResponse> join(
        io.grpc.examples.helloworld.ChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.StatusResponse> leave(
        io.grpc.examples.helloworld.ChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.StatusResponse> sendTo(
        io.grpc.examples.helloworld.SendToRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_TO, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.StatusResponse> sendAll(
        io.grpc.examples.helloworld.SendAllRequest request) {
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
              io.grpc.examples.helloworld.NickRequest,
              io.grpc.examples.helloworld.StatusResponse>() {
            @java.lang.Override
            public void invoke(
                io.grpc.examples.helloworld.NickRequest request,
                io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver) {
              serviceImpl.setNick(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_GET_MESSAGES,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              io.grpc.examples.helloworld.NickRequest,
              io.grpc.examples.helloworld.MessageResponse>() {
            @java.lang.Override
            public void invoke(
                io.grpc.examples.helloworld.NickRequest request,
                io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.MessageResponse> responseObserver) {
              serviceImpl.getMessages(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_JOIN,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              io.grpc.examples.helloworld.ChannelRequest,
              io.grpc.examples.helloworld.StatusResponse>() {
            @java.lang.Override
            public void invoke(
                io.grpc.examples.helloworld.ChannelRequest request,
                io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver) {
              serviceImpl.join(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_LEAVE,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              io.grpc.examples.helloworld.ChannelRequest,
              io.grpc.examples.helloworld.StatusResponse>() {
            @java.lang.Override
            public void invoke(
                io.grpc.examples.helloworld.ChannelRequest request,
                io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver) {
              serviceImpl.leave(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_SEND_TO,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              io.grpc.examples.helloworld.SendToRequest,
              io.grpc.examples.helloworld.StatusResponse>() {
            @java.lang.Override
            public void invoke(
                io.grpc.examples.helloworld.SendToRequest request,
                io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver) {
              serviceImpl.sendTo(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_SEND_ALL,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              io.grpc.examples.helloworld.SendAllRequest,
              io.grpc.examples.helloworld.StatusResponse>() {
            @java.lang.Override
            public void invoke(
                io.grpc.examples.helloworld.SendAllRequest request,
                io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.StatusResponse> responseObserver) {
              serviceImpl.sendAll(request, responseObserver);
            }
          })).build();
  }
}
