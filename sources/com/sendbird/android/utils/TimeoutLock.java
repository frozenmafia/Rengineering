package com.sendbird.android.utils;

import com.sendbird.android.log.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes5.dex */
public final class TimeoutLock {
    private static final long DEFAULT_TIMEOUT = 10000;
    private final CountDownLatch countDownLatch;
    private final AtomicBoolean interrupted;
    private final AtomicBoolean isWaiting;
    private final AtomicReference<Future<?>> job;
    private final TimeUnit timeUnit;
    private final long timeout;
    private final ScheduledExecutorService timer;

    /* loaded from: classes5.dex */
    public static class TimeoutException extends Exception {
        TimeoutException(String str) {
            super(str);
        }
    }

    public TimeoutLock() {
        this(10000L, TimeUnit.MILLISECONDS);
    }

    public TimeoutLock(long j, TimeUnit timeUnit) {
        this.timer = Executors.newSingleThreadScheduledExecutor();
        this.countDownLatch = new CountDownLatch(1);
        this.interrupted = new AtomicBoolean(false);
        this.isWaiting = new AtomicBoolean(false);
        this.job = new AtomicReference<>();
        this.timeout = j;
        this.timeUnit = timeUnit;
    }

    public void await() throws InterruptedException, TimeoutException {
        synchronized (this) {
            Logger.d(">> TimeoutLock::await(%s)", this);
            if (this.countDownLatch.getCount() == 0) {
                cancel();
                Logger.d("-- return TimeoutLock already released ");
            } else if (this.interrupted.getAndSet(false)) {
                throw new InterruptedException("a job was interrupted");
            } else {
                Logger.d("++ isWaiting : " + this.isWaiting.get());
                if (this.isWaiting.getAndSet(true)) {
                    return;
                }
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                this.job.set(this.timer.schedule(new Runnable() { // from class: com.sendbird.android.utils.TimeoutLock.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d("++ TimeoutLock::Timeout( count=%s)", Long.valueOf(TimeoutLock.this.countDownLatch.getCount()));
                        TimeoutLock.this.interrupted.set(false);
                        atomicBoolean.compareAndSet(false, TimeoutLock.this.countDownLatch.getCount() > 0);
                        TimeoutLock.this.countDownLatch.countDown();
                    }
                }, this.timeout, this.timeUnit));
                this.countDownLatch.await();
                this.isWaiting.set(false);
                cancel();
                Logger.d("++ await end interrupted=%s, isTimeout=%s", this.interrupted, Boolean.valueOf(atomicBoolean.get()));
                if (this.interrupted.getAndSet(false)) {
                    throw new InterruptedException("a job was interrupted");
                }
                if (atomicBoolean.getAndSet(false)) {
                    throw new TimeoutException("exceed the timed out");
                }
            }
        }
    }

    private void cancel() {
        Future<?> andSet = this.job.getAndSet(null);
        if (andSet != null) {
            Logger.d(">> TimeoutLock::cancel() job : " + andSet);
            andSet.cancel(false);
        }
    }

    public void release() {
        Logger.d(">> TimeoutLock::release(%s)", this);
        cancel();
        this.countDownLatch.countDown();
    }

    public void interrupt() {
        Logger.i(">> TimeoutLock::isWaiting() : " + this.isWaiting.get(), new Object[0]);
        if (this.isWaiting.get()) {
            Logger.i(">> TimeoutLock::interrupt()", new Object[0]);
            this.interrupted.set(true);
            release();
        }
    }
}
