package org.example.java.ch4;

public class Exercise4_6 {

  public static void main(String[] args){

    int x = (int)(Math.random()*6)+1;
    int y = (int)(Math.random()*6)+1;

    for(int i=1; i<=6; i++){
      for(int j=1; j<=6; j++){

        int sum = i+j;

        if(sum==6){
          System.out.printf("%d, %d %n", i, j);
        }

      }
    }



  }

}
