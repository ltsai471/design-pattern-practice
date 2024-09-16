package com.ltsai;

public class TicketFacade {
    private TicketService ticketService;

    public TicketFacade(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public boolean checkTicketAvailability(int eventId) {
        return ticketService.isTicketAvailable(eventId);
    }

    public void purchaseTicket(int eventId, int userId) {
        ticketService.purchaseTicket(eventId, userId);
    }
}
