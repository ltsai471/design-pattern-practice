package com.ltsai;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyManager {
    private ReentrantLock lock = new ReentrantLock();

    public void acquireLock() {
        lock.lock();
    }

    public void releaseLock() {
        lock.unlock();
    }
}
