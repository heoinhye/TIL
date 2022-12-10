package org.example.java.ch14;

import java.util.Comparator;

public class Ex14_5 {

  public static void main(String[] args) {

  }
}

class Student implements Comparable<Student> {

  String name;
  int ban;
  int totalScore;

  public Student(String name, int ban, int totalScore) {
    this.name = name;
    this.ban = ban;
    this.totalScore = totalScore;
  }

  public String getName() { return name; }
  public int getBan() { return ban; }
  public int getTotalScore() { return totalScore; }

  @Override
  public int compareTo(Student o) {
    return o.totalScore - this.totalScore;
  }

}
