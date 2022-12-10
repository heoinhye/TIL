package org.example.java.ch8;

public class Ex8_11 {

  public static void main(String[] args){

    try {
      startInstall();
      copyFiles();
      
    } catch (SpaceException e) {
      System.out.println("에러 메시지: " + e.getMessage());
      e.printStackTrace();
      
    } catch (MemoryException e) {
      System.out.println("에러 메시지: " + e.getMessage());
      e.printStackTrace();
      System.gc(); //메모리 늘리기

    } finally {
      deleteTempFiles();

    }
  }//end of main()

  static void startInstall() throws SpaceException, MemoryException {
    if(!enoughSpace()) throw new SpaceException("설치할 공간 부족");
    if(!enoughMemory()) throw new MemoryException("메모리 부족");
  }

  static void copyFiles() { //파일들을 복사
  }

  static void deleteTempFiles() { //임시파일들을 삭제
  }

  static boolean enoughSpace() { //설치하는데 필요한 공간이 있는지 확인
    return false;
  }

  static boolean enoughMemory() { //설치하는데 필요한 메모리 공간이 있는지 확인
    return true;
  }

}

class SpaceException extends Exception {
  SpaceException(String msg){ super(msg); }
}

class MemoryException extends Exception {
  MemoryException(String msg){ super(msg); }
}