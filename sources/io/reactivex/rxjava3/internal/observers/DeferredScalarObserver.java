package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import o.IdlingResource;
import o.dataStart;
/* loaded from: classes7.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements IdlingResource<T> {
    private static final long serialVersionUID = -266195175408988651L;
    protected dataStart upstream;

    public DeferredScalarObserver(IdlingResource<? super R> idlingResource) {
        super(idlingResource);
    }

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
        if (DisposableHelper.validate(this.upstream, datastart)) {
            this.upstream = datastart;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        this.value = null;
        error(th);
    }

    @Override // o.IdlingResource
    public void onComplete() {
        T t = this.value;
        if (t != null) {
            this.value = null;
            complete(t);
            return;
        }
        complete();
    }

    @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, o.dataStart
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }
}
