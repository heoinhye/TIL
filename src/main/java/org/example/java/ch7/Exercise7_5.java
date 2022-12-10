package org.example.java.ch7;

import java.util.ArrayList;
import java.util.List;

public class Exercise7_5 {

  public static void main(String[] args) {
    MyTv2 tv = new MyTv2();
    tv.setChannel(10);
    System.out.println(tv.getChannel());

    tv.setChannel(20);
    System.out.println(tv.getChannel());

    tv.gotoPrevChannel();
    System.out.println(tv.getChannel());

    tv.gotoPrevChannel();
    System.out.println(tv.getChannel());
  }

}

class MyTv2 {
  private boolean isPowerOn;
  private int channel;
  private int volume;
  private int prevChannel;

  final int MAX_VOLUME=100;
  final int MIN_VOLUME=0;
  final int MAX_CHANNEL=100;
  final int MIN_CHANNEL=1;

  public boolean isPowerOn() { return isPowerOn; }

  public void setPowerOn(boolean powerOn) { isPowerOn = powerOn; }

  public int getChannel() { return channel; }

  public void setChannel(int channel) {
    if(MAX_CHANNEL < channel || channel < MIN_CHANNEL)
      return;

    prevChannel = this.channel;
    this.channel=channel;
  }

  void gotoPrevChannel(){
    setChannel(prevChannel);
  }

  public int getVolume() { return volume; }

  public void setVolume(int volume) {
    if(MAX_VOLUME < volume || volume < MIN_VOLUME) return;
    this.volume=volume;
  }
}