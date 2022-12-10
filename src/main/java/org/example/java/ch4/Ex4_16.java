package org.example.java.ch4;

/*
* 1부터 몇까지 더해야 100을 안 넘을까?
* */
public class Ex4_16 {

  public static void main(String[] args){
    int sum=0, i=0;

    while(true){
      sum += ++i;
      if(sum > 100){
        break;
      }
    }//end of while
    System.out.printf("i=%d, sum=%d%n", i, sum);

    int s=0;
    for(int num=0; num<i; num++){
      s += num;
    }
    System.out.println(s);
    System.out.println("1부터 " + --i + "까지 더해야 100을 안넘는다.");
  }
}
