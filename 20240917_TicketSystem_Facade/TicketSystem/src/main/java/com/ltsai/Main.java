package com.ltsai;

public class Main {
    public static void main(String[] args) {
        DatabaseService databaseService = new DatabaseService();
        CacheService cacheService = new CacheService();
        ConcurrencyManager concurrencyManager = new ConcurrencyManager();

        TicketService ticketService = new TicketService(databaseService, cacheService, concurrencyManager);
        TicketFacade ticketFacade = new TicketFacade(ticketService);
        boolean isAvailable = ticketFacade.checkTicketAvailability(101);
        System.out.println("Ticket available: " + isAvailable);

        if (isAvailable) {
            ticketFacade.purchaseTicket(101, 28201);
            System.out.println("Ticket purchased successfully");
        }
    }
}