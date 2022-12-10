package org.example.java.ch8;

public class Exercise8_4 {

  public static void main(String[] args){
    method(true);
    method(false);
  }

  static void method(boolean b){
    try{
      System.out.println(1);
      if(b) throw new ArithmeticException();
      System.out.println(2);

    } catch (RuntimeException e) {
      System.out.println(3);
      return;

    } catch (Exception e) {
      System.out.println(4);
      return;

    } finally {
      System.out.println(5);
    }

    //예외가 발생하지 않을 경우
    System.out.println(6);
  }

}
