package org.example.java.ch9;

import static java.lang.System.out;

public class Ex9_15 {

  public static void main(String[] args){

    //문자열 -> 숫자
    int i1 = new Integer("100").intValue();
    int i2 = Integer.parseInt("100");
    int i3 = Integer.valueOf("100");

    int i4 = Integer.parseInt("100", 2);
    int i5 = Integer.parseInt("100", 8);
    int i6 = Integer.parseInt("100", 16);
    int i7 = Integer.parseInt("FF", 16);

    Integer i8 = Integer.valueOf("100", 2);
    Integer i9 = Integer.valueOf("100", 8);
    Integer i10 = Integer.valueOf("100", 16);
    Integer i11 = Integer.valueOf("FF", 16);

    out.println(i1); //100
    out.println(i2); //100
    out.println(i3); //100
    out.println(i4); //4
    out.println(i5); //64
    out.println(i6); //256
    out.println(i7); //255
    out.println(i8); //4
    out.println(i9); //64
    out.println(i10); //256
    out.println(i11); //255


  }
}
