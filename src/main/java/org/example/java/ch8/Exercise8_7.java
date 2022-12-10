package org.example.java.ch8;

import java.util.Scanner;

public class Exercise8_7 {

  public static void main(String[] args){
    int answer = (int) (Math.random()*100)+1;
    int input = 0;
    int count = 0;

    do {
      count++;
      System.out.print("1과 100사이의 값을 입력하세요.");

//      input = new Scanner(System.in).nextInt();
//      try {
//        if(input <= 0 || input > 100) {
//          throw new Exception("다시 입력");
//        }
//      } catch (Exception e) {
//        e.printStackTrace();
//      }

      try {
        input = new Scanner(System.in).nextInt();
      } catch(Exception e) {
        System.out.println(" 유효하지 않은 값입니다. 다시 값을 입력해주세요 ");
        continue;
      }

      if(input < answer){
        System.out.println("더 큰 수를 입력하세요.");
      } else if(input > answer) {
        System.out.println("더 작은 수를 입력하세요.");
      } else {
        System.out.println("정답입니다. 시도횟수="+count);
        break;
      }

    } while(true);

  }//end of main()

}
