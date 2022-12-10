package org.example.java.ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/*
* 3개의 기반스트림(ByteArrayInputStream)을 하나의 스트림으로 다루기
* */
public class Ex15_7 {

  public static void main(String[] args){
    byte[] arr1 = {0,1,2};
    byte[] arr2 = {3,4,5};
    byte[] arr3 = {6,7,8};
    byte[] outSrc = {};

    Vector v = new Vector();
    v.add(new ByteArrayInputStream(arr1));
    v.add(new ByteArrayInputStream(arr2));
    v.add(new ByteArrayInputStream(arr3));

    //여러개의 입력스트림을 연결
    SequenceInputStream input = new SequenceInputStream(v.elements());

    ByteArrayOutputStream output = new ByteArrayOutputStream();

    int data=0;

    try {
      while( (data=input.read()) != -1 ){
        output.write(data);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    outSrc = output.toByteArray();

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(arr3));
    System.out.println(Arrays.toString(outSrc));

  }//end of main

}
