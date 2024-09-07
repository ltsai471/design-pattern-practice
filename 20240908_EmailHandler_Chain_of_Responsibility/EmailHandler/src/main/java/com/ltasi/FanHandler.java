package com.ltasi;

public class FanHandler extends Handler {
    public FanHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleMail(String email) {
        if (isResponse(email))
            System.out.println("Forward to CEO.");
        else {
            System.out.print("FanHandler -> ");
            super.handleMail(email);
        }
    }

    @Override
    public boolean isResponse(String email) {
        return "FAN".equals(email);
    }
}
