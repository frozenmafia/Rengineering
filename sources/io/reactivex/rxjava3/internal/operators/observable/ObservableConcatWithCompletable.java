package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableConcatWithCompletable<T> extends startObject<T, T> {
    final SwipeRefreshLayout.AnonymousClass1 ah$a;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.valueOf.subscribe(new ConcatWithObserver(idlingResource, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class ConcatWithObserver<T> extends AtomicReference<dataStart> implements IdlingResource<T>, SwipeRefreshLayout.AnonymousClass3, dataStart {
        private static final long serialVersionUID = -1953724749712440952L;
        final IdlingResource<? super T> downstream;
        boolean inCompletable;
        SwipeRefreshLayout.AnonymousClass1 other;

        ConcatWithObserver(IdlingResource<? super T> idlingResource, SwipeRefreshLayout.AnonymousClass1 anonymousClass1) {
            this.downstream = idlingResource;
            this.other = anonymousClass1;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            if (!DisposableHelper.setOnce(this, datastart) || this.inCompletable) {
                return;
            }
            this.downstream.onSubscribe(this);
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.IdlingResource
        public void onComplete() {
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            DisposableHelper.replace(this, null);
            SwipeRefreshLayout.AnonymousClass1 anonymousClass1 = this.other;
            this.other = null;
            anonymousClass1.values(this);
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
