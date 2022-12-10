package org.example.java.ch7;

public class Exercise7_3 {

  public static void main(String[] args){
    Television tv = new Television();
  }

}

class Product {
  int price;
  int bonusPrice;

  Product() {
    //생성자가 정의되어 있기 때문에 기본 생성자가 자동 추가 되지 않음
  }

  Product(int price) {
    this.price=price;
    bonusPrice=(int)(price/10.0);
  }
}

class Television extends Product{

  Television() {
    //조상클래스의 기본 생성자를 호출하는 super()가 자동 추가
  }

//  Television(int price) {
//    super(price);
//  }

  @Override
  public String toString() {
    return "Television";
  }
}

