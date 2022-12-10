package org.example.java.ch4;

import java.util.Scanner;

public class Ex4_6 {

  public static void main(String[] args){
    System.out.print("Enter the month number");
    Scanner s = new Scanner(System.in);
    int month = s.nextInt();

    switch(month){
      case 3:
      case 4:
      case 5:
        System.out.println("It is spring.");
        break;
      case 6: case 7: case 8:
        System.out.println("It is summer.");
        break;
      case 9: case 10: case 11:
        System.out.println("It is fall.");
        break;
      default:
        System.out.println("It is winter.");
    }

    if(3<=month && month<=5){
      System.out.println("It is spring!");
    } else if(6<=month && month<=8){
      System.out.println("It is summer!");
    } else if(9<=month && month<11){
      System.out.println("It is fall!");
    } else {
      System.out.println("It is winter!");
    }
  }

}
