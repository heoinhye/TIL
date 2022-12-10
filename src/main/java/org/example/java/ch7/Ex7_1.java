package org.example.java.ch7;

public class Ex7_1 {
  public static void main(String[] args){
    CaptionTv tv = new CaptionTv();
    tv.channel = 10;
    tv.channelUp(); //11
    System.out.println(tv.channel);

    tv.displayCaption("hello");
    tv.caption=true;
    tv.displayCaption("hi there");
  }
}

class Tv {
  boolean power;
  int channel;

  void power() { power = !power; }
  void channelUp() { ++channel; }
  void channelDown() { --channel; }
}

class CaptionTv extends Tv { //CaptionTv는 Tv이다(상속관계)
  boolean caption; //멤버변수는 기본값으로 초기화

  void displayCaption(String txt) {
    if(caption)
      System.out.println(txt);
  }
}
