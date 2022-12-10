package org.example.java.ch7;

public class Exercise7_8 {
  public static void main(String[] args){
    Outer outer = new Outer();
    Outer.Inner oi = outer.new Inner();
    oi.method1();
  }
}
