package com.ltsai;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GUIApplication {
    ArrayList<Window> windows = new ArrayList<>();
    ArrayList<ScrollBar> scrollBars = new ArrayList<>();
    ArrayList<Button> buttons = new ArrayList<>();
    WidgetFactory factory = new MotifWidgetFactory();

    public void switchStyle(String styleName) {
        ArrayList<Window> newWindows = new ArrayList<>();
        ArrayList<ScrollBar> newScrollBars = new ArrayList<>();
        ArrayList<Button> newButtons = new ArrayList<>();

        if (styleName.equals("PM")) {
            factory = new PMWidgetFactory();
        } else {
            factory = new MotifWidgetFactory();
        }

        for (Window window : windows) {
            newWindows.add(factory.createWindow(window.getName()));
        }
        for (ScrollBar scrollBar : scrollBars) {
            newScrollBars.add(factory.createScrollBar(scrollBar.getName()));
        }
        for (Button button : buttons) {
            newButtons.add(factory.createButton(button.getName()));
        }
        windows = newWindows;
        scrollBars = newScrollBars;
        buttons = newButtons;
    }

    public void present() {
        String filePath = "F:\\碩班\\111-2\\軟工\\20240820-practice\\20240820_GUIApplication_SPEC\\GUIApplication\\src\\test\\outputs\\output1";

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            for (Window window : windows) {
                System.out.println(window.getType() + " " + window.getName());
                writer.println(window.getType() + " " + window.getName());
            }
            for (ScrollBar scrollBar : scrollBars){
                System.out.println(scrollBar.getType() + " " + scrollBar.getName());
                writer.println(scrollBar.getType() + " " + scrollBar.getName());
            }
            for (Button button : buttons){
                System.out.println(button.getType() + " " + button.getName());
                writer.println(button.getType() + " " + button.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addWindows(String name) {
        windows.add(factory.createWindow(name));
    }

    public void addSrollBar(String name) {
        scrollBars.add(factory.createScrollBar(name));
    }

    public void addButton(String name) {
        buttons.add(factory.createButton(name));
    }
}
