package org.example.java.ch4;

import java.util.Scanner;

public class Ex4_20 {

  public static void main(String[] args){
    int menu=0, num=0;

    Scanner s = new Scanner(System.in);


    outer: while(true){ //무한반복
      System.out.println("(1) square\n(2) square root\n(3) log\n원하는 메뉴를 선택하세요.(종료:0)>");

      String tmp = s.nextLine();
      menu = Integer.parseInt(tmp);

      if(menu==0){
        System.out.println("프로그램을 종료합니다.");
        break;
      } else if(!(1<=menu && menu<=3)) {
        System.out.println("메뉴를 잘못 선택했습니다.(종료:0)");
        continue;
      }

      for(;;){ //무한반복
        System.out.println("계산할 값을 입력하세요.(계산 종료:0. 전체 종료:99)>");
        tmp = s.nextLine();
        num = Integer.parseInt(tmp);

        if(num==0) break;

        if(num==99) break outer;

        switch (menu){
          case 1:
            System.out.println("result= "+num*num);
            break;
          case 2:
            System.out.println("result= "+Math.sqrt(num));
            break;
          case 3:
            System.out.println("result= "+Math.log(num));
            break;
        }

      }//end of for(;;)


    }//end of outer



  }

}
