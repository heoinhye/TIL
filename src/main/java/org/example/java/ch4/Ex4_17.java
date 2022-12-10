package org.example.java.ch4;

/*
* 1~10의 숫자 중에서 3의 배수는 제외하고 출력하기
* */
public class Ex4_17 {

  public static void main(String[] args){

    for(int i=0; i<=10; i++){
      if(i%3==0){
        continue;
      }
      System.out.printf("%d ",i);
    }
    System.out.println();

    int i=0;
    while(i<=10){
      if(i%3==0){
        i++;
        continue;
      }
      System.out.printf("%d ", i);
      i++;
    }
    System.out.println();

    int num=0;
    do {

      if(num%3==0){
        num++;
        continue;
      }

      System.out.printf("%d ", num);
      num++;
    } while(num<=10);




  }

}
