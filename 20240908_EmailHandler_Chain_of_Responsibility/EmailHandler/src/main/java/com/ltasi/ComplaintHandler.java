package com.ltasi;

public class ComplaintHandler extends Handler {

    public ComplaintHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleMail(String email) {
        if (isResponse(email))
            System.out.println("Forward to legal department.");
        else{
            System.out.print("ComplaintHandler -> ");
            super.handleMail(email);
        }

    }

    @Override
    public boolean isResponse(String email) {
        return "COMPLAINT".equals(email);
    }
}
