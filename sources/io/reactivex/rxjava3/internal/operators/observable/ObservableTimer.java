package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getLoopers;
/* loaded from: classes7.dex */
public final class ObservableTimer extends SwipeRefreshLayout.SavedState.AnonymousClass1<Long> {
    final getLoopers toString;
    final long valueOf;
    final TimeUnit values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super Long> idlingResource) {
        TimerObserver timerObserver = new TimerObserver(idlingResource);
        idlingResource.onSubscribe(timerObserver);
        timerObserver.setResource(this.toString.values(timerObserver, this.valueOf, this.values));
    }

    /* loaded from: classes7.dex */
    static final class TimerObserver extends AtomicReference<dataStart> implements dataStart, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final IdlingResource<? super Long> downstream;

        TimerObserver(IdlingResource<? super Long> idlingResource) {
            this.downstream = idlingResource;
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            this.downstream.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            this.downstream.onComplete();
        }

        public void setResource(dataStart datastart) {
            DisposableHelper.trySet(this, datastart);
        }
    }
}
