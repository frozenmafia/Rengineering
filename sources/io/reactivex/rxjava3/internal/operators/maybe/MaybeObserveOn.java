package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.dataStart;
import o.getLoopers;
import o.sizedByteArray;
/* loaded from: classes7.dex */
public final class MaybeObserveOn<T> extends sizedByteArray<T, T> {
    final getLoopers values;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        this.ag$a.ag$a(new ObserveOnMaybeObserver(idlingRegistry, this.values));
    }

    /* loaded from: classes7.dex */
    static final class ObserveOnMaybeObserver<T> extends AtomicReference<dataStart> implements IdlingRegistry<T>, dataStart, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final IdlingRegistry<? super T> downstream;
        Throwable error;
        final getLoopers scheduler;
        T value;

        ObserveOnMaybeObserver(IdlingRegistry<? super T> idlingRegistry, getLoopers getloopers) {
            this.downstream = idlingRegistry;
            this.scheduler = getloopers;
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
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
            this.value = t;
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // o.IdlingRegistry
        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            T t = this.value;
            if (t != null) {
                this.value = null;
                this.downstream.onSuccess(t);
                return;
            }
            this.downstream.onComplete();
        }
    }
}
