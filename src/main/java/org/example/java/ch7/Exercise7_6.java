package org.example.java.ch7;

public class Exercise7_6 {

  public static void main(String[] args){
    //내부클래스(인스턴스 클래스)의 인스턴스를 생성하기 위해서는
    //외부클래스의 인스턴스를 먼저 생성해야 한다.
    Outer outer = new Outer();
    Outer.Inner oi = outer.new Inner();
    System.out.println(oi.iv);
  }

}

class Outer {

  int value = 10;
  class Inner {
    int iv = 100;
    int value = 20;

    void method1() {
      int value = 30;
      System.out.println(value);
      System.out.println(this.value);
      //System.out.println(new Outer().value);
      System.out.println(Outer.this.value);
    }
  }

  static class StaticInner {
    int iv = 200;
  }
}
