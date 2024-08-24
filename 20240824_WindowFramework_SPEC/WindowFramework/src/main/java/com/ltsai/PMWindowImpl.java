package com.ltsai;

public class PMWindowImpl implements WindowImpl {
    @Override
    public void drawRect() {
        System.out.println("MMMM");
    }
    @Override
    public void drawText() {
        System.out.println("PMWindow");
    }
}
