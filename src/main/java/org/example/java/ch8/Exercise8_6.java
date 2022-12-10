package org.example.java.ch8;

public class Exercise8_6 {

  public static void main(String[] args){
    method(true);
    method(false);
  }

  static void method(boolean b){
    try {
      System.out.println(1);
      if(b) System.exit(0); //프로그램 즉시 종료
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

    System.out.println(6);
  }

}
