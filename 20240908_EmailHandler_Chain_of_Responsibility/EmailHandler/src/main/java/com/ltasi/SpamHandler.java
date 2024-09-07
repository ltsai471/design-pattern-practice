package com.ltasi;

public class SpamHandler extends Handler {
    public SpamHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleMail(String email) {
        if (isResponse(email))
            System.out.println("Put mail to the spam box.");
        else {
            System.out.print("SpamHandler -> ");
            super.handleMail(email);
        }
    }

    @Override
    public boolean isResponse(String email) {
        return "SPAM".equals(email);
    }
}
