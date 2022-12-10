package org.example.java.ch4;

public class Exercise4_9 {

  public static void main(String[] args){

    int num=12345;
    int sum=0;

    while(0 < num){

      sum += num%10;

      num = num/10;
    }

    System.out.println(sum);



  }

}
