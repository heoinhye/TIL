package org.example.java.ch5;

import java.util.Arrays;

/*
* 배열 섞기
* */
public class Ex5_4 {

  public static void main(String[] args){
    int[] numArr = {0,1,2,3,4,4,5,6,7,8,9};
    System.out.println(Arrays.toString(numArr));

    //System.out.println(numArr.length);

    for(int i=0; i<numArr.length; i++){
      int idx = (int)(Math.random()*numArr.length);

      int tmp = numArr[0];
      numArr[0] = numArr[idx];
      numArr[idx] = tmp;
    }

    System.out.println(Arrays.toString(numArr));


  }//end of main

}
