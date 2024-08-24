package com.ltsai;

public class TransientWindow extends Window {
    public TransientWindow(WindowImpl impl){
        super(impl);
    }

    @Override
    public void drawRect() {
        impl.drawRect();
    }

    @Override
    public void drawText() {
        impl.drawText();
    }

    public void drawCloseBox() {
        drawRect();
    }
}
