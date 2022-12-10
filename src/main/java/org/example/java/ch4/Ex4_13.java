package org.example.java.ch4;

/*
* 1부터 몇 까지 더해야 합이 100을 넘지 않을까?
* */
public class Ex4_13 {

  public static void main(String[] args){
    int num=0;
    int sum=0;

    while(sum <= 100){
      System.out.printf("%d + ",sum);
      sum += ++num;
      System.out.printf("%d = %d%n", num, sum);
    }
    System.out.printf("1부터 %d까지 더하면 100을 넘지 않습니다.", --num);

  }

}
