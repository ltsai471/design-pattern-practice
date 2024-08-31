package com.ltsai;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {

    List<Component> components = new ArrayList<>();

    @Override
    public void draw() {
        System.out.print("Group:{");
        for (Component component : components) {
            component.draw();
        }
        System.out.print("} ");
    }

    public void add(Component component) {
        components.add(component);
    }
}
