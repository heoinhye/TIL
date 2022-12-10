package org.example.java.ch5;

/*
* 로또번호 생성기(1~45)
* */

import java.util.Arrays;

public class Ex5_5 {

  public static void main(String[] args){

    int[] ball = new int[45];

    for(int i=0; i<ball.length; i++){
      ball[i] = i+1;
    }

    int tmp=0,idx=0;

    for(int i=0; i<6; i++){
      idx = (int)(Math.random()*45); //0~44
      tmp = ball[i];
      ball[i] = ball[idx];
      ball[idx] = tmp;
    }

    System.out.println(Arrays.toString(ball));

    for(int i=0; i<6; i++){
      System.out.print(ball[i]+" ");
    }

    /* if i were you */

    int[] b = new int[45];
    for(int i=0; i<b.length; i++){
      b[i]=i+1;
    }

    for(int i=0; i<6; i++){
      int j = (int)(Math.random()*45)+1;
      System.out.print(b[j]+" ");
    }



  }//end of main

}
