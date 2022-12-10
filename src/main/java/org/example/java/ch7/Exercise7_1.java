package org.example.java.ch7;

import java.util.Arrays;

public class Exercise7_1 {
  public static void main(String[] args){
    SutdaDeck deck = new SutdaDeck();
    for(int i=0; i<deck.cards.length; i++){
      System.out.print(deck.cards[i]+",");
    }
  }
}

class SutdaDeck {
  final int CARD_NUM=20;
  SutdaCard[] cards = new SutdaCard[CARD_NUM]; //SutdaCard 인스턴스 생성X. 인스턴스 저장공간 생성O.

  SutdaDeck() {
//    int num=1;
//    for(int i=0; i<cards.length; i++){
//      if(i<=9){
//        if(i==0 || i==2 || i==7){
//          cards[i] = new SutdaCard(i+1, true);
//        } else {
//          cards[i] = new SutdaCard(i+1, false);
//        }
//      } else {
//        cards[i] = new SutdaCard(num, false);
//        num++;
//      }
//    }

    for(int i=0; i<cards.length; i++) {
      int num = i%10+1;
      boolean isKwang = (i < 10) && (num==1||num==3||num==8);
      cards[i] = new SutdaCard(num,isKwang);
    }
  }

  void shuffle() {
    for(int i=0; i<cards.length; i++){
      int idx = (int)(Math.random()*cards.length);
      SutdaCard tmp = cards[idx];
      cards[idx] = cards[i];
      cards[i] = tmp;
    }
    System.out.println(Arrays.toString(cards));
  }

  /*
  매개변수가 있는 메서드는 반드시 작업 전에 유효성검사!
  * */
  SutdaCard pick(int index) {
    //유효성 검사
    if(index < 0 || index >= CARD_NUM) return null;

    return cards[index];
  }

  SutdaCard pick() {
    int idx = (int)(Math.random()*cards.length);
    //return cards[idx];

    return pick(idx);
  }

}//end of SutdaDeck

class SutdaCard {
  int num;
  boolean isKwang;

  SutdaCard() {
    this(1, true);
  }

  SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }

  @Override
  public String toString(){
    return num + (isKwang? "K" : "");
  }
}
