package org.example.java.ch8;

import java.io.File;

public class Ex8_10 {

  public static void main(String[] args){

    try {
      File file = createFile(args[0]);
      System.out.println(file.getName() + "파일 생성 성공");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }//


  static File createFile(String fileName) throws Exception { //메서드에 예외 선언
    if(fileName==null || fileName.equals("")){
      throw new Exception("파일이름이 유효하지 않음");
    }

    File file = new File(fileName);
    file.createNewFile();
    return file;

  }//end of createFile

}
