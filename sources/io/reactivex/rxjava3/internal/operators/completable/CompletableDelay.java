package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getLoopers;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableDelay extends setSlingshotDistance {
    final long ag$a;
    final getLoopers ah$a;
    final SwipeRefreshLayout.AnonymousClass1 toString;
    final boolean valueOf;
    final TimeUnit values;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        this.toString.values(new Delay(anonymousClass3, this.ag$a, this.values, this.ah$a, this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class Delay extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass3, Runnable, dataStart {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final SwipeRefreshLayout.AnonymousClass3 downstream;
        Throwable error;
        final getLoopers scheduler;
        final TimeUnit unit;

        Delay(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, long j, TimeUnit timeUnit, getLoopers getloopers, boolean z) {
            this.downstream = anonymousClass3;
            this.delay = j;
            this.unit = timeUnit;
            this.scheduler = getloopers;
            this.delayError = z;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.setOnce(this, datastart)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.values(this, this.delay, this.unit));
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.values(this, this.delayError ? this.delay : 0L, this.unit));
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            this.error = null;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }
}
