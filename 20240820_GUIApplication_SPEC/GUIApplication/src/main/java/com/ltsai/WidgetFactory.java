package com.ltsai;

public interface WidgetFactory {
    Window createWindow(String name);
    ScrollBar createScrollBar(String name);
    Button createButton(String name);
}
