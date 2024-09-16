package com.ltsai;

public class TextView implements VisualComponent {
    String text = "";

    public TextView(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.print(this.text);
    }
}
