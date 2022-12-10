package org.example.java.ch15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex15_14 {

  public static void main(String[] args){
    String fileName="123.txt";

    PrintStream ps = null;
    FileOutputStream fos = null;

    try {
      fos = new FileOutputStream(fileName);
      ps = new PrintStream(fos);

      //System.setOut(ps);

      System.setErr(ps);

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }

    System.out.println("it will be written in 123.txt");
    System.err.println("err");


  }
}
