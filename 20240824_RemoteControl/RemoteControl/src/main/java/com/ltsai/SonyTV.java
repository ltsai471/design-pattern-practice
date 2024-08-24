package com.ltsai;

public class SonyTV implements TV{
    int currentChannel = 0;
    @Override
    public void on(){
        System.out.println("Turn on Sony TV.");
    }

    @Override
    public void off(){
        System.out.println("Turn off Sony TV.");
    }

    @Override
    public void setChannel(int channel){
        currentChannel = channel;
        System.out.println("Set Sony TV to channel: "+channel);
    }
    @Override
    public int getChannel(){
        return currentChannel;
    }
}
