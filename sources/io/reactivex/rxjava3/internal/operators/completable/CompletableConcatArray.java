package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableConcatArray extends setSlingshotDistance {
    final SwipeRefreshLayout.AnonymousClass1[] ag$a;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(anonymousClass3, this.ag$a);
        anonymousClass3.onSubscribe(concatInnerObserver.sd);
        concatInnerObserver.next();
    }

    /* loaded from: classes7.dex */
    static final class ConcatInnerObserver extends AtomicInteger implements SwipeRefreshLayout.AnonymousClass3 {
        private static final long serialVersionUID = -7965400327305809232L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;
        int index;
        final SequentialDisposable sd = new SequentialDisposable();
        final SwipeRefreshLayout.AnonymousClass1[] sources;

        ConcatInnerObserver(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, SwipeRefreshLayout.AnonymousClass1[] anonymousClass1Arr) {
            this.downstream = anonymousClass3;
            this.sources = anonymousClass1Arr;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            this.sd.replace(datastart);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onComplete() {
            next();
        }

        void next() {
            if (!this.sd.isDisposed() && getAndIncrement() == 0) {
                SwipeRefreshLayout.AnonymousClass1[] anonymousClass1Arr = this.sources;
                while (!this.sd.isDisposed()) {
                    int i = this.index;
                    this.index = i + 1;
                    if (i == anonymousClass1Arr.length) {
                        this.downstream.onComplete();
                        return;
                    }
                    anonymousClass1Arr[i].values(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }
}
