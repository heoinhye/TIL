package org.example.java.ch15;

import java.io.*;
import java.nio.channels.FileChannel;

/*
* FileInputStream vs. FileReader
* FileChanel
* */
public class Ex15_8 {

  public static void main(String[] args) {
    String fileName = "123.txt";
    try {

      FileInputStream fis = new FileInputStream(fileName);

      //인코딩, 유니코드 자동 변환
      FileReader fr = new FileReader(fileName);


      int data=0;

      while((data=fis.read())!=-1){
        System.out.println((char)data);
      }
      fis.close();

      while((data=fr.read())!=-1){
        System.out.println((char)data);
      }
      fr.close();

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }


}
