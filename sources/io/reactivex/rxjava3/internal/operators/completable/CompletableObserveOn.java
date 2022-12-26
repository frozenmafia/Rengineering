package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getLoopers;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableObserveOn extends setSlingshotDistance {
    final SwipeRefreshLayout.AnonymousClass1 toString;
    final getLoopers values;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        this.toString.values(new ObserveOnCompletableObserver(anonymousClass3, this.values));
    }

    /* loaded from: classes7.dex */
    static final class ObserveOnCompletableObserver extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass3, dataStart, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;
        Throwable error;
        final getLoopers scheduler;

        ObserveOnCompletableObserver(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, getLoopers getloopers) {
            this.downstream = anonymousClass3;
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

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.setOnce(this, datastart)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
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
            this.downstream.onComplete();
        }
    }
}
