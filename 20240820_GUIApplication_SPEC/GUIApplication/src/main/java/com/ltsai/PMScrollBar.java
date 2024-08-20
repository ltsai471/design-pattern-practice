package com.ltsai;

public class PMScrollBar implements ScrollBar {
    private String name;
    private String type = "PMScrollBar";

    public PMScrollBar(String name) {
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
