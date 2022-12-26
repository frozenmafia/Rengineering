package o;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes4.dex */
public class setPostOnViewCreatedAlpha extends AbstractExecutorService {
    private static final Class<?> valueOf = setPostOnViewCreatedAlpha.class;
    private final BlockingQueue<Runnable> HaptikSDK$b;
    private final setPostOnViewCreatedAlpha$ag$a HaptikSDK$c;
    private final AtomicInteger ag$a;
    private volatile int ah$a;
    private final AtomicInteger ah$b;
    private final String toString;
    private final Executor values;

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    public setPostOnViewCreatedAlpha(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i <= 0) {
            throw new IllegalArgumentException("max concurrency must be > 0");
        }
        this.toString = str;
        this.values = executor;
        this.ah$a = i;
        this.HaptikSDK$b = blockingQueue;
        this.HaptikSDK$c = new setPostOnViewCreatedAlpha$ag$a(this);
        this.ah$b = new AtomicInteger(0);
        this.ag$a = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable parameter is null");
        if (!this.HaptikSDK$b.offer(runnable)) {
            throw new RejectedExecutionException(this.toString + " queue is full, size=" + this.HaptikSDK$b.size());
        }
        int size = this.HaptikSDK$b.size();
        int i = this.ag$a.get();
        if (size > i && this.ag$a.compareAndSet(i, size)) {
            FragmentActivity.ag$a(valueOf, "%s: max pending work in queue = %d", this.toString, Integer.valueOf(size));
        }
        valueOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf() {
        int i = this.ah$b.get();
        while (i < this.ah$a) {
            int i2 = i + 1;
            if (this.ah$b.compareAndSet(i, i2)) {
                FragmentActivity.ah$a(valueOf, "%s: starting worker %d of %d", this.toString, Integer.valueOf(i2), Integer.valueOf(this.ah$a));
                this.values.execute(this.HaptikSDK$c);
                return;
            }
            FragmentActivity.toString(valueOf, "%s: race in startWorkerIfNeeded; retrying", this.toString);
            i = this.ah$b.get();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }
}
