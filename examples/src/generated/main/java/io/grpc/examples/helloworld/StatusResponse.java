// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_world.proto

package io.grpc.examples.helloworld;

/**
 * Protobuf type {@code helloworld.StatusResponse}
 */
public  final class StatusResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:helloworld.StatusResponse)
    StatusResponseOrBuilder {
  // Use StatusResponse.newBuilder() to construct.
  private StatusResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StatusResponse() {
    status_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StatusResponse(
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
          case 8: {

            status_ = input.readBool();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_StatusResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_StatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.helloworld.StatusResponse.class, io.grpc.examples.helloworld.StatusResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private boolean status_;
  /**
   * <code>optional bool status = 1;</code>
   */
  public boolean getStatus() {
    return status_;
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
    if (status_ != false) {
      output.writeBool(1, status_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, status_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.examples.helloworld.StatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.helloworld.StatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.StatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.helloworld.StatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.StatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.helloworld.StatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.StatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.examples.helloworld.StatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.StatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.helloworld.StatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.examples.helloworld.StatusResponse prototype) {
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
   * Protobuf type {@code helloworld.StatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.StatusResponse)
      io.grpc.examples.helloworld.StatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_StatusResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_StatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.helloworld.StatusResponse.class, io.grpc.examples.helloworld.StatusResponse.Builder.class);
    }

    // Construct using io.grpc.examples.helloworld.StatusResponse.newBuilder()
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
      status_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_StatusResponse_descriptor;
    }

    public io.grpc.examples.helloworld.StatusResponse getDefaultInstanceForType() {
      return io.grpc.examples.helloworld.StatusResponse.getDefaultInstance();
    }

    public io.grpc.examples.helloworld.StatusResponse build() {
      io.grpc.examples.helloworld.StatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.examples.helloworld.StatusResponse buildPartial() {
      io.grpc.examples.helloworld.StatusResponse result = new io.grpc.examples.helloworld.StatusResponse(this);
      result.status_ = status_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.helloworld.StatusResponse) {
        return mergeFrom((io.grpc.examples.helloworld.StatusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.helloworld.StatusResponse other) {
      if (other == io.grpc.examples.helloworld.StatusResponse.getDefaultInstance()) return this;
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
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
      io.grpc.examples.helloworld.StatusResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.helloworld.StatusResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean status_ ;
    /**
     * <code>optional bool status = 1;</code>
     */
    public boolean getStatus() {
      return status_;
    }
    /**
     * <code>optional bool status = 1;</code>
     */
    public Builder setStatus(boolean value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = false;
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


    // @@protoc_insertion_point(builder_scope:helloworld.StatusResponse)
  }

  // @@protoc_insertion_point(class_scope:helloworld.StatusResponse)
  private static final io.grpc.examples.helloworld.StatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.helloworld.StatusResponse();
  }

  public static io.grpc.examples.helloworld.StatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatusResponse>
      PARSER = new com.google.protobuf.AbstractParser<StatusResponse>() {
    public StatusResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new StatusResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<StatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatusResponse> getParserForType() {
    return PARSER;
  }

  public io.grpc.examples.helloworld.StatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

