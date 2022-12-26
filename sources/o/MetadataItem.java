package o;

import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class MetadataItem implements Callable<Void>, dataStart {
    static final FutureTask<Void> ah$a = new FutureTask<>(Functions.HaptikSDK$c, null);
    Thread ag$a;
    final Runnable ah$b;
    final ExecutorService valueOf;
    final AtomicReference<Future<?>> toString = new AtomicReference<>();
    final AtomicReference<Future<?>> values = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetadataItem(Runnable runnable, ExecutorService executorService) {
        this.ah$b = runnable;
        this.valueOf = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: valueOf */
    public Void call() {
        this.ag$a = Thread.currentThread();
        try {
            this.ah$b.run();
            this.ag$a = null;
            ag$a(this.valueOf.submit(this));
            return null;
        } catch (Throwable th) {
            this.ag$a = null;
            endMetadataList.valueOf(th);
            throw th;
        }
    }

    @Override // o.dataStart
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.toString;
        FutureTask<Void> futureTask = ah$a;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.ag$a != Thread.currentThread());
        }
        Future<?> andSet2 = this.values.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.ag$a != Thread.currentThread());
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return this.toString.get() == ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.toString.get();
            if (future2 == ah$a) {
                future.cancel(this.ag$a != Thread.currentThread());
                return;
            }
        } while (!this.toString.compareAndSet(future2, future));
    }

    void ag$a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.values.get();
            if (future2 == ah$a) {
                future.cancel(this.ag$a != Thread.currentThread());
                return;
            }
        } while (!this.values.compareAndSet(future2, future));
    }
}
