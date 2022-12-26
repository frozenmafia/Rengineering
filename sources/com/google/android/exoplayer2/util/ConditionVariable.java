package com.google.android.exoplayer2.util;
/* loaded from: classes5.dex */
public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public ConditionVariable(Clock clock) {
        this.clock = clock;
    }

    public boolean open() {
        synchronized (this) {
            if (this.isOpen) {
                return false;
            }
            this.isOpen = true;
            notifyAll();
            return true;
        }
    }

    public boolean close() {
        boolean z;
        synchronized (this) {
            z = this.isOpen;
            this.isOpen = false;
        }
        return z;
    }

    public void block() throws InterruptedException {
        synchronized (this) {
            while (!this.isOpen) {
                wait();
            }
        }
    }

    public boolean block(long j) throws InterruptedException {
        synchronized (this) {
            if (j <= 0) {
                return this.isOpen;
            }
            long elapsedRealtime = this.clock.elapsedRealtime();
            long j2 = j + elapsedRealtime;
            if (j2 < elapsedRealtime) {
                block();
            } else {
                while (!this.isOpen && elapsedRealtime < j2) {
                    wait(j2 - elapsedRealtime);
                    elapsedRealtime = this.clock.elapsedRealtime();
                }
            }
            return this.isOpen;
        }
    }

    public void blockUninterruptible() {
        synchronized (this) {
            boolean z = false;
            while (!this.isOpen) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean isOpen() {
        boolean z;
        synchronized (this) {
            z = this.isOpen;
        }
        return z;
    }
}
