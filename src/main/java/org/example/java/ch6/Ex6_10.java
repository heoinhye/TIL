package org.example.java.ch6;

public class Ex6_10 {
  
  public static void main(String[] args){
    MyMath3 mm = new MyMath3();
    System.out.println("add(3,3)호출=> " + mm.add(3,3));
    System.out.println("add(3L,3)호출=> " + mm.add(3L,3));
    System.out.println("add(3,3L)호출=> " + mm.add(3,3L));
    System.out.println("add(3L,3L)호출=> " + mm.add(3L,3L));

    int[] a = {100,200,300};
    System.out.println(mm.add(a));
  }
  
}

class MyMath3 {
  int add(int a, int b) { System.out.println("int add(int a, in b) "); return a+b;}
  long add(int a, long b) { System.out.println("int add(int a, long b) "); return a+b;}
  long add(long a, int b) { System.out.println("int add(long a, int b) "); return a+b;}
  long add(long a, long b) { System.out.println("int add(long a, long b) "); return a+b;}
  int add(int[] a) {
    System.out.println("int add(int[] a)");
    int result=0;
    for(int i=0; i<a.length; i++){
      result += a[i];
    }
    return result;
  }
}

class TestClass {
  
  int iv; //인스턴스 변수
  static int cv; //클래스 변수
  void instanceMethod() { //인스턴스 메서드
    
  }
  
  void instanceMethod2() { //인스턴스 메서드
    instanceMethod();
    staticMethod();

    System.out.printf("인스턴스 변수=%d, 클래스 변수=%d", iv, cv);
  }
  
  static void staticMethod() { //클래스 메서드
    
  }
  
  static void staticMethod2() { //클래스 메서드
    TestClass tc = new TestClass();
    tc.instanceMethod();
    staticMethod();

    System.out.printf("인스턴스 변수=%d, 클래스 변수=%d", tc.iv, cv);
  }
  
}

