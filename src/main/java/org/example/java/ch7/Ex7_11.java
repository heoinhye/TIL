package org.example.java.ch7;

public class Ex7_11 {
  public static void main(String[] args){
    Child3 c = new Child3();
    c.method1();
    c.method2();
    MyInterface.staticMethod();
    MyInterface2.staticMethod();
  }
}

interface MyInterface {
  void method0();
  default void method1() { System.out.println("method1() in MyInterface"); }
  default void method2() { System.out.println("method2() in MyInterface"); }
  static void staticMethod() { System.out.println("staticMethod() in MyInterface"); }
}

interface MyInterface2 {
  default void method1() { System.out.println("method1() in MyInterface2"); }
  static void staticMethod() { System.out.println("staticMethod() in MyInterface2"); }
}

class Parent3 {
  public void method2() { System.out.println("method2() in Parent3"); }
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
  @Override
  public void method0() { System.out.println("인터페이스의 메서드는 무조건 구현해야한다."); }
  @Override
  public void method1() { System.out.println("method1() in Child3"); } //인터페이스 간 디폴트 메서드 충돌시 오버라이딩
}