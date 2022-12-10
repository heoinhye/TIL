package org.example.java.ch4;

import java.util.Scanner;

/*
* 학점관리프로그램
* 98~100점 : A+
* 94~97점  : A
* 90~93점  : A-
* 88~89점  : B+
* 84~87점  : B
* 80~83점  : B-
* */
public class Ex4_5 {

  public static void main(String[] args){
    int score=0;
    char grade=' ', opt='0';

    System.out.println("Enter your score");
    Scanner s = new Scanner(System.in);
    score = s.nextInt();
    System.out.printf("Your score is %d%n", score);

    if(score >= 90) {
      grade='A';

      if(score>=98){
        opt='+';
      } else if(score<94) {
        opt='-';
      }

    } else if(score >= 80) {
      grade='B';

      if(score>=88) {
        opt='+';
      } else if(score<84) {
       opt='-';
      }

    } else {
      grade='C';
    }

    System.out.printf("Your grade is %c%c", grade, opt);

  }

}
