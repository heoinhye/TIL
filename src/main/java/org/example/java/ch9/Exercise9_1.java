package org.example.java.ch9;

public class Exercise9_1 {

  public static void main(String[] args){
    SutdaCard c1 = new SutdaCard(3, true);
    SutdaCard c2 = new SutdaCard(3, true);

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c1.equals(c2));
  }

}

class SutdaCard {
  int num;
  boolean isKwang;

  public SutdaCard() {
    this(1, true);
  }

  public SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof SutdaCard){
//      if( ((SutdaCard) obj).num == this.num &&  ((SutdaCard) obj).isKwang == this.isKwang )
//        return true;

      SutdaCard c = (SutdaCard)obj;
      return c.num==num && c.isKwang==isKwang;
    }
    return false;
  }

  @Override
  public String toString() {
    return num + (isKwang? "K" : "");
  }
}
