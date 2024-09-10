package com.ltsai;


public class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    public void execute() {
        saveBackup();
        editor.text += app.clipboard;
//        editor.replaceSelection(app.clipboard);
        System.out.println("Pasted: " + app.clipboard);
    }
}
