package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.dataStart;
/* loaded from: classes7.dex */
public final class MaybeDelayWithCompletable<T> extends SwipeRefreshLayout.AnonymousClass8<T> {
    final SwipeRefreshLayout.SavedState<T> ag$a;
    final SwipeRefreshLayout.AnonymousClass1 valueOf;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        this.valueOf.values(new OtherObserver(idlingRegistry, this.ag$a));
    }

    /* loaded from: classes7.dex */
    static final class OtherObserver<T> extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass3, dataStart {
        private static final long serialVersionUID = 703409937383992161L;
        final IdlingRegistry<? super T> downstream;
        final SwipeRefreshLayout.SavedState<T> source;

        OtherObserver(IdlingRegistry<? super T> idlingRegistry, SwipeRefreshLayout.SavedState<T> savedState) {
            this.downstream = idlingRegistry;
            this.source = savedState;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.setOnce(this, datastart)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onComplete() {
            this.source.ag$a(new toString(this, this.downstream));
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

    /* loaded from: classes7.dex */
    static final class toString<T> implements IdlingRegistry<T> {
        final AtomicReference<dataStart> ah$a;
        final IdlingRegistry<? super T> valueOf;

        toString(AtomicReference<dataStart> atomicReference, IdlingRegistry<? super T> idlingRegistry) {
            this.ah$a = atomicReference;
            this.valueOf = idlingRegistry;
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.replace(this.ah$a, datastart);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            this.valueOf.onSuccess(t);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.valueOf.onError(th);
        }

        @Override // o.IdlingRegistry
        public void onComplete() {
            this.valueOf.onComplete();
        }
    }
}
