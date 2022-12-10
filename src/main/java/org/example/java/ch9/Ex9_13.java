package org.example.java.ch9;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Ex9_13 {

  public static void main(String[] args){
    double val = 90.7552;
    out.println(round(val)); //91

    val *= 100;
    out.println(round(val)); //9076

    out.println(round(val)/100); //90
    out.println(round(val)/100.0); //90.76

    out.println();

    out.println(ceil(1.1)); //2.0
    out.println(floor(1.5)); //1.0
    out.println(round(1.1)); //1
    out.println(round(1.5)); //2
    out.println(rint(1.5)); //2.0
    out.println(round(-1.5)); //-1
    out.println(rint(-1.5)); //-2.0
    out.println(ceil(-1.5)); //-1.0
    out.println(floor(-1.5)); //-2.0

  }

}
