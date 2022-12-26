package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.decrement;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableConcatWithSingle<T> extends startObject<T, T> {
    final decrement<? extends T> ah$a;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.valueOf.subscribe(new ConcatWithObserver(idlingResource, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class ConcatWithObserver<T> extends AtomicReference<dataStart> implements IdlingResource<T>, IdlingResource.ResourceCallback<T>, dataStart {
        private static final long serialVersionUID = -1953724749712440952L;
        final IdlingResource<? super T> downstream;
        boolean inSingle;
        decrement<? extends T> other;

        ConcatWithObserver(IdlingResource<? super T> idlingResource, decrement<? extends T> decrementVar) {
            this.downstream = idlingResource;
            this.other = decrementVar;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            if (!DisposableHelper.setOnce(this, datastart) || this.inSingle) {
                return;
            }
            this.downstream.onSubscribe(this);
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // o.IdlingResource.ResourceCallback
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
            this.inSingle = true;
            DisposableHelper.replace(this, null);
            decrement<? extends T> decrementVar = this.other;
            this.other = null;
            decrementVar.values(this);
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
