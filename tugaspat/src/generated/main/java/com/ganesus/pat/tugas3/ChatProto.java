// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package com.ganesus.pat.tugas3;

public final class ChatProto {
  private ChatProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_tugas3pat_NickRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tugas3pat_NickRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_tugas3pat_ChannelRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tugas3pat_ChannelRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_tugas3pat_SendToRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tugas3pat_SendToRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_tugas3pat_SendAllRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tugas3pat_SendAllRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_tugas3pat_StatusResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tugas3pat_StatusResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_tugas3pat_MessageResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tugas3pat_MessageResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nchat.proto\022\ttugas3pat\"\033\n\013NickRequest\022\014" +
      "\n\004nick\030\001 \001(\t\"/\n\016ChannelRequest\022\017\n\007channe" +
      "l\030\001 \001(\t\022\014\n\004nick\030\002 \001(\t\"?\n\rSendToRequest\022\017" +
      "\n\007message\030\001 \001(\t\022\017\n\007channel\030\002 \001(\t\022\014\n\004nick" +
      "\030\003 \001(\t\"/\n\016SendAllRequest\022\017\n\007message\030\001 \001(" +
      "\t\022\014\n\004nick\030\002 \001(\t\" \n\016StatusResponse\022\016\n\006sta" +
      "tus\030\001 \001(\010\"\"\n\017MessageResponse\022\017\n\007message\030" +
      "\001 \003(\t2\220\003\n\004Chat\022>\n\007SetNick\022\026.tugas3pat.Ni" +
      "ckRequest\032\031.tugas3pat.StatusResponse\"\000\022C" +
      "\n\013GetMessages\022\026.tugas3pat.NickRequest\032\032.",
      "tugas3pat.MessageResponse\"\000\022>\n\004Join\022\031.tu" +
      "gas3pat.ChannelRequest\032\031.tugas3pat.Statu" +
      "sResponse\"\000\022?\n\005Leave\022\031.tugas3pat.Channel" +
      "Request\032\031.tugas3pat.StatusResponse\"\000\022?\n\006" +
      "SendTo\022\030.tugas3pat.SendToRequest\032\031.tugas" +
      "3pat.StatusResponse\"\000\022A\n\007SendAll\022\031.tugas" +
      "3pat.SendAllRequest\032\031.tugas3pat.StatusRe" +
      "sponse\"\000B%\n\026com.ganesus.pat.tugas3B\tChat" +
      "ProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_tugas3pat_NickRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tugas3pat_NickRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tugas3pat_NickRequest_descriptor,
        new java.lang.String[] { "Nick", });
    internal_static_tugas3pat_ChannelRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tugas3pat_ChannelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tugas3pat_ChannelRequest_descriptor,
        new java.lang.String[] { "Channel", "Nick", });
    internal_static_tugas3pat_SendToRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tugas3pat_SendToRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tugas3pat_SendToRequest_descriptor,
        new java.lang.String[] { "Message", "Channel", "Nick", });
    internal_static_tugas3pat_SendAllRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tugas3pat_SendAllRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tugas3pat_SendAllRequest_descriptor,
        new java.lang.String[] { "Message", "Nick", });
    internal_static_tugas3pat_StatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tugas3pat_StatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tugas3pat_StatusResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_tugas3pat_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tugas3pat_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tugas3pat_MessageResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
