package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import o.IdlingRegistry;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
/* loaded from: classes7.dex */
public final class MaybeToObservable<T> extends SwipeRefreshLayout.SavedState.AnonymousClass1<T> {
    final SwipeRefreshLayout.SavedState<T> ah$a;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.ah$a.ag$a(ag$a(idlingResource));
    }

    public static <T> IdlingRegistry<T> ag$a(IdlingResource<? super T> idlingResource) {
        return new MaybeToObservableObserver(idlingResource);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements IdlingRegistry<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        dataStart upstream;

        MaybeToObservableObserver(IdlingResource<? super T> idlingResource) {
            super(idlingResource);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            error(th);
        }

        @Override // o.IdlingRegistry
        public void onComplete() {
            complete();
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, o.dataStart
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }
    }
}
