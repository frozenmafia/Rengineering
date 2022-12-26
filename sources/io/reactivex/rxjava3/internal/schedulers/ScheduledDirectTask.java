package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Callable;
import o.endMetadataList;
/* loaded from: classes7.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // io.reactivex.rxjava3.internal.schedulers.AbstractDirectTask
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            lazySet(FINISHED);
            this.runner = null;
            return null;
        } catch (Throwable th) {
            endMetadataList.valueOf(th);
            throw th;
        }
    }
}
