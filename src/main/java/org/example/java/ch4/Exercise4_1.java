package org.example.java.ch4;

public class Exercise4_1 {

  public static void main(String[] args){
    int x=11;
    if(10<x && x<20){
      System.out.println("변수 x는 10보다 크고, 20보다 작다.");
    }

    char ch='x';
    if(!(ch==' ' || ch=='\t')){
      System.out.println("변수 ch는 공백이나 탭이 아니다.");
    } else {
      System.out.println("변수 ch는 공백이나 탭이다.");
    }

    if(ch=='x' || ch=='X'){
      System.out.println("변수 ch는 x 또는 X이다.");
    }






  }

}
