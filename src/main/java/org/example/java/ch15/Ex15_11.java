package org.example.java.ch15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* 파일에서 특정한 문자(열)이 포함한 라인 찾기
* */
public class Ex15_11 {

  public static void main(String[] args){
    String fileName = ".\\src\\main\\java\\org\\example\\java\\ch15\\Ex15_11.java";

    try {
      FileReader fr = new FileReader(fileName);
      BufferedReader br = new BufferedReader(fr);

      String line="";
      for(int i=1; (line=br.readLine())!=null; i++){
        if(line.indexOf(";")!=-1){
          System.out.println(i+":"+line);
        }
      }
      br.close();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }

}
