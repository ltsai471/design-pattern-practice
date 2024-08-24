package com.ltsai;

public class TransientWindow extends Window {
    public TransientWindow(WindowImpl impl){
        super(impl);
    }
    public void drawCloseBox() {
        drawRect();
    }
}
