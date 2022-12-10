package org.example.java.ch9;

import static java.lang.System.out;

public class Ex9_16 {

  public static void main(String[] args){
    int i = 10;

    Integer intg = i;
    Object obj = i;

    Long lng = 100L;

    int i2 = intg + 10;
    long l = intg + lng;

    Integer intg2 = new Integer(20);
    int i3 = intg2;

    Integer intg3 = intg2 +i3;

    out.println(i); //10
    out.println(intg); //10
    out.println(obj); //10

    out.println(lng); //100
    out.println(i2); //20
    out.println(l); //110

    out.println(intg2); //20
    out.println(i3); //20
    out.println(intg3); //40

  }

}
