package o;

import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class animateOffsetToCorrectPosition implements Callable<Void>, FrameworkSQLiteDatabase.AnonymousClass2 {
    static final FutureTask<Void> values = new FutureTask<>(Functions.HaptikSDK$c, null);
    final Runnable HaptikSDK$c;
    final ExecutorService toString;
    Thread valueOf;
    final AtomicReference<Future<?>> ah$a = new AtomicReference<>();
    final AtomicReference<Future<?>> ag$a = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public animateOffsetToCorrectPosition(Runnable runnable, ExecutorService executorService) {
        this.HaptikSDK$c = runnable;
        this.toString = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: values */
    public Void call() throws Exception {
        this.valueOf = Thread.currentThread();
        try {
            this.HaptikSDK$c.run();
            ah$a(this.toString.submit(this));
            this.valueOf = null;
        } catch (Throwable th) {
            this.valueOf = null;
            setProgressBackgroundColor.values(th);
        }
        return null;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.ah$a;
        FutureTask<Void> futureTask = values;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.valueOf != Thread.currentThread());
        }
        Future<?> andSet2 = this.ag$a.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.valueOf != Thread.currentThread());
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.ah$a.get() == values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.ah$a.get();
            if (future2 == values) {
                future.cancel(this.valueOf != Thread.currentThread());
                return;
            }
        } while (!this.ah$a.compareAndSet(future2, future));
    }

    void ah$a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.ag$a.get();
            if (future2 == values) {
                future.cancel(this.valueOf != Thread.currentThread());
                return;
            }
        } while (!this.ag$a.compareAndSet(future2, future));
    }
}
