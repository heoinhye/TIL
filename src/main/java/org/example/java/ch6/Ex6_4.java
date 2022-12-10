package org.example.java.ch6;

public class Ex6_4 {

  public static void main(String[] args){
    
    //4.0의 제곱근 구하기
    //System.out.println(Math.sqrt(4.0)); //2.0

    MyMath mm = new MyMath();
    long result1 = mm.add(5L, 3L);
    long result2 = mm.subtract(5l, 3L);
    long result3 = mm.multiply(5L, 3L);
    double result4 = mm.divide(5l, 3l);
    System.out.printf("%d, %d, %d, %.2f", result1, result2, result3, result4);
  }

}

class MyMath {
  long add(long a, long b) { return a+b; }
  long subtract(long a, long b) { return a-b; }
  long multiply(long a, long b) { return a*b; }
  double divide(double a, double b) { return a/b; }
}