package org.example.java.ch14;

import java.io.File;
import java.util.stream.Stream;

public class Ex14_6 {

  public static void main(String[] args){
    File[] fileArr = { new File("Ex1.java"), new File("Ex2.java") };
    Stream<File> fileStream = Stream.of(fileArr);
    Stream<String> filenameStream = fileStream.map(File::getName);
    //filenameStream.forEach(System.out::println);

    fileStream = Stream.of(fileArr);
    fileStream.map(File::getName)
              .filter(s->s.indexOf('.')!=-1)
              .peek(s->System.out.println(s))
              .map(s->s.substring(s.indexOf('.')+1))
              .peek(s->System.out.println(s))
              .map(String::toUpperCase)
              .peek(s->System.out.println(s))
              .distinct()
              .forEach(System.out::println);

  }

}
