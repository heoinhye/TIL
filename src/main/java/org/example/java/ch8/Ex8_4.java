package org.example.java.ch8;

public class Ex8_4 {

  public static void main(String[] args){
    System.out.println(1);
    System.out.println(2);

    try {
      System.out.println(3);
      System.out.println(0/0); //발생한 예외에 해당하는 클래스의 인스턴스가 생성됨
      System.out.println(4);

    }catch (ArithmeticException e){
      if(e instanceof ArithmeticException)
        System.out.println("true");

      System.out.println("ArithmeticException");

    }catch (Exception e){
      System.out.println("Exception");

    }
    System.out.println(6);
  }

}
