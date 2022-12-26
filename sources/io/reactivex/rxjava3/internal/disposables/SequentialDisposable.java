package io.reactivex.rxjava3.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import o.dataStart;
/* loaded from: classes5.dex */
public final class SequentialDisposable extends AtomicReference<dataStart> implements dataStart {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    public SequentialDisposable(dataStart datastart) {
        lazySet(datastart);
    }

    public boolean update(dataStart datastart) {
        return DisposableHelper.set(this, datastart);
    }

    public boolean replace(dataStart datastart) {
        return DisposableHelper.replace(this, datastart);
    }

    @Override // o.dataStart
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }
}
