package com.ltsai;

public class ExtRemoteControl extends RemoteControl {
    public ExtRemoteControl(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }

    @Override
    public void setChannel(int channel) {
        tv.setChannel(channel);
    }

    public void nextChannel() {
        tv.setChannel(tv.getChannel() + 1);
    }

    public void prevChannel() {
        tv.setChannel(tv.getChannel() - 1);
    }
}
