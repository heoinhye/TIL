package org.example.java.ch7;

public class Ex7_14 {

  private int outerIv = 0;
  static int outerCv = 0;

  //인스턴스 클래스(내부 클래스)
  class InstanceInner {
    int iiv = outerIv;
    int iiv2 = outerCv;
  }

  //스태틱 클래스(내부 클래스)
  static class StaticInner {
    //외부 클래스의 인스턴스 멤버에 접근 불가
    //int siv = outerIv;

    static int scv = outerCv;
  }

  void myMethod() {
    int lv = 0;
    final int LV = 0;

    //지역 클래스(내부 클래스)
    class LocalInner {
      int liv = outerIv; //외부 클래스의 인스턴스 변수를 지역 클래스의 인스턴스 변수로
      int liv2 = outerCv; //외부 클래스의 클래스 변수를 지역 클래스의 인스턴스 변수로
      int liv3 = lv;
      int liv4 = LV;
    }

  }//end of myMethod()

}
