package org.example.java.ch6;

import java.awt.image.CropImageFilter;

public class Ex6_3 {

  public static void main(String[] args){

    Tv[] tvArr1 = new Tv[3];

    for(int i=0; i<tvArr1.length; i++){
      tvArr1[i] = new Tv(); //객체 생성
    }

    System.out.printf("너비=%d, 높이=%d%n", Card.width, Card.height);

    Card c1 = new Card();
    c1.kind = "heart";
    c1.number = 7;
    //c1.width = 200;
    Card.width = 300;

    Card c2 = new Card();
    c2.kind = "Spade";
    c2.number = 4;

    System.out.printf("[c1] 숫자=%d, 종류=%s, 너비=%d, 높이=%d%n", c1.number, c1.kind, c1.width, c1.height);
    System.out.printf("[c2] 숫자=%d, 종류=%s, 너비=%d, 높이=%d%n", c2.number, c2.kind, c2.width, c2.height);

  }

}

class Card {
  String kind;
  int number;
  static int width=100;
  static int height=250;
}
