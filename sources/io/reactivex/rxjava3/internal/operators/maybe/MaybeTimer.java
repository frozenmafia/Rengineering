package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getLoopers;
/* loaded from: classes7.dex */
public final class MaybeTimer extends SwipeRefreshLayout.AnonymousClass8<Long> {
    final long toString;
    final getLoopers valueOf;
    final TimeUnit values;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super Long> idlingRegistry) {
        TimerDisposable timerDisposable = new TimerDisposable(idlingRegistry);
        idlingRegistry.onSubscribe(timerDisposable);
        timerDisposable.setFuture(this.valueOf.values(timerDisposable, this.toString, this.values));
    }

    /* loaded from: classes7.dex */
    static final class TimerDisposable extends AtomicReference<dataStart> implements dataStart, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;
        final IdlingRegistry<? super Long> downstream;

        TimerDisposable(IdlingRegistry<? super Long> idlingRegistry) {
            this.downstream = idlingRegistry;
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
