package com.ltsai;

public abstract class RemoteControl {
    TV tv;
    public RemoteControl(TV tv){
        this.tv = tv;
    }
    abstract void on();
    abstract void off();
    abstract void setChannel(int channel);
}
