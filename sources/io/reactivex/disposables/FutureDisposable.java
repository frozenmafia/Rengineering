package io.reactivex.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes7.dex */
final class FutureDisposable extends AtomicReference<Future<?>> implements FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = 6545242830671168775L;
    private final boolean allowInterrupt;

    FutureDisposable(Future<?> future, boolean z) {
        super(future);
        this.allowInterrupt = z;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        Future<?> future = get();
        return future == null || future.isDone();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.allowInterrupt);
        }
    }
}
