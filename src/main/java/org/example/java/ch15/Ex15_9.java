package org.example.java.ch15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
* 파일의 공백을 모두 없애기
* */
public class Ex15_9 {

  public static void main(String[] args){

    try {
      FileReader fr = new FileReader(args[0]);
      FileWriter fw = new FileWriter(args[1]);

      int data=0;

      while((data=fr.read()) != -1){
        if(data != '\t' && data != '\n' && data != '\r'){
          fw.write(data);
        }
      }

      fr.close();
      fw.close();

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }//end of main

}
