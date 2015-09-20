// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_world.proto

package io.grpc.examples.helloworld;

/**
 * Protobuf type {@code helloworld.MessageResponse}
 */
public  final class MessageResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:helloworld.MessageResponse)
    MessageResponseOrBuilder {
  // Use MessageResponse.newBuilder() to construct.
  private MessageResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MessageResponse() {
    message_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MessageResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              message_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            message_.add(s);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        message_ = message_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_MessageResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_MessageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.helloworld.MessageResponse.class, io.grpc.examples.helloworld.MessageResponse.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList message_;
  /**
   * <code>repeated string message = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMessageList() {
    return message_;
  }
  /**
   * <code>repeated string message = 1;</code>
   */
  public int getMessageCount() {
    return message_.size();
  }
  /**
   * <code>repeated string message = 1;</code>
   */
  public java.lang.String getMessage(int index) {
    return message_.get(index);
  }
  /**
   * <code>repeated string message = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes(int index) {
    return message_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < message_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, message_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < message_.size(); i++) {
        dataSize += computeStringSizeNoTag(message_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMessageList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.examples.helloworld.MessageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.helloworld.MessageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.MessageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.helloworld.MessageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.MessageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.helloworld.MessageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.MessageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.examples.helloworld.MessageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.MessageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.helloworld.MessageResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.examples.helloworld.MessageResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code helloworld.MessageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.MessageResponse)
      io.grpc.examples.helloworld.MessageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_MessageResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_MessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.helloworld.MessageResponse.class, io.grpc.examples.helloworld.MessageResponse.Builder.class);
    }

    // Construct using io.grpc.examples.helloworld.MessageResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      message_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_MessageResponse_descriptor;
    }

    public io.grpc.examples.helloworld.MessageResponse getDefaultInstanceForType() {
      return io.grpc.examples.helloworld.MessageResponse.getDefaultInstance();
    }

    public io.grpc.examples.helloworld.MessageResponse build() {
      io.grpc.examples.helloworld.MessageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.examples.helloworld.MessageResponse buildPartial() {
      io.grpc.examples.helloworld.MessageResponse result = new io.grpc.examples.helloworld.MessageResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        message_ = message_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.message_ = message_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.helloworld.MessageResponse) {
        return mergeFrom((io.grpc.examples.helloworld.MessageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.helloworld.MessageResponse other) {
      if (other == io.grpc.examples.helloworld.MessageResponse.getDefaultInstance()) return this;
      if (!other.message_.isEmpty()) {
        if (message_.isEmpty()) {
          message_ = other.message_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMessageIsMutable();
          message_.addAll(other.message_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.examples.helloworld.MessageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.helloworld.MessageResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList message_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMessageIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        message_ = new com.google.protobuf.LazyStringArrayList(message_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string message = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMessageList() {
      return message_.getUnmodifiableView();
    }
    /**
     * <code>repeated string message = 1;</code>
     */
    public int getMessageCount() {
      return message_.size();
    }
    /**
     * <code>repeated string message = 1;</code>
     */
    public java.lang.String getMessage(int index) {
      return message_.get(index);
    }
    /**
     * <code>repeated string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes(int index) {
      return message_.getByteString(index);
    }
    /**
     * <code>repeated string message = 1;</code>
     */
    public Builder setMessage(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessageIsMutable();
      message_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message = 1;</code>
     */
    public Builder addMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessageIsMutable();
      message_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message = 1;</code>
     */
    public Builder addAllMessage(
        java.lang.Iterable<java.lang.String> values) {
      ensureMessageIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, message_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message = 1;</code>
     */
    public Builder clearMessage() {
      message_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message = 1;</code>
     */
    public Builder addMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMessageIsMutable();
      message_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:helloworld.MessageResponse)
  }

  // @@protoc_insertion_point(class_scope:helloworld.MessageResponse)
  private static final io.grpc.examples.helloworld.MessageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.helloworld.MessageResponse();
  }

  public static io.grpc.examples.helloworld.MessageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessageResponse>
      PARSER = new com.google.protobuf.AbstractParser<MessageResponse>() {
    public MessageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new MessageResponse(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<MessageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageResponse> getParserForType() {
    return PARSER;
  }

  public io.grpc.examples.helloworld.MessageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
