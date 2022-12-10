package org.example.java.ch3;

public class Ex3_2 {

  public static void main(String[] args){
    int i=5, j=0;
    j=i++;
    System.out.println(i); //6
    System.out.println(j); //5

    i=5;
    j=0;
    j=++i;
    System.out.println(i); //6
    System.out.println(j); //6

  }

}
