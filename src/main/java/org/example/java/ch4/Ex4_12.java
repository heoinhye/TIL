package org.example.java.ch4;

public class Ex4_12 {

  public static void main(String[] args){
    int i=5;
    System.out.println(i);
    while(i-- != 0){ //i--는 후위형
      System.out.println(" "+i);
    }

    int j=5;
    System.out.println(j);
    while(j != 0){
      j--;
      System.out.println(" "+j);
    }
  }//main()

}
