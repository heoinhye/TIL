package org.example.java.ch15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 123.txt파일 만들어서 1부터 9까지 입력하기
* */
public class Ex15_6 {

  public static void main(String[] args) {
    String fileName = "123.txt";
    try {
      //기반스트림
      FileOutputStream fos = new FileOutputStream(fileName);

      //크기가 5인 보조스트림
      BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

      for(int i='1'; i<='9'; i++){
        bos.write(i);
      }

      //bos.close();
      //버퍼에 남아있는 데이터가 출력됨

      fos.close();
      //버퍼에 남아있는 데이터가 출력되지 못함

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

}
