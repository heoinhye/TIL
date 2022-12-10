package org.example.java.ch6;

public class Ex6_12 {
  public static void main(String[] args){
    Car c1 = new Car();
    c1.color="white";
    c1.gearType="auto";
    c1.door=4;

    Car c2 = new Car("black", "auto", 2);

    System.out.printf("[c1] 색상=%s, 기어종류=%s, 문 개수=%d%n", c1.color, c1.gearType, c1.door);
    System.out.printf("[c2] 색상=%s, 기어종류=%s, 문 개수=%d", c2.color, c2.gearType, c2.door);
  }
}

class Car{

  String color; //인스턴스 변수
  String gearType; //인스턴스 변수
  int door; //인스턴스 변수

  Car(){

  }

  Car(String c, String g, int d){
    color=c; //생성자의 매개변수로 선언된 지역변수 c의 값을 인스턴스 변수 color에 저장
    gearType=g;
    door=d;
  }
}