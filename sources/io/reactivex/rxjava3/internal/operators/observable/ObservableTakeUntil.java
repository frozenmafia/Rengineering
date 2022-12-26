package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.registerLooperAsIdlingResource;
import o.sdkAdded;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableTakeUntil<T, U> extends startObject<T, T> {
    final registerLooperAsIdlingResource<? extends U> ah$a;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(idlingResource);
        idlingResource.onSubscribe(takeUntilMainObserver);
        this.ah$a.subscribe(takeUntilMainObserver.otherObserver);
        this.valueOf.subscribe(takeUntilMainObserver);
    }

    /* loaded from: classes7.dex */
    static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements IdlingResource<T>, dataStart {
        private static final long serialVersionUID = 1418547743690811973L;
        final IdlingResource<? super T> downstream;
        final AtomicReference<dataStart> upstream = new AtomicReference<>();
        final TakeUntilMainObserver<T, U>.OtherObserver otherObserver = new OtherObserver();
        final AtomicThrowable error = new AtomicThrowable();

        TakeUntilMainObserver(IdlingResource<? super T> idlingResource) {
            this.downstream = idlingResource;
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.otherObserver);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.setOnce(this.upstream, datastart);
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            sdkAdded.ag$a(this.downstream, t, this, this.error);
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.otherObserver);
            sdkAdded.toString(this.downstream, th, this, this.error);
        }

        @Override // o.IdlingResource
        public void onComplete() {
            DisposableHelper.dispose(this.otherObserver);
            sdkAdded.values(this.downstream, this, this.error);
        }

        void otherError(Throwable th) {
            DisposableHelper.dispose(this.upstream);
            sdkAdded.toString(this.downstream, th, this, this.error);
        }

        void otherComplete() {
            DisposableHelper.dispose(this.upstream);
            sdkAdded.values(this.downstream, this, this.error);
        }

        /* loaded from: classes7.dex */
        final class OtherObserver extends AtomicReference<dataStart> implements IdlingResource<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            OtherObserver() {
            }

            @Override // o.IdlingResource
            public void onSubscribe(dataStart datastart) {
                DisposableHelper.setOnce(this, datastart);
            }

            @Override // o.IdlingResource
            public void onNext(U u) {
                DisposableHelper.dispose(this);
                TakeUntilMainObserver.this.otherComplete();
            }

            @Override // o.IdlingResource
            public void onError(Throwable th) {
                TakeUntilMainObserver.this.otherError(th);
            }

            @Override // o.IdlingResource
            public void onComplete() {
                TakeUntilMainObserver.this.otherComplete();
            }
        }
    }
}
