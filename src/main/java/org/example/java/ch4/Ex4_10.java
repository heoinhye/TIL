package org.example.java.ch4;

public class Ex4_10 {

  public static void main(String[] args){
    int sum=0;

    for(int i=1; i<=5; i++){
      System.out.printf("%d", sum);
      sum+=i;
      System.out.printf(" + %d = %d%n", i, sum);
    }
  }

}
