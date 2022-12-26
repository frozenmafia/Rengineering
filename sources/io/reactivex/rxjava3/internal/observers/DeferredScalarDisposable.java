package io.reactivex.rxjava3.internal.observers;

import o.IdlingResource;
import o.endMetadataList;
/* loaded from: classes7.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    static final int DISPOSED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int TERMINATED = 2;
    private static final long serialVersionUID = -5502432239815349361L;
    protected final IdlingResource<? super T> downstream;
    protected T value;

    public DeferredScalarDisposable(IdlingResource<? super T> idlingResource) {
        this.downstream = idlingResource;
    }

    @Override // o.notNested
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
        IdlingResource<? super T> idlingResource = this.downstream;
        if (i == 8) {
            this.value = t;
            lazySet(16);
            idlingResource.onNext(null);
        } else {
            lazySet(2);
            idlingResource.onNext(t);
        }
        if (get() != 4) {
            idlingResource.onComplete();
        }
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            endMetadataList.valueOf(th);
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

    @Override // o.putByte
    public final T poll() {
        if (get() == 16) {
            T t = this.value;
            this.value = null;
            lazySet(32);
            return t;
        }
        return null;
    }

    @Override // o.putByte
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // o.putByte
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public void dispose() {
        set(4);
        this.value = null;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    @Override // o.dataStart
    public final boolean isDisposed() {
        return get() == 4;
    }
}
