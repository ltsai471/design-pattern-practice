package com.ltsai;

import java.util.HashMap;

public class CacheService {
    private HashMap<Integer, Boolean> ticketCache = new HashMap<>();

    public Boolean getTicketAvailabilityFromCache(int eventId) {
        return ticketCache.get(eventId); // Returns cached data if available
    }

    public void cacheTicketAvailability(int eventId, boolean isAvailable) {
        ticketCache.put(eventId, isAvailable);
    }
}
