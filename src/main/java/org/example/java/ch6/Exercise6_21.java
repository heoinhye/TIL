package org.example.java.ch6;

public class Exercise6_21 {

  public static void main(String[] args){
    int value=5;
    System.out.printf("%d의 절대값= %d%n", value, abs(value));

    value=-10;
    System.out.printf("%d의 절대값= %d", value, abs(value));
  }

  public static int abs(int value){
//    if(value < 0){
//      value *= -1;
//    }
//    return value;

    return value >= 0 ? value : -value;
  }

}

