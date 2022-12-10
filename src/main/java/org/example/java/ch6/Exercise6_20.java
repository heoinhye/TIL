package org.example.java.ch6;

import java.util.Arrays;

public class Exercise6_20 {

  public static void main(String[] args){
    int[] data = { 3,2,9,4,7 };
    System.out.println(Arrays.toString(data));
    System.out.println(max(data));
    System.out.println(max(null));
    System.out.println(max(new int[] {}));
  }

  public static int max(int[] arr){
    if(arr==null || arr.length==0){
      return -999999;
    }

    Arrays.sort(arr);
    int max = arr[arr.length-1];
    return max;

  }

}
