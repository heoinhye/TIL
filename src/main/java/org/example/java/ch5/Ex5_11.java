package org.example.java.ch5;

import java.util.Arrays;

public class Ex5_11 {

  public static void main(String[] args){

    int[] arr1 = {1,2,3};
    int[][] arr2 = {
            {1,2,3},
            {4,5,6}
    };

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.deepToString(arr2));

    int[] arr11 = {1,2,3};
    int[][] arr22 = {
            {1,2,3},
            {4,5,6}
    };

    System.out.println(Arrays.equals(arr1, arr11));
    System.out.println(Arrays.deepEquals(arr2, arr22));

    int[] arr111 = Arrays.copyOf(arr1, arr1.length);
    System.out.println(Arrays.toString(arr111));

    int[] arr3 = {8,3,5,1};
    Arrays.sort(arr3);
    System.out.println(Arrays.toString(arr3));


  }

}
