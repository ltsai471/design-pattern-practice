package com.ltsai;

public class MotifScrollBar implements ScrollBar {
    private String name;
    private String type = "MotifScrollBar";

    public MotifScrollBar(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
