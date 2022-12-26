package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
/* loaded from: classes7.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<dataStart> implements IdlingResource<T>, dataStart {
    private static final long serialVersionUID = -8612022020200669122L;
    final IdlingResource<? super T> downstream;
    final AtomicReference<dataStart> upstream = new AtomicReference<>();

    public ObserverResourceWrapper(IdlingResource<? super T> idlingResource) {
        this.downstream = idlingResource;
    }

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
        if (DisposableHelper.setOnce(this.upstream, datastart)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // o.IdlingResource
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    @Override // o.IdlingResource
    public void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    @Override // o.dataStart
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    public void setResource(dataStart datastart) {
        DisposableHelper.set(this, datastart);
    }
}
