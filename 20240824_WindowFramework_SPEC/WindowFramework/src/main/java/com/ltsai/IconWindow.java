package com.ltsai;

public class IconWindow extends Window {
    public IconWindow(WindowImpl impl){
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

    public void drawBorder() {
        drawText();
        drawRect();
    }
}
