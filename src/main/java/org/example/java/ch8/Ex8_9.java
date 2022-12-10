package org.example.java.ch8;

public class Ex8_9 {

  public static void main(String[] args) throws Exception { //메서드에 예외 선언
    method1();
  }

  static void method1() throws Exception { //메서드에 예외 선언
    method2();
  }

  static void method2() throws Exception { //메서드에 예외 선언
    throw new Exception();
  }

}
