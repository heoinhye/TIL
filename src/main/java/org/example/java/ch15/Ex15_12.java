package org.example.java.ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex15_12 {

  public static void main(String[] args){
    String line="";

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("사용중인 인코딩:" + isr.getEncoding());

    try {
      do {
        System.out.println("문잦을 입력하세요. (q:종료)");
        line = br.readLine();
        System.out.println("입력하신 문장: "+line);
      } while (!line.equalsIgnoreCase("q"));


      System.out.println("프로그램을 종료합니다.");
    } catch (IOException e){
    }
  }

}
