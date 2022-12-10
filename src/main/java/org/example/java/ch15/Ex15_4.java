package org.example.java.ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex15_4 {

  public static void main(String[] args) throws IOException {

    FileInputStream fis = new FileInputStream(".\\src\\Ex15_4.java");
    int data = 0;
    while( (data=fis.read()) != -1 ){
      char c = (char)data;
      System.out.println(c);
    }

  }

}
