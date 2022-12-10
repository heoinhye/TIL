package org.example.java.ch7;

public class Exercise7_7 {

  public static void main(String[] args){
    //내부클래스(스태틱 클래스)의 인스턴스는
    //외부클래스의 인스턴스를 먼저 생성하지 않아도 된다.
    Outer.StaticInner si = new Outer.StaticInner();
    System.out.println(si.iv);
  }

}

