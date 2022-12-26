package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.decrement;
/* loaded from: classes7.dex */
public final class SingleToObservable<T> extends SwipeRefreshLayout.SavedState.AnonymousClass1<T> {
    final decrement<? extends T> toString;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.toString.values(values(idlingResource));
    }

    public static <T> IdlingResource.ResourceCallback<T> values(IdlingResource<? super T> idlingResource) {
        return new SingleToObservableObserver(idlingResource);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements IdlingResource.ResourceCallback<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        dataStart upstream;

        SingleToObservableObserver(IdlingResource<? super T> idlingResource) {
            super(idlingResource);
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            error(th);
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, o.dataStart
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }
    }
}
