package org.example.java.ch9;

public class Ex9_8 {

  public static void main(String[] args){
    //빈 문자열
    char[] cArr = new char[0];
    String s = new String(cArr);
    System.out.println(cArr.length);
    System.out.println(s);

    //String클래스의 생성자
    String str1 = new String("hello");
    System.out.println(str1); //hello

    char[] c = {'h','e','l','l','o'};
    String str2 = new String(c);
    System.out.println(str2); //hello

    StringBuffer sb = new StringBuffer("hello");
    String str3 = new String(sb);
    System.out.println(str3); //hello

    //String클래스 메서드
    String st = "hello";
    String num = "123456";
    char ch = st.charAt(0); //h
    char ch1 = num.charAt(1); //2
    System.out.println(ch);
    System.out.println(ch1);

    int i = num.compareTo("123456");
    int ii = num.compareTo("789");
    int iii = num.compareTo("0");
    System.out.println(i); //0
    System.out.println(ii); //-6
    System.out.println(iii); //1

  }
}
