package org.example.java.ch16;

import java.io.IOException;
import java.net.*;

public class UdpClient {

  public static void main(String[] args){
    try {
      new UdpClient().start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void start() throws IOException {
    String host = "127.0.0.1";
    int port = 7777;

    DatagramSocket socket = new DatagramSocket();
    InetAddress serverAddress = InetAddress.getByName(host);

    byte[] msg = new byte[100];

    DatagramPacket out = new DatagramPacket(msg, 1, serverAddress, port);
    DatagramPacket in = new DatagramPacket(msg, msg.length);

    socket.send(out);
    socket.receive(in);

    System.out.println(new String(in.getData()));

    socket.close();
  }

}
