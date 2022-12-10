package org.example.java.ch3;

public class Ex3_6 {
  public static void main(String[] args){
    int a=10,b=4;

    System.out.println(a+b); //14

    System.out.println(a-b); //6

    System.out.println(a*b); //40

    //int타입은 소수점을 저장하지 못한다.
    System.out.println(a/b); //2

    //두 피연산자의 타입이 일치하지 않으므로
    //int타입보다 범위가 넓은 float타입으로 자동 형변환된다.
    System.out.println(a/(float)b); //2.5

    System.out.println((float)a/b); //2.5
  }

}
