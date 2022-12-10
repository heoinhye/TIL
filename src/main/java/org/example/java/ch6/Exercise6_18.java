package org.example.java.ch6;

public class Exercise6_18 {

  public static void main(String[] args){
    String str = "123";
    System.out.println(isNumber(str));

    str = "1234o";
    System.out.println(isNumber(str));
  }

  public static boolean isNumber(String str){
    
    //유효성 검사
    if(str==null || str.equals("")){
      return  false;
    }

    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      //System.out.println(ch);

      if(ch<'0' || '9'<ch){ //!('0'<=ch && ch<='9')
        return false;
      }
    }

    return true;
  }//end of isNumber()

}
