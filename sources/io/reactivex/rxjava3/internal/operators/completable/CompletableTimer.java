package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getLoopers;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableTimer extends setSlingshotDistance {
    final long ah$a;
    final getLoopers valueOf;
    final TimeUnit values;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        TimerDisposable timerDisposable = new TimerDisposable(anonymousClass3);
        anonymousClass3.onSubscribe(timerDisposable);
        timerDisposable.setFuture(this.valueOf.values(timerDisposable, this.ah$a, this.values));
    }

    /* loaded from: classes7.dex */
    static final class TimerDisposable extends AtomicReference<dataStart> implements dataStart, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;

        TimerDisposable(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
            this.downstream = anonymousClass3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.downstream.onComplete();
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
