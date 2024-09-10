package com.ltsai;


public class UndoCommand extends Command {
    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public void execute() {
        app.undo();
        System.out.println("Undo executed.");
    }
}
