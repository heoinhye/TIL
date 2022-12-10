package org.example.java.ch5;

import java.util.Scanner;

public class Ex5_10 {

  public static void main(String[] args){

    String[][] words = {
            {"chair", "의자"},
            {"desk", "책상"},
            {"integer", "정수"}
    };

    Scanner s = new Scanner(System.in);

    for(int i=0; i<words.length; i++){
      System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

      String tmp = s.nextLine();
      if(tmp.equals(words[i][1])){
        System.out.println("정답!");
      } else {
        System.out.println("실패!");
      }
    }



  }

}
