package org.example.java.ch5;

public class Ex5_8 {

  public static void main(String[] args){

    int[][] arr = new int[4][3]; //4행 3열의 2차원 배열 score

    int[] arr1 = {1,2,3};
    int[][] arr2 = {
                      {1,2,3},
                      {4,5,6}
                   };


    int[][] score = {
            { 100, 100, 100, 100},
            { 20, 20, 20, 20 },
            { 30, 30, 30, 30 },
            { 40, 40, 40, 40 }
    };

    int sum=0;

    for(int i=0; i<score.length; i++){
      for(int j=0; j<score[i].length; j++){
        System.out.println("score["+i+"]["+j+"]="+score[i][j]);
        sum += score[i][j];
      }
    }

    System.out.println(sum);


  }

}
