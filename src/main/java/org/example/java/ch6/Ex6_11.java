package org.example.java.ch6;

public class Ex6_11 {

  public static void main(String[] args){
    Data_1 d1 = new Data_1();
    //Data_2 d2 = new Data_2(); 기본 생성자 없음
    Data_2 d3 = new Data_2(2);
  }

}

class Data_1{
  int value;
  //기본 생성자가 컴파일러에 의해 추가됨(클래스 내 생성자가 하나도 없을 경우)
}

class Data_2{
  int value;
  Data_2(int x){ value=x; }
}
