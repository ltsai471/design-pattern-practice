package com.ltsai;

public class PMButton implements Button {
    String name;
    String type = "PMButton";

    public PMButton(String name) {
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
