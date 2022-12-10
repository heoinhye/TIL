package org.example.java.ch15;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Ex15_10 {

  public static void main(String[] args){
    String inputData = "ABCD";
    StringReader sr = new StringReader(inputData);
    StringWriter sw = new StringWriter();

    int data=0;


    try {
      while ((data=sr.read()) != -1) {
        sw.write(data);
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    System.out.println(sw.toString());

  }

}
