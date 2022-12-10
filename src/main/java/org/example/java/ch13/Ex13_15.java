package org.example.java.ch13;

import java.util.ArrayList;

public class Ex13_15 {
  public static void main(String[] args) throws InterruptedException {
    Table2 table = new Table2();
    new Thread(new Cook2(table), "chef").start();
    new Thread(new Customer2(table, "donut"), "customer1").start();
    new Thread(new Customer2(table, "burger"), "customer2").start();

    Thread.sleep(5000);
    System.exit(0);
  }
}

class Table2 {
  String[] dishNames = {"donut", "donut", "burger"};
  final int MAX_FOOD = 6;
  private ArrayList<String> dishes = new ArrayList<>();

  public synchronized void add(String dish) {
    while(dishes.size() >= MAX_FOOD) {
      String name = Thread.currentThread().getName();
      System.out.println(name + " is wating....");

      try {
        wait();
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }

    dishes.add(dish);
    notify();
    System.out.println("Dishes: "+dishes.toString());

  }//add()

  public void remove(String dishName){
    synchronized (this){
      while(dishes.size() == 0){
        String name = Thread.currentThread().getName();

        try {
          wait();
          Thread.sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

      }//while

      while(true) {
        for(int i=0; i<dishes.size(); i++){
          if(dishName.equals(dishes.get(i))){
            dishes.remove(i);
            notify();
            return;
          }
        }

        try {
          wait();
          Thread.sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }//while(true)
    }
  }//remove()

  public int dishNum() { return dishNames.length; }

}//Table2

class Customer2 implements Runnable {
  private Table2 table;
  private String food;

  public Customer2(Table2 table, String food) {
    this.table = table;
    this.food = food;
  }

  @Override
  public void run() {
    while(true){
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      String name = Thread.currentThread().getName();

      table.remove(food);
      System.out.println(name + " is eating " + food);
    }
  }

}//Customer2

class Cook2 implements Runnable{
  private Table2 table;

  public Cook2(Table2 table) {
    this.table = table;
  }

  @Override
  public void run() {

    while(true){
      int idx = (int)(Math.random()*table.dishNum());
      table.add(table.dishNames[idx]);

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

    }
  }
}//Cook2