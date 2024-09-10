package com.ltsai;


public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public void execute() {
        saveBackup();
        app.clipboard = editor.getSelection();
        editor.deleteSelection();
        System.out.println("Cut: " + app.clipboard);
    }
}
