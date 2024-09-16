package com.ltsai;

public class DatabaseService {
    public void connectToDatabase(String dbName) {
        // Code to connect to a specific database (s1, s2, s3, or s4)
        System.out.println("Connect to database: " + dbName);
    }

    public boolean checkTicketAvailability(int eventId) {
        // Code to check ticket availability in a specific database
        return true; // Example: check in DB and return availability
    }

    public void purchaseTicket(int eventId, int userId) {
        // Code to write purchase to the specific database
        System.out.println("Purchase ticket: " + userId + " -> " + eventId);
    }
}
