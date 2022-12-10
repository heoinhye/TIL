package org.example.java.ch6;

public class Ex6_13 {

  public static void main(String[] args){
    Car2 c1 = new Car2();
    Car2 c2 = new Car2("blue");

    System.out.printf("[c1] 색상=%s, 기어종류=%s, 문 개수=%d%n", c1.color, c1.gearType, c1.door);
    System.out.printf("[c2] 색상=%s, 기어종류=%s, 문 개수=%d", c2.color, c2.gearType, c2.door);
  }

}

class Car2{
  String color;
  String gearType;
  int door;

  Car2(){
    this("white", "auto", 2);
  }

  Car2(String color){
    this(color, "auto", 4);
  }

  Car2(String color, String gearType, int door){
    this.color=color;
    this.gearType=gearType;
    this.door=door;
  }
}

