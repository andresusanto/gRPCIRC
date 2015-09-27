/*
 * ANDRE SUSANTO - 13512028
 * Code modified from gprc examples
 *
 */

package com.ganesus.pat.tugas3;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IRCClient {
  private static final Logger logger = Logger.getLogger(IRCClient.class.getName());

  private final ManagedChannel channel;
  private final ChatGrpc.ChatBlockingStub blockingStub;

  public IRCClient(String host, int port) {
    channel = ManagedChannelBuilder.forAddress(host, port)
        .usePlaintext(true)
        .build();
    blockingStub = ChatGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }


}
