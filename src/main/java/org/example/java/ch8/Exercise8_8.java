package org.example.java.ch8;

public class Exercise8_8 {

  public static void main(String[] args){
    try{
      method1();
      System.out.println();
    } catch (Exception e) {
      System.out.println(7);
    }
  }

  static void method1() {
    try{
      method2();
      System.out.println(1);

    } catch (NullPointerException e) {
      System.out.println(2);
      throw e;

    } catch (Exception e) {
      System.out.println(4);

    } finally {
      System.out.println(4);
    }

    System.out.println(5);
  }

  static void method2() {
    throw new NullPointerException();
  }

}
