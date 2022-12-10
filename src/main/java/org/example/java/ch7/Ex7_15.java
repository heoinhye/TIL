package org.example.java.ch7;

/*
* 내부 클래스로 선언하면 안 되는 클래스를 내부 클래스로 선언한 경우
* */
public class Ex7_15 {
  public static void main(String[] args){
    //인스턴스 클래스의 인스턴스를 생성하기 위해서는
    //외부 클래스의 인스턴스를 우선 생성
    Outer2 oc = new Outer2();
    Outer2.InstanceInner ii = oc.new InstanceInner();
    System.out.println(ii.iv);

    System.out.println(Outer2.StaticInner.cv);

    Outer2.StaticInner si = new Outer2.StaticInner();
    System.out.println(si.iv);
  }
}

class Outer2 {
  class InstanceInner {
    int iv=100;
  }

  static class StaticInner {
    int iv=200;
    static int cv=300;
  }

  void myMethod() {
    class LocalInner {
      int iv=400;
    }
  }
}

