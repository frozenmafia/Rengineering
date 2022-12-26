package o;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import o.createProgressView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class createProgressView$ag$a implements Runnable {
    private final ThreadFactory HaptikSDK$b;
    private final Future<?> ag$a;
    private final long ah$a;
    private final ScheduledExecutorService toString;
    final orderBy valueOf;
    private final ConcurrentLinkedQueue<createProgressView.valueOf> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public createProgressView$ag$a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledFuture<?> scheduledFuture;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.ah$a = nanos;
        this.values = new ConcurrentLinkedQueue<>();
        this.valueOf = new orderBy();
        this.HaptikSDK$b = threadFactory;
        ScheduledExecutorService scheduledExecutorService = null;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, createProgressView.ah$a);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledFuture = null;
        }
        this.toString = scheduledExecutorService;
        this.ag$a = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public createProgressView.valueOf ah$a() {
        if (this.valueOf.isDisposed()) {
            return createProgressView.values;
        }
        while (!this.values.isEmpty()) {
            createProgressView.valueOf poll = this.values.poll();
            if (poll != null) {
                return poll;
            }
        }
        createProgressView.valueOf valueof = new createProgressView.valueOf(this.HaptikSDK$b);
        this.valueOf.values(valueof);
        return valueof;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(createProgressView.valueOf valueof) {
        valueof.values(values() + this.ah$a);
        this.values.offer(valueof);
    }

    void valueOf() {
        if (this.values.isEmpty()) {
            return;
        }
        long values = values();
        Iterator<createProgressView.valueOf> it = this.values.iterator();
        while (it.hasNext()) {
            createProgressView.valueOf next = it.next();
            if (next.ah$a() > values) {
                return;
            }
            if (this.values.remove(next)) {
                this.valueOf.valueOf(next);
            }
        }
    }

    long values() {
        return System.nanoTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a() {
        this.valueOf.dispose();
        Future<?> future = this.ag$a;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.toString;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }
}
