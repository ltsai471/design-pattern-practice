package com.ltsai;

public class TextWidget implements TextFormat {
    String context;

    public TextWidget() {
        this.context = "";
    }

    @Override
    public String getContent() {
        return this.context;
    }

    @Override
    public void setContent(String context) {
        this.context = context;
    }
}
