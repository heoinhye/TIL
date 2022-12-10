package org.example.java.ch4;

public class Exercise4_3 {

  public static void main(String[] args){

//    for(int i=0; i<10; i++){
//      for(int j=0; j<10; j++){
//        if(i==j || i>j){
//          System.out.print("*");
//        }
//      }
//      System.out.println();
//    }

    int sum=0;
    int totalSum=0;
    for(int i=1; i<=10; i++){
      System.out.print(sum +"+");
      sum+=i;
      System.out.println(i +"="+ sum);
      totalSum+=sum;
    }
    System.out.println(totalSum);

  }


}
