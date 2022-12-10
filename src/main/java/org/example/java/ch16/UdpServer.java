package org.example.java.ch16;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UdpServer {

  public static void main(String[] args){
    try {
      new UdpServer().start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void start() throws IOException {
    int port=7777;
    DatagramSocket socket = new DatagramSocket(port);
    DatagramPacket in, out;

    byte[] fromMsg = new byte[10];
    byte[] toMsg;

    while(true){
      in = new DatagramPacket(fromMsg, fromMsg.length);
      socket.receive(in);

      InetAddress address = in.getAddress();
      int p = in.getPort();

      SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
      String time = sdf.format(new Date());
      toMsg = time.getBytes();

      out = new DatagramPacket(toMsg, toMsg.length, address, p);
      socket.send(out);
    }
  }

}
