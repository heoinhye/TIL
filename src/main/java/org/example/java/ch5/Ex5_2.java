package org.example.java.ch5;

/*
* 배열의 총합과 평균 구하기 
* */
public class Ex5_2 {

  public static void main(String[] args){
    int sum=0;
    float average=0f;

    int[] score = {100,88,100,100,90};

    for(int i=0; i<score.length;i++){
      sum += score[i];
    }

    average = sum/(float)score.length;

    System.out.printf("총합=%d, 평균=%f", sum, average);

  }


}
