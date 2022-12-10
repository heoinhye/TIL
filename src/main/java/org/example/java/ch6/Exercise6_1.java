package org.example.java.ch6;

public class Exercise6_1 {

  public static void main(String[] args){
    Student student = new Student();
  }

}

class Student{
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  Student(){}

  Student(String name, int ban, int no, int kor, int eng, int math){
    this.name=name;
    this.ban=ban;
    this.no=no;
    this.kor=kor;
    this.eng=eng;
    this.math=math;
  }

  public String info(){
    int total = kor+eng+math;
    float avg = ((int)(total / 3f * 10 + 0.5f) / 10f);
    return name+","+ban+","+no+","+kor+","+eng+","+math+","+total+","+avg;
  }

  public int getTotal(){
    return kor+eng+math;
  }

  public float getAverage(){
    return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
  }

}
