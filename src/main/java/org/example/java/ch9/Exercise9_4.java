package org.example.java.ch9;

public class Exercise9_4 {

  public static void main(String[] args){
    System.out.println(contains("12345", "23"));
    System.out.println(contains("12345", "67"));
  }

  static boolean contains(String src, String target){
    //return src.contains(target)? true : false;
    return src.indexOf(target) != -1;
  }

}
