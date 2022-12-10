package org.example.java.ch4;

public class Exercise4_4 {

  public static void main(String[] args){

    int i=1;
    int sum=0;
    while(sum < 100){

      if(i%2==0){
        sum += (-i);
        i++;
        continue;
      }

      sum += i;
      System.out.println("i= "+i+ ", sum= " +sum);

      i++;

    }//end of while

  }

}
