package com.ltsai;

public class Border extends ViewElement {
    public Border(VisualComponent component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        System.out.print(" thickBlackBorder");
    }
}
