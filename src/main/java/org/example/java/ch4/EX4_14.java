package org.example.java.ch4;

import java.util.Scanner;

/*
* 각 자리의 합을 구하는 코드
* */
public class EX4_14 {

  public static void main(String[] args){
    int num=0, sum=0;

    System.out.print("숫자를 입력하세요(예;12345)>");
    Scanner s = new Scanner(System.in);
    String tmp = s.nextLine();
    num = Integer.parseInt(tmp);

    while(num != 0){
      sum += num%10;
      System.out.printf("sum=%d, num=%d%n", sum, num);
      num /= 10;
    }

    System.out.println("각 자리수의 합="+sum);

  }//main()

}
