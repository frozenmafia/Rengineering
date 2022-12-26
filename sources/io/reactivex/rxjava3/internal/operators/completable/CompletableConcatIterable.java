package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import o.FlatBufferBuilder;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableConcatIterable extends setSlingshotDistance {
    final Iterable<? extends SwipeRefreshLayout.AnonymousClass1> ag$a;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        try {
            Iterator<? extends SwipeRefreshLayout.AnonymousClass1> it = this.ag$a.iterator();
            Objects.requireNonNull(it, "The iterator returned is null");
            ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(anonymousClass3, it);
            anonymousClass3.onSubscribe(concatInnerObserver.sd);
            concatInnerObserver.next();
        } catch (Throwable th) {
            FlatBufferBuilder.ah$a(th);
            EmptyDisposable.error(th, anonymousClass3);
        }
    }

    /* loaded from: classes7.dex */
    static final class ConcatInnerObserver extends AtomicInteger implements SwipeRefreshLayout.AnonymousClass3 {
        private static final long serialVersionUID = -7965400327305809232L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;
        final SequentialDisposable sd = new SequentialDisposable();
        final Iterator<? extends SwipeRefreshLayout.AnonymousClass1> sources;

        ConcatInnerObserver(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, Iterator<? extends SwipeRefreshLayout.AnonymousClass1> it) {
            this.downstream = anonymousClass3;
            this.sources = it;
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
                Iterator<? extends SwipeRefreshLayout.AnonymousClass1> it = this.sources;
                while (!this.sd.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            this.downstream.onComplete();
                            return;
                        }
                        try {
                            SwipeRefreshLayout.AnonymousClass1 next = it.next();
                            Objects.requireNonNull(next, "The CompletableSource returned is null");
                            next.values(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            FlatBufferBuilder.ah$a(th);
                            this.downstream.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        FlatBufferBuilder.ah$a(th2);
                        this.downstream.onError(th2);
                        return;
                    }
                }
            }
        }
    }
}
