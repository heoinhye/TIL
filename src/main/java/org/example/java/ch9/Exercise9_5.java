package org.example.java.ch9;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercise9_5 {

  public static void main(String[] args){
    System.out.println(delChar("(1!2@3#4$5%)", "!@#$%^&*()"));
  }

  static String delChar(String src, String delCh){
//    StringBuffer chBuffer = new StringBuffer(delCh);
//    for(int i=0; i<chBuffer.length(); i++){
//      char ch = chBuffer.charAt(i);
//      int idx = src.indexOf(ch);
//      if(idx != -1){
//        src = src.replace(ch,' ');
//      }
//    }
//    return src;

    StringBuffer sb = new StringBuffer(src.length());
    for(int i=0; i<src.length(); i++){
      char ch = src.charAt(i);

      if(delCh.indexOf(ch)==-1){
        sb.append(ch);
      }
    }

    return sb.toString();
  }//end of delChar

}
