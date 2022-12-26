package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getLoopers;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableSubscribeOn extends setSlingshotDistance {
    final getLoopers ag$a;
    final SwipeRefreshLayout.AnonymousClass1 ah$a;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(anonymousClass3, this.ah$a);
        anonymousClass3.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.ag$a.values(subscribeOnObserver));
    }

    /* loaded from: classes7.dex */
    static final class SubscribeOnObserver extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass3, dataStart, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;
        final SwipeRefreshLayout.AnonymousClass1 source;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnObserver(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, SwipeRefreshLayout.AnonymousClass1 anonymousClass1) {
            this.downstream = anonymousClass3;
            this.source = anonymousClass1;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.values(this);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.setOnce(this, datastart);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }
}
