package com.ltsai;

public class IconWindow extends Window {
    public IconWindow(WindowImpl impl){
        super(impl);
    }
    public void drawBorder() {
        drawText();
        drawRect();
    }
}
