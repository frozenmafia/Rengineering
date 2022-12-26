package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.getLoopers;
import o.onTransitionToIdle;
/* loaded from: classes7.dex */
public final class SingleTimer extends onTransitionToIdle<Long> {
    final TimeUnit ag$a;
    final long ah$a;
    final getLoopers toString;

    @Override // o.onTransitionToIdle
    public void toString(IdlingResource.ResourceCallback<? super Long> resourceCallback) {
        TimerDisposable timerDisposable = new TimerDisposable(resourceCallback);
        resourceCallback.onSubscribe(timerDisposable);
        timerDisposable.setFuture(this.toString.values(timerDisposable, this.ah$a, this.ag$a));
    }

    /* loaded from: classes7.dex */
    static final class TimerDisposable extends AtomicReference<dataStart> implements dataStart, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        final IdlingResource.ResourceCallback<? super Long> downstream;

        TimerDisposable(IdlingResource.ResourceCallback<? super Long> resourceCallback) {
            this.downstream = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.downstream.onSuccess(0L);
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        void setFuture(dataStart datastart) {
            DisposableHelper.replace(this, datastart);
        }
    }
}
