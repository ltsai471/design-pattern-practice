package com.ltsai;

public class ScrollBar extends ViewElement {
    public ScrollBar(VisualComponent component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        System.out.print(" scrollBar");
    }
}
