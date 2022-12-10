package org.example.java.ch12;

public class Enum {
  /*
  * 여러 상수를 선언해야 할 때
  *
  * enum 열거형이름 { 상수명1, 상수명2, ... }
  * */

  enum Surname { KIM, YOON }

  public static void main(String[] args){

    //compareEnum();

    //values(): 모든 상수 출력
    Surname[] sArr = Surname.values();
    for(Surname s : sArr){
      System.out.println(s);
    }

    //valueOf(): 문자열에 대한 참조얻기
    Surname s = Surname.valueOf("KIM");
    System.out.println(s);
    System.out.println(Surname.KIM == Surname.valueOf("YOON"));
    System.out.println(Surname.KIM == Surname.valueOf("KIM"));


  }

  static void compareEnum(){
    if(Card1.CLOVER == Card1.TWO){
      System.out.println("사실상 카드 무늬와 숫자는 비교 대상이 아님");
    }

//    if(Card2.Kind.CLOVER ==  Card2.Value.TWO){
//      //컴파일 에러. 상이한 타입. 비교불가.
//    }
  }

}//Enum

class Card1 {
  static final int CLOVER = 0;
  static final int HEART = 1;
  static final int DIAMOND = 2;
  static final int SPADE = 3;

  static final int TWO = 0;
  static final int THREE = 1;
  static final int FOUR = 2;

  final int kind;
  final int num;

  Card1(int kind, int num) {
    this.kind = kind;
    this.num = num;
  }
}//Card1

class Card2 {
  enum Kind { CLOVER, HEART, DIAMOND, SPADE }
  enum Value { TWO, THREE, FOUR }

  final Kind kind;
  final Value value;

  public Card2(Kind kind, Value value) {
    this.kind = kind;
    this.value = value;
  }
}//Card2

class Unit {
  enum Direction { EAST, SOUTH, WEST, NORTH }

  int x,y;
  Direction dir;

  void init(){
    dir = Direction.EAST;
  }

  //상수 비교
  //equals(), ==
  //>, <, compareTo()
  void compare(){
    if(dir == Direction.EAST){
      x++;
    } else if (dir.compareTo(Direction.WEST) > 0 ) {
      //dir > Direction.WEST (에러)
    }
  }//compare()
}//Unit
