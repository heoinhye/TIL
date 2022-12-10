package org.example.java.ch4;

import java.util.Scanner;

/* 메뉴 선택하기
* */
public class Ex4_18 {

  public static void main(String[] args){
    int menu=0, num=0;

    Scanner s = new Scanner(System.in);
    while(true){

      for(int i=0; i<4; i++){
        System.out.printf("(%d) ", i);

        switch(i){
          case 0:
            System.out.println("프로그램 종료");
            break;
          case 1:
            System.out.println("americano");
            break;
          case 2:
            System.out.println("latte");
            break;
          case 3:
            System.out.println("tea");
            break;
        }
      }//end of for

      System.out.println("번호를 입력하세요");
      String tmp = s.nextLine();
      menu = Integer.parseInt(tmp);

      if(menu == 0){
        System.out.print("프로그램을 종료합니다.");
        break;
      }else if(!(1 <= menu && menu <= 3)){
        System.out.println("잘못된 번호를 입력하셨습니다.");
        continue;
      }

      System.out.println("선택하신 번호는 " + menu +" 입니다.");
      System.out.println(" - - - - - - - - - - - - - - - - -");
      
    }//end of while

  }

}
