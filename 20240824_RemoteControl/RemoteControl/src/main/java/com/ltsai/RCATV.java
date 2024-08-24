package com.ltsai;

public class RCATV implements TV {
    int currentChannel = 0;
    @Override
    public void on() {
        System.out.println("Turn on RCA TV.");
    }

    @Override
    public void off() {
        System.out.println("Turn off RCA TV.");
    }

    @Override
    public void setChannel(int channel) {
        currentChannel = channel;
        System.out.println("Set RCA TV to channel: " + channel);
    }
    @Override
    public int getChannel(){
        return currentChannel;
    }
}
