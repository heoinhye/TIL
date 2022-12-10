package org.example.java.ch15;

import java.io.*;
import java.util.Arrays;

/*
* 바이트 배열 inSrc의 값을 outSrc로 복사하기
* */
public class Ex15_1 {

  public static void main(String[] args){
    byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
    byte[] outSrc = {};

    ByteArrayInputStream input = null;
    ByteArrayOutputStream output = null;

    input = new ByteArrayInputStream(inSrc);
    output = new ByteArrayOutputStream();

    int data = 0;

    while( (data=input.read()) != -1 ){
      output.write(data);
    }

    outSrc = output.toByteArray();

    System.out.println(Arrays.toString(inSrc));
    System.out.println(Arrays.toString(outSrc));

  }//end of main

}

class Ex15 {

  void stream() {

    try {
      //바이트기반 스트림
      FileInputStream fis = new FileInputStream("test.txt");
      BufferedInputStream bis = new BufferedInputStream(fis); //버퍼를 이용한 보조 스트림 사용 권장
      bis.read();
      bis.close();
      fis.close();

      //문자기반 스트림
      FileReader fr = new FileReader("test.txt");
      BufferedReader br = new BufferedReader(fr); //버퍼를 이용한 보조 스트림 사용 권장
      br.read();
      br.close();
      fr.close();

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

}