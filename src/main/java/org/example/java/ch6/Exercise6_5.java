package org.example.java.ch6;

public class Exercise6_5 {
  
  public static void main(String[] args){
    PlayingCard card = new PlayingCard(1,1);
    System.out.println("클래스변수= width, height");
    System.out.println("인스턴스변수= kind, num");
    System.out.println("지역변수= args, card, k, n");
  }
  
}

class PlayingCard{
  //멤버변수
  int kind; //인스턴스 변수
  int num;  //인스턴스 변수
  
  static int width; //클래스 변수
  static int height; //클래스 변수
  
  PlayingCard(int k, int n){ //생성자
    kind=k;
    num=n;
  }
  
}
