package com.sendbird.android;

import com.sendbird.android.log.Logger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class TimeoutScheduler {
    private Object extra;
    private TimeoutEventhandler handler;
    private final long initialDelay;
    private final AtomicBoolean isRunning;
    private final AtomicBoolean repeat;
    private final ClearableScheduledExecutorService scheduler;
    private long timeout;

    /* loaded from: classes5.dex */
    public interface TimeoutEventhandler {
        void onTimeout(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeoutScheduler(long j) {
        this(j, j, false, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeoutScheduler(long j, TimeoutEventhandler timeoutEventhandler) {
        this(j, j, false, timeoutEventhandler, null);
    }

    TimeoutScheduler(long j, TimeoutEventhandler timeoutEventhandler, Object obj) {
        this(j, j, false, timeoutEventhandler, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeoutScheduler(long j, boolean z, TimeoutEventhandler timeoutEventhandler, Object obj) {
        this(j, j, z, timeoutEventhandler, obj);
    }

    TimeoutScheduler(long j, long j2, boolean z, TimeoutEventhandler timeoutEventhandler) {
        this(j, j2, z, timeoutEventhandler, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeoutScheduler(long j, long j2, boolean z, TimeoutEventhandler timeoutEventhandler, Object obj) {
        this.isRunning = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.repeat = atomicBoolean;
        this.scheduler = new ClearableScheduledExecutorService();
        this.initialDelay = j;
        this.timeout = j2;
        atomicBoolean.set(z);
        this.handler = timeoutEventhandler;
        this.extra = obj;
    }

    public void setEventHandler(TimeoutEventhandler timeoutEventhandler) {
        this.handler = timeoutEventhandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setExtra(Object obj) {
        this.extra = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void restart() {
        restart(this.timeout);
    }

    void restart(long j) {
        this.timeout = j;
        if (this.isRunning.getAndSet(false)) {
            stop();
        }
        start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stop() {
        stop(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stop(boolean z) {
        this.isRunning.set(false);
        cancelAll(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void once() {
        synchronized (this) {
            this.repeat.set(false);
            start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void start() {
        synchronized (this) {
            if (this.handler == null) {
                throw new NullPointerException("callback must Non null");
            }
            if (this.isRunning.get()) {
                return;
            }
            this.scheduler.scheduleAtFixedRate(new Runnable() { // from class: com.sendbird.android.TimeoutScheduler.1
                @Override // java.lang.Runnable
                public void run() {
                    if (TimeoutScheduler.this.handler != null) {
                        TimeoutScheduler.this.handler.onTimeout(TimeoutScheduler.this.extra);
                    }
                    if (!TimeoutScheduler.this.repeat.get()) {
                        TimeoutScheduler.this.stop();
                    }
                    TimeoutScheduler.this.isRunning.set(false);
                }
            }, this.initialDelay, this.timeout, TimeUnit.MILLISECONDS);
            this.isRunning.compareAndSet(false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isRunning() {
        return this.isRunning.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void await(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    private void cancelAll() {
        cancelAll(false);
    }

    private void cancelAll(boolean z) {
        Logger.d("__ TimeoutScheduler::cancelAll(%s)", Boolean.valueOf(z));
        this.scheduler.cancelAllJobs(z);
    }
}
