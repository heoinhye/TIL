package org.example.java.ch9;

public class Ex9_3 {

  public static void main(String[] args){
    String str1 = new String("abc");
    String str2 = new String("abc");

    System.out.println(str1.equals(str2));
    //String클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록 오버라이딩되어 있다.
    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
    //Object클래스처럼 주소값을 이용해서 해시코드 생성한다.
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));

  }

}
