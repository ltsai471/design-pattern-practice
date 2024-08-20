package com.ltsai;

public class MotifWindow implements Window {
    private String name;
    private String type = "MotifWindow";

    public MotifWindow(String name) {
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
