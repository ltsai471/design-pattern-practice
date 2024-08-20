package com.ltsai;

public class PMWindow implements Window {
    private String name;
    private String type = "PMWindow";

    public PMWindow(String name) {
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
