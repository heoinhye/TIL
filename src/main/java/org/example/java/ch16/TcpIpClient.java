package org.example.java.ch16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/*
 * TCP/IP서버 구현하기 (클라)
 * */
public class TcpIpClient {

  public static void main(String args[]){

    String serverIp="127.0.0.1";
    int serverPort=7777;

    System.out.println("connecting to the server...");

    try {
      Socket socket = new Socket(serverIp, serverPort);

      InputStream in = socket.getInputStream();
      DataInputStream dis = new DataInputStream(in);

      System.out.println("messages from the server: "+dis.readUTF());
      System.out.println("disconnecting.....");

      dis.close();
      socket.close();
      System.out.println("disconnected!");
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

}
