package com.ltsai;

public class TeXText implements TextFormat {
    String context;
    public TeXText(){
        this.context="";
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
