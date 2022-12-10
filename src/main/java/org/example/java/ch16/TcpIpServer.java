package org.example.java.ch16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* TCP/IP서버 구현하기 (서버)
* */
public class TcpIpServer {

  public static void main(String[] args){
    ServerSocket ss = null;
    int port = 7777;

    try {
      ss = new ServerSocket(port);
      System.out.println(getTime()+" server is ready");
    } catch (IOException e) {
      e.printStackTrace();
    }

    while(true){
      System.out.println(getTime()+" waiting for a client...");

      try {
        Socket socket = ss.accept();
        System.out.println(getTime()+" the client from "+socket.getInetAddress());

        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);

        dos.writeUTF("[notice] test message from server");
        System.out.println(getTime()+" sent data to the client");

        dos.close();
        socket.close();

      } catch (IOException e) {
        e.printStackTrace();
      }

    }

  }

  static String getTime(){ //현재시간을 문자열로 반환하는 함수
    SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
    return sdf.format(new Date());
  }

}
