package org.example.java.ch5;

public class Ex5_6 {

  public static void main(String[] args){

    String[] names = new String[3];
    names[0] = "kim";
    names[1] = "yoon";
    names[2] = "sang";

    String[] names2 = {"kim","yoon","sang"};

    for(int i=0; i<names.length; i++){
      System.out.println("names["+i+"] = " + names[i]);
    }

    //String tmp = names[2];
    names[2] = "lee";

    for(int i=0; i<names.length; i++){
      System.out.println(names[i]);
    }

  }

}
