package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableConcatWithMaybe<T> extends startObject<T, T> {
    final SwipeRefreshLayout.SavedState<? extends T> ah$a;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.valueOf.subscribe(new ConcatWithObserver(idlingResource, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class ConcatWithObserver<T> extends AtomicReference<dataStart> implements IdlingResource<T>, IdlingRegistry<T>, dataStart {
        private static final long serialVersionUID = -1953724749712440952L;
        final IdlingResource<? super T> downstream;
        boolean inMaybe;
        SwipeRefreshLayout.SavedState<? extends T> other;

        ConcatWithObserver(IdlingResource<? super T> idlingResource, SwipeRefreshLayout.SavedState<? extends T> savedState) {
            this.downstream = idlingResource;
            this.other = savedState;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            if (!DisposableHelper.setOnce(this, datastart) || this.inMaybe) {
                return;
            }
            this.downstream.onSubscribe(this);
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            this.downstream.onNext(t);
            this.downstream.onComplete();
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.IdlingResource
        public void onComplete() {
            if (this.inMaybe) {
                this.downstream.onComplete();
                return;
            }
            this.inMaybe = true;
            DisposableHelper.replace(this, null);
            SwipeRefreshLayout.SavedState<? extends T> savedState = this.other;
            this.other = null;
            savedState.ag$a(this);
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
}
