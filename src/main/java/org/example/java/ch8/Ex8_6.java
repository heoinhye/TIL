package org.example.java.ch8;

public class Ex8_6 {

  public static void main(String[] args){

    try {
//      Exception e =  new Exception("고의로 발생");
//      throw e;

      throw new Exception("고의로 발생"); //생성자에 String을 넣어주면 메시지로 저장됨

    } catch (Exception ex) {
      System.out.println(ex.getMessage());
      ex.printStackTrace();

    }

    System.out.println("프로그램 종료");
  }

}
