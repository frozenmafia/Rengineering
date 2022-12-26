package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.endMetadataList;
import o.growByteBuffer;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableMergeArray extends setSlingshotDistance {
    final SwipeRefreshLayout.AnonymousClass1[] toString;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        SwipeRefreshLayout.AnonymousClass1[] anonymousClass1Arr;
        growByteBuffer growbytebuffer = new growByteBuffer();
        InnerCompletableObserver innerCompletableObserver = new InnerCompletableObserver(anonymousClass3, new AtomicBoolean(), growbytebuffer, this.toString.length + 1);
        anonymousClass3.onSubscribe(innerCompletableObserver);
        for (SwipeRefreshLayout.AnonymousClass1 anonymousClass1 : this.toString) {
            if (growbytebuffer.isDisposed()) {
                return;
            }
            if (anonymousClass1 == null) {
                growbytebuffer.dispose();
                innerCompletableObserver.onError(new NullPointerException("A completable source is null"));
                return;
            }
            anonymousClass1.values(innerCompletableObserver);
        }
        innerCompletableObserver.onComplete();
    }

    /* loaded from: classes7.dex */
    static final class InnerCompletableObserver extends AtomicInteger implements SwipeRefreshLayout.AnonymousClass3, dataStart {
        private static final long serialVersionUID = -8360547806504310570L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;
        final AtomicBoolean once;
        final growByteBuffer set;

        InnerCompletableObserver(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, AtomicBoolean atomicBoolean, growByteBuffer growbytebuffer, int i) {
            this.downstream = anonymousClass3;
            this.once = atomicBoolean;
            this.set = growbytebuffer;
            lazySet(i);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            this.set.ah$a(datastart);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            this.set.dispose();
            if (this.once.compareAndSet(false, true)) {
                this.downstream.onError(th);
            } else {
                endMetadataList.valueOf(th);
            }
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // o.dataStart
        public void dispose() {
            this.set.dispose();
            this.once.set(true);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.set.isDisposed();
        }
    }
}
