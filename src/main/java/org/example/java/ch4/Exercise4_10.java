package org.example.java.ch4;

import java.util.Scanner;

public class Exercise4_10 {

  public static void main(String[] args){
    int answer = (int)(Math.random()*100)+1;
    int input=0, count=0;

    System.out.println(answer);

    Scanner s = new Scanner(System.in);

    do{
      count++;
      System.out.print("1과 100사이의 값을 입력하세요.");

      input = s.nextInt();

      if(input < answer){
        System.out.println("더 큰 수를 입력하세요.");

      } else if(input > answer) {
        System.out.println("더 작은 수를 입력하세요.");

      } else if(input == answer){
        System.out.println("정답!");
        break;
      }

    } while(true);

    System.out.println(count +"번 만에 맞추셨네요!");

  }//end of main

}
