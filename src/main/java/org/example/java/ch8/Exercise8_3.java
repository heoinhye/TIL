package org.example.java.ch8;

public class Exercise8_3 {
  void add(int a, int b) throws InvalidNumberException, NotANumberException {}
}
class NumberException extends Exception {}
class InvalidNumberException extends NumberException {}
class NotANumberException extends NumberException {}

class test extends Exercise8_3{

  //@Override
  //void add(int a, int b) throws InvalidNumberException, NotANumberException { }

  //@Override
  //void add(int a, int b) throws InvalidNumberException { }

  //@Override
  //void add(int a, int b) throws NotANumberException { }


  /* 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다 */

  //@Override
  //void add(int a, int b) throws Exception { }
  //Exception은 모든 예외의 최고 조상
  //가장 많은 개수의 예외를 던질 수 있다.
  //예외의 개수는 적거나 같아야 한다는 조건을
  //만족시키지 못하는 잘못된 오버라이딩

  //@Override
  //void add(int a, int b) throws NumberException { }
}
