package org.example.java.ch13;

/**
 * 은행계좌에서 잔고를 확인하고, 임의의 금액(100,200,300)을 출금하는 코드
 * */
public class Ex13_13 {
  public static void main(String[] args){
    Runnable r = new RunnableEx13();
    new Thread(r).start();
    new Thread(r).start();
  }
}

class RunnableEx13 implements Runnable {
  Account2 account = new Account2();

  @Override
  public void run() {
    while(account.getBalance() > 0 ){
      int money = (int)(Math.random()*3+1)*100; //100, 200, 300 중 임의의 값 출금
      account.withdraw(money);
      System.out.println("현재 잔액은 "+account.getBalance() +"원 입니다.");
    }
  }

}

class Account2 {
  private int balance = 1000;

  public int getBalance() { return balance; }

  public synchronized void withdraw(int money) { //메서드 전체를 임계영역으로 지정
    if(balance >= money) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      balance -= money;
    }
  }
}
