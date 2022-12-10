package org.example.java.ch7;

public class Ex7_13 {

  InstanceInner iv = new InstanceInner();

  static StaticInner cv = new StaticInner();

  class InstanceInner {
  }

  static class StaticInner {
  }

  //스태틱 메서드
  static void staticMethod() {
    //인스턴스 멤버에 직접 접근 불가
    //InstanceInner obj1 = new InstanceInner();
    
    //인스턴스 멤버에 접근하기 위해서는
    //외부 클래스를 먼저 생성 후 접근 가능
    Ex7_13 outer = new Ex7_13();
    InstanceInner obj1 = outer.new InstanceInner();
    
    StaticInner obj2 = new StaticInner();
  }

  //인스턴스 메서드
  void instanceMethod() {
    InstanceInner obj1 = new InstanceInner();
    StaticInner obj2 = new StaticInner();
  }
  
  void myMethod() {
    //지역 클래스
    class LocalInner {
    }
    LocalInner lv = new LocalInner();
  }

}
