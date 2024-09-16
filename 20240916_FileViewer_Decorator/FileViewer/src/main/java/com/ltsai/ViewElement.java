package com.ltsai;

import java.util.ArrayList;

public class ViewElement implements VisualComponent {
    private VisualComponent component;

    public ViewElement(VisualComponent component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
