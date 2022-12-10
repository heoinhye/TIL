package org.example.java.ch7;

public class Exercise7_2 {
  public static void main(String[] args){

    SutdaDeck deck = new SutdaDeck();
    deck.shuffle();

    System.out.println(deck.pick(0));
    System.out.println(deck.pick());
  }

}
