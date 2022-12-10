package org.example.java.ch4;

import java.util.Scanner;

public class Ex4_4 {

  public static void main(String[] args){
    int score=0;
    char grade=' ';

    System.out.print("Enter your score");
    Scanner s = new Scanner(System.in);
    score = s.nextInt();

    if(score >= 90){
      grade='A';
    } else if(score >= 80){ //score >= 80 && score < 90
      grade='B';
    } else if(score >= 70){ //score >=70 && score < 80
      grade='C';
    } else {
      grade='D';
    }
    System.out.println("Your grade is "+grade);
  }
}
