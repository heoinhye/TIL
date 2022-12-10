package org.example.java.ch4;

import java.util.Scanner;

public class Ex4_3 {

  public static void main(String[] args){
    System.out.print("Enter a number");
    Scanner s = new Scanner(System.in);
    int input = s.nextInt();

    if(input==0){
      System.out.println("The number is '0'");
    } else {
      System.out.println("The number is not '0'");
    }

  }
}
