package org.example.java.ch4;

public class Exercise4_8 {

  public static void main(String[] args){

    int value=0;

    for(int i=0; i<30; i++){
      value=(int)(Math.random()*6)+1;
      System.out.printf("%d ", value);
    }

  }

}
