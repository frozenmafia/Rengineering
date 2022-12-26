package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.dataStart;
import o.getLoopers;
import o.sizedByteArray;
/* loaded from: classes7.dex */
public final class MaybeDelay<T> extends sizedByteArray<T, T> {
    final long ah$a;
    final boolean toString;
    final getLoopers valueOf;
    final TimeUnit values;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        this.ag$a.ag$a(new DelayMaybeObserver(idlingRegistry, this.ah$a, this.values, this.valueOf, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class DelayMaybeObserver<T> extends AtomicReference<dataStart> implements IdlingRegistry<T>, dataStart, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;
        final long delay;
        final boolean delayError;
        final IdlingRegistry<? super T> downstream;
        Throwable error;
        final getLoopers scheduler;
        final TimeUnit unit;
        T value;

        DelayMaybeObserver(IdlingRegistry<? super T> idlingRegistry, long j, TimeUnit timeUnit, getLoopers getloopers, boolean z) {
            this.downstream = idlingRegistry;
            this.delay = j;
            this.unit = timeUnit;
            this.scheduler = getloopers;
            this.delayError = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
                return;
            }
            T t = this.value;
            if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onComplete();
            }
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
            schedule(this.delay);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.error = th;
            schedule(this.delayError ? this.delay : 0L);
        }

        @Override // o.IdlingRegistry
        public void onComplete() {
            schedule(this.delay);
        }

        void schedule(long j) {
            DisposableHelper.replace(this, this.scheduler.values(this, j, this.unit));
        }
    }
}
