package com.ltsai;

public class MotifButton implements Button {
    String name;
    String type = "MotifButton";

    public MotifButton(String name) {
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
