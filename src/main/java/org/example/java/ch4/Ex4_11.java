package org.example.java.ch4;

/*
별 찍기
* */
public class Ex4_11 {

  public static void main(String[] args){
    /*
     **********
     **********
     **********
     **********
     **********
    */
    for(int i=0; i<5; i++){
      for(int j=0; j<10; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    /*
     *
     **
     ***
     ****
    */
    for(int i=1; i<5; i++){
      for(int j=0; j<i; j++){
        System.out.print("*");
      }
      System.out.println();
    }




  }//main()

}
