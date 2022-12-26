package com.sendbird.android.utils;

import com.sendbird.android.log.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public final class CancelableThreadHolder {
    private CountDownLatch countDownLatch;
    private ScheduledExecutorService timer = Executors.newSingleThreadScheduledExecutor();
    private final AtomicBoolean interrupted = new AtomicBoolean(false);
    private final AtomicBoolean isWaiting = new AtomicBoolean(false);
    private final List<Future<?>> jobList = new ArrayList();

    public void sleep(long j) throws InterruptedException {
        synchronized (this) {
            if (this.interrupted.getAndSet(false)) {
                throw new InterruptedException("CancelableThreadHolder thread has been interrupted");
            }
            if (this.isWaiting.getAndSet(true)) {
                return;
            }
            this.countDownLatch = new CountDownLatch(1);
            synchronized (this.jobList) {
                this.jobList.add(this.timer.schedule(new Runnable() { // from class: com.sendbird.android.utils.CancelableThreadHolder.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d("__ timeout : " + CancelableThreadHolder.this.jobList.size());
                        CancelableThreadHolder.this.interrupted.set(false);
                        if (CancelableThreadHolder.this.countDownLatch != null) {
                            CancelableThreadHolder.this.countDownLatch.countDown();
                        }
                    }
                }, j, TimeUnit.MILLISECONDS));
            }
            this.countDownLatch.await();
            CountDownLatch countDownLatch = this.countDownLatch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
                this.countDownLatch = null;
            }
            this.isWaiting.set(false);
            cancelAll();
            if (this.interrupted.getAndSet(false)) {
                throw new InterruptedException("CancelableThreadHolder thread has been interrupted");
            }
        }
    }

    private void cancelAll() {
        Logger.d("__ cancelAll size : " + this.jobList.size());
        synchronized (this.jobList) {
            for (Future<?> future : this.jobList) {
                future.cancel(false);
            }
            this.jobList.clear();
        }
    }

    public boolean isInterrupted() {
        return this.interrupted.get();
    }

    public void awake() {
        Logger.d("__ awake()");
        cancelAll();
        CountDownLatch countDownLatch = this.countDownLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void interrupt() {
        Logger.d(">> CancelableThreadHolder interrupt()");
        this.interrupted.set(true);
        awake();
    }
}
