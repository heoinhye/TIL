package org.example.java.ch5;

import java.util.Arrays;

public class Ex5_1 {

  public static void main(String[] args){

    int[] iArr1 = new int[10];
    int[] iArr2 = new int[5];
    int[] iArr3 = {100, 94, 20, 69};
    char[] cArr = {'a', 'b', 'c'};

    for(int i=0; i<iArr1.length; i++){
      iArr1[i] = i+1;
    }

    for(int i=0; i<iArr2.length; i++){
      iArr2[i] = (int)(Math.random()*10)+1;
    }

    System.out.println(Arrays.toString(iArr1));
    System.out.println(Arrays.toString(iArr2));
    System.out.println(cArr);
    System.out.println(Arrays.toString(cArr));
  }


}
