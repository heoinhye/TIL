package org.example.java.ch7;

public class Exercise7_4 {
  public static void main(String[] args){
    MyTv tv = new MyTv();
    tv.setChannel(10);
    tv.setVolume(20);
    System.out.println(tv.getChannel() + ", " + tv.getVolume());
  }
}

class MyTv {
  private boolean isPowerOn;
  private int channel;
  private int volume;

  final int MAX_VOLUME=100;
  final int MIN_VOLUME=0;
  final int MAX_CHANNEL=100;
  final int MIN_CHANNEL=1;

  public boolean isPowerOn() {
    return isPowerOn;
  }

  public void setPowerOn(boolean powerOn) {
    isPowerOn = powerOn;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
//    if(1 <= channel && channel <= 100)
//      this.channel = channel;

    if(MAX_CHANNEL < channel || channel < MIN_CHANNEL)
      return;

    this.channel=channel;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
//    if(0 <= volume && volume <= 100)
//      this.volume = volume;
    if(MAX_VOLUME < volume || volume < MIN_VOLUME)
      return;

    this.volume=volume;
  }
}
