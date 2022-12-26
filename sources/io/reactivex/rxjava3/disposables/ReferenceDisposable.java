package io.reactivex.rxjava3.disposables;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.dataStart;
/* loaded from: classes5.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements dataStart {
    private static final long serialVersionUID = 6537757548749041217L;

    protected abstract void onDisposed(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceDisposable(T t) {
        super(t);
        Objects.requireNonNull(t, "value is null");
    }

    @Override // o.dataStart
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        onDisposed(andSet);
    }

    @Override // o.dataStart
    public final boolean isDisposed() {
        return get() == null;
    }
}
