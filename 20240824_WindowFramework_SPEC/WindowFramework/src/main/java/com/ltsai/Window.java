package com.ltsai;

public class Window {
    WindowImpl impl;

    public Window(WindowImpl impl) {
        this.impl = impl;
    }

    public void drawRect() {
        impl.drawRect();
    }

    public void drawText() {
        impl.drawText();
    }
}
