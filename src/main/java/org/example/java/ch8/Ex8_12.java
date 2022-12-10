package org.example.java.ch8;

public class Ex8_12 {

  public static void main(String[] args){

    try {
      method1();
    } catch (Exception e) {
      System.out.println("main()에서 예외가 처리되었습니다.");
    }

  }

  static void method1() throws Exception {
    try {
      throw new Exception();
    } catch (Exception e) {
      System.out.println("method1()에서 예외가 처리되었습니다.");
      throw e;
    }
  }

  static int method2() {
    try{
      System.out.println("method2()가 호출되었습니다.");
      return 0;
    } catch (Exception e) {
      e.printStackTrace();
      return 1; //반환값이 있을 경우 catch블럭 내에도 return문이 필요.
    } finally {
      System.out.println("method2()의 finally블럭이 실행되었습니다.");
    }
  }

}
