package org.example.java.ch6;

public class Exercise6_16 {

  public static void main(String[] args){
    String str = "ABC123";
    change(str);
    System.out.println("main()1: "+str); //ABC123

    str = change(str);
    System.out.println("main()2: "+str); //ABC123456
  }

  //매개변수가 참조형이라고 main 메서드의 값도 변경될 것으로 쉽게 생각하지마라.
  public static String change(String str){
    //문자열은 내용을 변경할 수 없다.
    //덧셈연산을 하면 새로운 문자열이 생성되고 새로운 문자열의 주소가 변수에 저장된다.
    //문자열 "ABC123456"은 참조하는 변수가 하나도 없으므로 적절한 시기에 GC에 의해 제거된다.
    str += "456";
    System.out.println("change(): " +str); //ABC123456

    return str;
  }
}
