package org.example.java.ch7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_18 {

  public static void main(String[] args){
   Button button = new Button("start");
   button.addActionListener(new EventHandler());
  }

}

class EventHandler implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.print("ActionListener occurred!");
  }

}
