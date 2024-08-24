package com.ltsai;

public abstract class Window {
    WindowImpl impl;

    public Window(WindowImpl impl) {
        this.impl = impl;
    }

    public abstract void drawRect();

    public abstract void drawText();
}
