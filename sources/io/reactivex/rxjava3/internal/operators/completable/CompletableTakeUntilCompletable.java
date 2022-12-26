package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.endMetadataList;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableTakeUntilCompletable extends setSlingshotDistance {
    final SwipeRefreshLayout.AnonymousClass1 ah$a;
    final setSlingshotDistance valueOf;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(anonymousClass3);
        anonymousClass3.onSubscribe(takeUntilMainObserver);
        this.ah$a.values(takeUntilMainObserver.other);
        this.valueOf.values(takeUntilMainObserver);
    }

    /* loaded from: classes7.dex */
    static final class TakeUntilMainObserver extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass3, dataStart {
        private static final long serialVersionUID = 3533011714830024923L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;
        final OtherObserver other = new OtherObserver(this);
        final AtomicBoolean once = new AtomicBoolean();

        TakeUntilMainObserver(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
            this.downstream = anonymousClass3;
        }

        @Override // o.dataStart
        public void dispose() {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this);
                DisposableHelper.dispose(this.other);
            }
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.once.get();
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.setOnce(this, datastart);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onComplete() {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.other);
                this.downstream.onComplete();
            }
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.other);
                this.downstream.onError(th);
                return;
            }
            endMetadataList.valueOf(th);
        }

        void innerComplete() {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this);
                this.downstream.onComplete();
            }
        }

        void innerError(Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this);
                this.downstream.onError(th);
                return;
            }
            endMetadataList.valueOf(th);
        }

        /* loaded from: classes7.dex */
        static final class OtherObserver extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass3 {
            private static final long serialVersionUID = 5176264485428790318L;
            final TakeUntilMainObserver parent;

            OtherObserver(TakeUntilMainObserver takeUntilMainObserver) {
                this.parent = takeUntilMainObserver;
            }

            @Override // o.SwipeRefreshLayout.AnonymousClass3
            public void onSubscribe(dataStart datastart) {
                DisposableHelper.setOnce(this, datastart);
            }

            @Override // o.SwipeRefreshLayout.AnonymousClass3
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // o.SwipeRefreshLayout.AnonymousClass3
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }
        }
    }
}
