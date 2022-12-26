package io.reactivex.internal.observers;

import o.SupportSQLiteOpenHelper;
import o.setProgressBackgroundColor;
/* loaded from: classes5.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    static final int DISPOSED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int TERMINATED = 2;
    private static final long serialVersionUID = -5502432239815349361L;
    protected final SupportSQLiteOpenHelper.Factory<? super T> downstream;
    protected T value;

    public DeferredScalarDisposable(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.downstream = factory;
    }

    @Override // o.e
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }

    public final void complete(T t) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        SupportSQLiteOpenHelper.Factory<? super T> factory = this.downstream;
        if (i == 8) {
            this.value = t;
            lazySet(16);
            factory.onNext(null);
        } else {
            lazySet(2);
            factory.onNext(t);
        }
        if (get() != 4) {
            factory.onComplete();
        }
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            setProgressBackgroundColor.values(th);
            return;
        }
        lazySet(2);
        this.downstream.onError(th);
    }

    public final void complete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.downstream.onComplete();
    }

    @Override // o.elevationSupported
    public final T poll() throws Exception {
        if (get() == 16) {
            T t = this.value;
            this.value = null;
            lazySet(32);
            return t;
        }
        return null;
    }

    @Override // o.elevationSupported
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // o.elevationSupported
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        set(4);
        this.value = null;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public final boolean isDisposed() {
        return get() == 4;
    }
}
