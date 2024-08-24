package com.ltsai;

public class Main {
    public static void main(String[] args) {
        TV tv1 = new RCATV();
        RemoteControl rc1 = new ExtRemoteControl(tv1);
        rc1.on();
        rc1.setChannel(50);
        ((ExtRemoteControl) rc1).nextChannel();//51
        ((ExtRemoteControl) rc1).prevChannel();//50
        ((ExtRemoteControl) rc1).prevChannel();//49
        rc1.off();
    }
}