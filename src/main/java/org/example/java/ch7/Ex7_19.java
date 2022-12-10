package org.example.java.ch7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_19 {

  public static void main(String[] args){

    Button button = new Button("start");

    button.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.print("ActionEvent occurred!");
      }

    });

  }

}
