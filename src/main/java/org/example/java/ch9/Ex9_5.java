package org.example.java.ch9;

public class Ex9_5 {

  public static void main(String[] args){
    Card2 c1 = new Card2();
    Card2 c2 = new Card2("HEART", 2);
    //Object클래스의 toString()을 오버라이딩하지 않으면 클래스이름과 16진수의 해시코드를 얻는다.
    System.out.println(c1.toString());
    System.out.println(c2.toString());
  }

}

class Card2 {
  String kind;
  int number;

  Card2() {
    this("SPADE", 1);
  }

  Card2(String kind, int number) {
    this.kind = kind;
    this.number = number;
  }

  @Override
  public String toString() {
    return "Card2{" +
            "kind='" + kind + '\'' +
            ", number=" + number +
            '}';
  }
}
