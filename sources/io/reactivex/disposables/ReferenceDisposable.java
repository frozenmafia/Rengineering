package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.discoverAndInitialize;
/* loaded from: classes5.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = 6537757548749041217L;

    protected abstract void onDisposed(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReferenceDisposable(T t) {
        super(discoverAndInitialize.ag$a(t, "value is null"));
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        onDisposed(andSet);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public final boolean isDisposed() {
        return get() == null;
    }
}
