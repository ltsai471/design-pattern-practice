package com.ltasi;

public abstract class Handler {
    private Handler successor;

    public Handler(Handler successor){
        this.successor = successor;
    }

    public void handleMail(String email) {
        if (successor != null)
            successor.handleMail(email);
    }

    public abstract boolean isResponse(String email);
}
