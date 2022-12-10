package org.example.java.ch6;

public class Ex6_9 {

  public static void main(String[] args){
    //클래스 메서드는 객체생성없이 호출가능
    System.out.println( MyMath2.add(200L,100L) );
    System.out.println( MyMath2.subtract(200L,100L) );
    System.out.println( MyMath2.multiply(200L,100L) );
    System.out.println( MyMath2.divide(200.0,100.0) );

    //인스턴스 메서드는 객체생성 후 호출가능
    MyMath2 mm = new MyMath2();
    mm.a = 200L;
    mm.b = 100L;
    System.out.println(mm.add());
    System.out.println(mm.subtract());
    System.out.println(mm.multiply());
    System.out.println(mm.divide());
  }
}

class MyMath2 {
  long a,b; //인스턴스 변수
  
  //인스턴스 메서드: 인스턴스 변수만 사용
  long add() { return a+b; }
  long subtract() { return a-b; }
  long multiply() { return a*b; }
  double divide() { return a/b; }
  
  //클래스 메서드: 매겨변수만 사용
  static long add(long a, long b) { return a+b; }
  static long subtract(long a, long b) { return a-b; }
  static long multiply(long a, long b) { return a*b; }
  static double divide(double a, double b) { return a/b; }
}
