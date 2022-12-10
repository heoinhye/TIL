package org.example.java.ch6;

public class Exercise6_19 {
  public static void main(String[] args){
    MyTv t = new MyTv(100, 0);
    System.out.println(t.channel + " " + t.volume);

    t.channelDown();
    t.volumeDown();
    System.out.println(t.channel + " " + t.volume);

    t.volume=100;
    t.channelUp();
    t.volumeUp();
    System.out.println(t.channel + " " + t.volume);
  }
}

class MyTv {
  boolean isPowerOn;
  int channel;
  int volume;

  final int MAX_VOLUME=10;
  final int MIN_VOLUME=0;
  final int MAX_CHANNEL=100;
  final int MIN_CHANNEL=0;

  void turnOnOff(){
//    if(isPowerOn){
//      isPowerOn=false;
//    } else {
//      isPowerOn=true;
//    }

    isPowerOn = !isPowerOn;
  }

  void volumeUp(){
    if(volume < MAX_VOLUME){
      ++volume;
    }
  }

  void volumeDown(){
    if(MIN_VOLUME < volume){
      --volume;
    }
  }

  void channelUp(){
    if(channel == MAX_CHANNEL){
      channel = MIN_CHANNEL;
    } else {
      ++channel;
    }

  }

  void channelDown(){
    if(channel == MIN_CHANNEL){
      channel = MAX_CHANNEL;
    } else {
      --channel;
    }
  }

  MyTv(int channel, int volume){
    this.channel=channel;
    this.volume=volume;
  }

}
