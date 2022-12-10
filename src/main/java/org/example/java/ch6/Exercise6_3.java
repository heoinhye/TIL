package org.example.java.ch6;

public class Exercise6_3 {
  public static void main(String[] args){
    Student s = new Student("홍길동", 1, 1, 100, 60, 76);

    System.out.printf("이름=%s, 총점=%d, 평균=%f%n", s.name, s.getTotal(), s.getAverage());
    System.out.println(s.getAverage());
  }
}
