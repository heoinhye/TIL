package org.example.java.ch9;

public class Ex9_6 {

  public static void main(String[] args){
    //문자열 리터럴은 이미 존재하는 것을 재사용
    String str1 = "abc";
    String str2 = "abc";
    System.out.println("str1==str2? " + (str1==str2)); //true
    System.out.println("str1.equals(str2)? " + str1.equals(str2)); //true

    //생성자를 이용할 경우 new 연산자에 의해서 메모리할당이 이루어져 새로운 인스턴스 생성
    String str3 = new String("abc");
    String str4 = new String("abc");
    System.out.println("str3==str4? " + (str3==str4)); //false
    System.out.println("str3.equals(str4)? " + str3.equals(str4)); //true
    
  }

}
