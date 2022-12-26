package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.dataStart;
import o.getLoopers;
import o.sizedByteArray;
/* loaded from: classes7.dex */
public final class MaybeUnsubscribeOn<T> extends sizedByteArray<T, T> {
    final getLoopers values;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        this.ag$a.ag$a(new UnsubscribeOnMaybeObserver(idlingRegistry, this.values));
    }

    /* loaded from: classes7.dex */
    static final class UnsubscribeOnMaybeObserver<T> extends AtomicReference<dataStart> implements IdlingRegistry<T>, dataStart, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        final IdlingRegistry<? super T> downstream;
        dataStart ds;
        final getLoopers scheduler;

        UnsubscribeOnMaybeObserver(IdlingRegistry<? super T> idlingRegistry, getLoopers getloopers) {
            this.downstream = idlingRegistry;
            this.scheduler = getloopers;
        }

        @Override // o.dataStart
        public void dispose() {
            dataStart andSet = getAndSet(DisposableHelper.DISPOSED);
            if (andSet != DisposableHelper.DISPOSED) {
                this.ds = andSet;
                this.scheduler.values(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.ds.dispose();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.setOnce(this, datastart)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.IdlingRegistry
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
