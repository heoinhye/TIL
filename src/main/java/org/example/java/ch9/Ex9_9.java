package org.example.java.ch9;

import java.util.Arrays;
import java.util.StringJoiner;

public class Ex9_9 {

  public static void main(String[] args){

    String animals = "dog,cat,bear";
    String[] arr = animals.split(",");
    System.out.println(Arrays.toString(arr)); //[dog, cat, bear]

    String str = String.join("-", arr);
    System.out.println(str); //dog-cat-bear

    //StringJoiner를 사용해서 문자열을 결합할 수 있다.
    StringJoiner sj = new StringJoiner(",","[","]");
    String[] strArr = {"aaa", "bbb", "ccc"};
    for(String st : strArr){
      sj.add(st.toUpperCase());
    }
    System.out.println(sj.toString());

  }

}
