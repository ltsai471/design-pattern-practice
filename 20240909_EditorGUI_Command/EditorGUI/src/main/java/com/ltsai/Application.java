package com.ltsai;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public Editor editor = new Editor();
    public String clipboard = "";
    public CommandHistory history = new CommandHistory();
    private Map<String, Command> buttonMap = new HashMap<>();
    private Map<String, Command> shortcutMap = new HashMap<>();

    public void createUI() {
        buttonMap.put("copyButton", new CopyCommand(this, editor));
        buttonMap.put("cutButton", new CutCommand(this, editor));
        buttonMap.put("pasteButton", new PasteCommand(this, editor));
        buttonMap.put("undoButton", new UndoCommand(this, editor));

        shortcutMap.put("Ctrl+C", buttonMap.get("copyButton"));
        shortcutMap.put("Ctrl+X", buttonMap.get("cutButton"));
        shortcutMap.put("Ctrl+V", buttonMap.get("pasteButton"));
        shortcutMap.put("Ctrl+Z", buttonMap.get("undoButton"));

        System.out.println("UI created with 4 buttons and 4 shortcuts:");
        System.out.println("Buttons: copyButton, cutButton, pasteButton, undoButton");
        System.out.println("Shortcuts: Ctrl+C, Ctrl+X, Ctrl+V, Ctrl+Z");
    }

    public void executeCommand(Command c) {
        c.execute();
        history.push(c);
    }

    public void undo() {
        Command command = history.pop();
        if (command != null)
            command.undo();
    }

    public void clickButton(String buttonName) {
        Command command = buttonMap.get(buttonName);
        if (command != null)
            executeCommand(command);
    }

    public void useShortcut(String shortcut) {
        Command command = shortcutMap.get(shortcut);
        if (command != null)
            executeCommand(command);
        else
            System.out.println("Shortcut not found: " + shortcut);
    }

}
