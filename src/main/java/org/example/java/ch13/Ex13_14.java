package org.example.java.ch13;

import java.util.ArrayList;

public class Ex13_14 {
  public static void main(String[] args) throws InterruptedException {
    Table table = new Table();
    new Thread(new Cook(table), "chef").start();
    new Thread(new Customer(table, "donut"), "customer1").start();
    new Thread(new Customer(table, "burger"), "customer2").start();

    Thread.sleep(5000);
    System.exit(0);
  }
}

class Table {
  String[] dishNames = {"donut", "donut", "burger"};
  final int MAX_FOOD = 6;
  private ArrayList<String> dishes = new ArrayList<>();

  public synchronized void add(String dish){
    if(dishes.size() >= MAX_FOOD) return;
    dishes.add(dish);
    System.out.println("Dishes: "+dishes.toString());
  }//add()

  public boolean remove(String dishName){
    synchronized (this){
      while(dishes.size() == 0){
        String name = Thread.currentThread().getName();
        System.out.println(name + " is waiting....");
        try {Thread.sleep(500);} catch (InterruptedException e) {}
      }

      for(int i=0; i<dishes.size(); i++){
        if(dishName.equals(dishes.get(i))){
          dishes.remove(i);
          return true;
        }
      }
    }
    return false;
  }//remove()

  public int dishNum() { return dishNames.length; }

}//Table

class Customer implements Runnable {
  private Table table;
  private String food;

  public Customer(Table table, String food) {
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

      if(eatFood()) {
        System.out.println(name + "가 "+ food + "을(를) 먹습니다.");
      } else {
        System.out.println(name +"가 "+ food + "을(를) 못 먹습니다.");
      }
    }
  }

  boolean eatFood() { return table.remove(food); }
}

class Cook implements Runnable{
  private Table table;

  public Cook(Table table) {
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
}