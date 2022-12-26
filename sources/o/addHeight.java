package o;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.schedulers.RxThreadFactory;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.addHeight;
import o.getLoopers;
/* loaded from: classes5.dex */
public final class addHeight extends getLoopers {
    static final valueOf ag$a;
    static final RxThreadFactory ah$a;
    static final RxThreadFactory valueOf;
    static final toString values;
    final ThreadFactory HaptikSDK$b;
    final AtomicReference<valueOf> ah$b;
    private static final TimeUnit HaptikSDK$c = TimeUnit.SECONDS;
    private static final long HaptikSDK$a = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    static {
        toString tostring = new toString(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        values = tostring;
        tostring.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max);
        ah$a = rxThreadFactory;
        valueOf = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        valueOf valueof = new valueOf(0L, null, rxThreadFactory);
        ag$a = valueof;
        valueof.ah$a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class valueOf implements Runnable {
        private final ThreadFactory HaptikSDK$b;
        private final ConcurrentLinkedQueue<toString> ag$a;
        final growByteBuffer ah$a;
        private final ScheduledExecutorService toString;
        private final Future<?> valueOf;
        private final long values;

        valueOf(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.values = nanos;
            this.ag$a = new ConcurrentLinkedQueue<>();
            this.ah$a = new growByteBuffer();
            this.HaptikSDK$b = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, addHeight.valueOf);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.toString = scheduledExecutorService;
            this.valueOf = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            valueOf(this.ag$a, this.ah$a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public toString valueOf() {
            if (this.ah$a.isDisposed()) {
                return addHeight.values;
            }
            while (!this.ag$a.isEmpty()) {
                toString poll = this.ag$a.poll();
                if (poll != null) {
                    return poll;
                }
            }
            toString tostring = new toString(this.HaptikSDK$b);
            this.ah$a.ah$a(tostring);
            return tostring;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void toString(toString tostring) {
            tostring.toString(System.nanoTime() + this.values);
            this.ag$a.offer(tostring);
        }

        static void valueOf(ConcurrentLinkedQueue<toString> concurrentLinkedQueue, growByteBuffer growbytebuffer) {
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long nanoTime = System.nanoTime();
            Iterator<toString> it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                toString next = it.next();
                if (next.ah$a() > nanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(next)) {
                    growbytebuffer.ag$a(next);
                }
            }
        }

        void ah$a() {
            this.ah$a.dispose();
            Future<?> future = this.valueOf;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.toString;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    public addHeight() {
        this(ah$a);
    }

    public addHeight(ThreadFactory threadFactory) {
        this.HaptikSDK$b = threadFactory;
        this.ah$b = new AtomicReference<>(ag$a);
        values();
    }

    @Override // o.getLoopers
    public void values() {
        valueOf valueof = new valueOf(HaptikSDK$a, HaptikSDK$c, this.HaptikSDK$b);
        if (this.ah$b.compareAndSet(ag$a, valueof)) {
            return;
        }
        valueof.ah$a();
    }

    @Override // o.getLoopers
    public getLoopers.toString ag$a() {
        final valueOf valueof = this.ah$b.get();
        return new getLoopers.toString(valueof) { // from class: o.addHeight$ah$a
            private final addHeight.toString ag$a;
            private final addHeight.valueOf valueOf;
            final AtomicBoolean toString = new AtomicBoolean();
            private final growByteBuffer values = new growByteBuffer();

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.valueOf = valueof;
                this.ag$a = valueof.valueOf();
            }

            @Override // o.dataStart
            public void dispose() {
                if (this.toString.compareAndSet(false, true)) {
                    this.values.dispose();
                    this.valueOf.toString(this.ag$a);
                }
            }

            @Override // o.dataStart
            public boolean isDisposed() {
                return this.toString.get();
            }

            @Override // o.getLoopers.toString
            public dataStart valueOf(Runnable runnable, long j, TimeUnit timeUnit) {
                if (this.values.isDisposed()) {
                    return EmptyDisposable.INSTANCE;
                }
                return this.ag$a.values(runnable, j, timeUnit, this.values);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class toString extends addWidth {
        long values;

        toString(ThreadFactory threadFactory) {
            super(threadFactory);
            this.values = 0L;
        }

        public long ah$a() {
            return this.values;
        }

        public void toString(long j) {
            this.values = j;
        }
    }
}
