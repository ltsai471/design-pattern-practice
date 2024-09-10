package com.ltsai;


public abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public void saveBackup() {
        backup = editor.text;
    }

    public void undo() {
        if (backup != null)
            editor.text = backup;
    }

    public abstract void execute();
}
