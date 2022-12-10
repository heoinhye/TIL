package org.example.java.ch9;

public class Ex9_11 {

  public static void main(String[] args){

    //StringBuffer클래스는 equals()메서드를 오버라이딩 하지 않는다.
    StringBuffer sb = new StringBuffer("abc");
    StringBuffer sb2 = new StringBuffer("abc");

    System.out.println("sb==sb2? " + (sb==sb2)); //false
    System.out.println("sb.equals(sb2)? " + sb.equals(sb2)); //false

    //String클래스는 equals()메서드를 오버라이딩 한다.
    String s = sb.toString();
    String s2 = sb2.toString();
    System.out.println("s.equals(s2)? " + s.equals(s2)); //true

  }

}
