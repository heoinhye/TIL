package org.example.java.ch3;

public class Ex3_8 {

  public static void main(String[] args){
    byte a = 10;
    byte b = 30;
    //피연산자의 타입이 int보다 작으면 int로 자동형변환
    System.out.println(a*b);
    //큰 자료형의 값을 작은 자료형의 변수에 저장하려면 명시적형변환
    byte c = (byte) (a*b);
    System.out.println(c);
  }

}
