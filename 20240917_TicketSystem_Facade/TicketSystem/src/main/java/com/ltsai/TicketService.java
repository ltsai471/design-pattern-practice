package com.ltsai;

public class TicketService {
    private DatabaseService dbService;
    private CacheService cacheService;
    private ConcurrencyManager concurrencyManager;

    public TicketService(DatabaseService dbService, CacheService cacheService, ConcurrencyManager concurrencyManager) {
        this.dbService = dbService;
        this.cacheService = cacheService;
        this.concurrencyManager = concurrencyManager;
    }

    public boolean isTicketAvailable(int eventId) {
        // Check in cache first
        Boolean cachedAvailability = cacheService.getTicketAvailabilityFromCache(eventId);
        if (cachedAvailability != null) return cachedAvailability;

        // Otherwise, check in the database
        concurrencyManager.acquireLock();
        try {
            boolean isAvailable = dbService.checkTicketAvailability(eventId);
            cacheService.cacheTicketAvailability(eventId, isAvailable);
            return isAvailable;
        } finally {
            concurrencyManager.releaseLock();
        }
    }

    public void purchaseTicket(int eventId, int userId) {
        concurrencyManager.acquireLock();
        try {
            if (isTicketAvailable(eventId)) {
                dbService.purchaseTicket(eventId, userId);
            } else {
                throw new RuntimeException("Ticket not available");
            }
        } finally {
            concurrencyManager.releaseLock();
        }
    }
}
