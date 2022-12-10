package org.example.java.ch4;

public class Exercise4_7 {

  public static void main(String[] args){

    String str="12345";
    int sum=0;

    //System.out.println(str.length());

    for(int i=0; i<str.length(); i++){

      int num = str.charAt(i)-'0';

      sum += num;

    }

    System.out.println(sum);




  }

}
