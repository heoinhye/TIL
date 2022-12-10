package org.example.java.ch5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5_6 {

  public static void main(String[] args){

    String[] words={"television", "computer", "mouse", "phone"};

    Scanner s = new Scanner(System.in);

    int count = 0;
    for(int i=0; i<words.length; i++){

      char[] question = words[i].toCharArray();
      //System.out.println(question);

      //Arrays.sort(question);

      for(int j=0; j<question.length; j++){
        int idx = (int)(Math.random()*question.length);

        char tmp = ' ';
        tmp = question[j];
        question[j] = question[idx];
        question[idx] = tmp;
      }


      System.out.printf("Q%d. %s의 정답을 입력하세요> ", i+1, new String(question));

      String answer = s.nextLine();

      if(words[i].equals(answer.trim())){
        System.out.println("정답");
        count++;
      } else {
        System.out.println("오답");
      }

    }//end of for

    System.out.println(count +"개를 맞추셨습니다!");


  }

}
