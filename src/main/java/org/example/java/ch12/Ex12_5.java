package org.example.java.ch12;

public class Ex12_5 {

  enum Direction { EAST, SOUTH, WEST, NORTH }

  public static void main (String[] args){
    Direction d1 = Direction.EAST;
    Direction d2 = Direction.valueOf("WEST");
    Direction d3 = Direction.valueOf(Direction.class, "EAST");

    System.out.println("d1= " + d1);
    System.out.println("d2= " + d2);
    System.out.println("d3= " +  d3);

    System.out.println("d1==d2? " + (d1==d2));
    System.out.println("d1==d3? " + (d1==d3));
    System.out.println("d1.equals(d3)? " + d1.equals(d3));
    
    //같으면 0, 왼쪽이 크면 양수, 오른쪽이 크면 음수
    System.out.println("d1.compareTo(d3)? " + d1.compareTo(d3));
    System.out.println("d1.compareTo(d2)? " + d1.compareTo(d2));
    System.out.println("d2.compareTo(d1)? " + d2.compareTo(d1));

    Direction[] dArr = Direction.values();
    for(Direction d : dArr) {
      System.out.printf("%s = %d%n", d.name(), d.ordinal());
    }
  }
}
