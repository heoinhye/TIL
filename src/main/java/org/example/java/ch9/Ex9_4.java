package org.example.java.ch9;

public class Ex9_4 {

  public static void main(String[] args){
    Card c1 = new Card();
    Card c2 = new Card();
    //Object클래스의 toString()을 오버라이딩하지 않으면 클래스이름과 16진수의 해시코드를 얻는다.
    System.out.println(c1.toString());
    System.out.println(c2.toString());
  }

}

class Card {
  String kind;
  int number;

  Card() {
    this("SPADE", 1);
  }

  Card(String kind, int number) {
    this.kind = kind;
    this.number = number;
  }

}
