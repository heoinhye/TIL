package org.example.java.ch5;

public class Ex5_7 {

  public static void main(String[] args){
    String str = "iloveyou";

    char ch = str.charAt(0);
    System.out.println(ch); //i

    String s = str.substring(1,5);
    System.out.println(s); //love

    char[] chArr = str.toCharArray();
    System.out.println(chArr); //iloveyou

    System.out.println(args.length);


  }

}
