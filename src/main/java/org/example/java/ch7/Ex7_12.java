package org.example.java.ch7;

public class Ex7_12 {
  
  public static void main(String[] args){

    //myMethod();
    myMethod2();

    //InstanceInner ii = new InstanceInner();
    //static class InstanceInner
    System.out.println(InstanceInner.CONST);

    //System.out.println(StaticInner.iv);
    StaticInner si = new StaticInner();
    System.out.println(si.iv);
    System.out.println(StaticInner.cv);
  }
  
  void myMethod() {
    //지역 클래스(선언된 영역 내부에서만 사용)
    class LocalInner {
      int iv = 300; //인스턴스 변수
      //static int cv = 300; //클래스 변수 사용불가
      final static int CONST = 300;
    }
  }

  static void myMethod2() {
    //지역 클래스(선언된 영역 내부에서만 사용)
    class LocalInner {
      int iv = 300; //인스턴스 변수
      //static int cv = 300; //클래스 변수 사용불가
      final static int CONST = 300;
    }

    LocalInner li = new LocalInner();
    System.out.println(li.iv);

    System.out.println(LocalInner.CONST);
  }

  //인스턴스 클래스(외부 클래스의 인스턴스멤버와 관련된 작업에 사용)
  class InstanceInner {
    int iv = 100; //인스턴스 변수
    //static int iv = 100; //클래스 변수 사용불가
    final static int CONST = 100;
  }
  
  //스태틱 클래스(외부 클래스의 스태틱멤버와 관련된 작업에 사용)
  static class StaticInner {
    int iv = 200; //인스턴스 변수
    static int cv = 200; //클래스 변수
  }
  
}
