package org.example.java.ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex15_2 {

  public static void main(String[] args){
    byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
    byte[] outSrc = {};
    byte[] temp = new byte[10];

    ByteArrayInputStream input = null;
    ByteArrayOutputStream output = null;

    input = new ByteArrayInputStream(inSrc);
    output = new ByteArrayOutputStream();

    //input.read(temp, 0, temp.length);
    output.write(inSrc, 5, 5);

    outSrc = output.toByteArray();

    System.out.println(Arrays.toString(inSrc)); //0,1,2,3,4,5,6,7,8,9
    System.out.println(Arrays.toString(outSrc)); //5,6,7,8,9
    System.out.println(Arrays.toString(temp)); //0,1,2,3,4,5,6,7,8,9


  }

}
