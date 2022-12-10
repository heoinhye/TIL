package org.example.java.ch5;

import java.util.Arrays;

/*
* 배열의 최대값과 최소값
* */
public class Ex5_3 {

  public static void main(String[] args){
    int[] score = {79,88,91,33,100,55,95};

    int max = score[0];
    int min = score[0];

    for(int i=0; i<score.length; i++){
      if(max < score[i]){
        max = score[i];
      } else if(min > score[i]){
        min = score[i];
      }
    }
    System.out.printf("최대값=%d, 최소값=%d%n", max, min);


    max=0; min=0;

    Arrays.sort(score);
    System.out.println(Arrays.toString(score));

    max = score[score.length-1];
    min = score[0];
    System.out.printf("최대값=%d, 최소값=%d%n", max, min);


  }//end of main

}
