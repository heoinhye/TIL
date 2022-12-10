package org.example.java.ch6;

public class Ex6_1 {
  public static void main(String[] args){

    Tv t; //Tv클래스 타입의 참조변수 t를 선언. 메모리에 참조변수 t를 위한 공간 할당.

    t = new Tv(); //Tv클래스의 인스턴스가 메모리의 빈 공간에 생성. 인스턴스의 주소값이 t에 저장.

    t.channel = 7;
    t.channelDown();
    System.out.println("현재 채널은 " + t.channel +" 입니다.");
  }
}

class Tv {
  //속성
  String color;
  boolean power;
  int channel;
  
  //기능
  void power(){ power = !power; }
  void chanelUp(){ ++channel; }
  void channelDown(){ --channel; }
}
