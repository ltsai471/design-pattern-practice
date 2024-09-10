package com.ltsai;

public class Main {
    public static void main(String[] args) {
        //init
        Application app = new Application();
        app.createUI();
        app.editor.text = "Hello world! ";
        System.out.println("=======================");
        System.out.println("Editor initial text: " + app.editor.text);

        app.clickButton("copyButton");
        app.useShortcut("Ctrl+V");
        app.clickButton("pasteButton");
        app.clickButton("pasteButton");
        app.useShortcut("Ctrl+Z");
        System.out.println("Editor final text: " + app.editor.text);
    }
}