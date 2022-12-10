package org.example.java.ch9;

public class Ex9_2 {

  public static void main(String[] args){
    Person p1 = new Person(123456789L);
    Person p2 = new Person(123456789L);
    
    //주소가 아닌 내용을 비교
    if(p1.equals(p2))
      System.out.println("같다");
    else 
      System.out.println("다르다");
    
  }
  
}

class Person {
  long id;

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Person)
      return id == ((Person) obj).id;
    else 
      return false;
  }

  public Person(long id) {
    this.id = id;
  }
}
