package org.example.java.ch6;

public class Ex6_14 {

  public static void main(String[] args){
    System.out.println("2. Ex6_14 bt =  new Ex6_14(); ");
    Ex6_14 bt = new Ex6_14();

    System.out.println("5. Ex6_14 bt2 = new Ex6_14(); ");
    Ex6_14 bt2 = new Ex6_14();
  }

  public Ex6_14(){
    System.out.println("4. 생성자");
  }

  { System.out.println("3. 인스턴스 초기화 블럭"); }

  static { System.out.println("1. 클래스 초기화 블럭"); }

}

