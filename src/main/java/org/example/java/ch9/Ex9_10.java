package org.example.java.ch9;

public class Ex9_10 {

  public static void main(String[] args){
    //숫자 -> 문자열
    int i = 100;
    String str1 = i + "";
    String str2 = String.valueOf(i); //추천

    //문자열 -> 기본형
    int ii = Integer.parseInt(str1);
    int ii2 = Integer.valueOf(str2);
    Integer ii22 = Integer.valueOf(str2);

    int iVal = 100;
    String strVal = String.valueOf(iVal);

    double dVal = 200.0;
    String strVal2 = String.valueOf(dVal);

    //parseInt()사용시 습관적으로 공백제거하기
    double sum = Integer.parseInt("+"+strVal.trim()) + Double.parseDouble(strVal2);
    double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

    System.out.println( String.join("", strVal, "+", strVal2, "=") + sum);
    System.out.println( strVal+"+"+strVal2+"="+sum2 );
  }

}
