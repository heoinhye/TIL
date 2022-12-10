package org.example.java.ch9;

public class Ex9_14 {

  public static void main(String[] args){
    Integer i = new Integer(100);
    Integer i2 = new Integer(100);

    System.out.println(i==i2); //false
    //래퍼 클래스들은 모두 equals()메서드를 오버라이딩하고 있어 주소값이 아닌 객체가 가지고 있는 값을 비교
    System.out.println(i.equals(i2)); //true
    System.out.println(i.compareTo(i2)); //0
    System.out.println(i.toString()); //100
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.SIZE);
    System.out.println(Integer.BYTES);
    System.out.println(Integer.TYPE); //int

  }

}
