package io.reactivex.rxjava3.internal.operators.completable;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.FlatBufferBuilder;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.endMetadataList;
import o.growByteBuffer;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableMergeIterable extends setSlingshotDistance {
    final Iterable<? extends SwipeRefreshLayout.AnonymousClass1> values;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        growByteBuffer growbytebuffer = new growByteBuffer();
        AtomicInteger atomicInteger = new AtomicInteger(1);
        MergeCompletableObserver mergeCompletableObserver = new MergeCompletableObserver(anonymousClass3, growbytebuffer, atomicInteger);
        anonymousClass3.onSubscribe(mergeCompletableObserver);
        try {
            Iterator<? extends SwipeRefreshLayout.AnonymousClass1> it = this.values.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            Iterator<? extends SwipeRefreshLayout.AnonymousClass1> it2 = it;
            while (!growbytebuffer.isDisposed()) {
                try {
                    if (it2.hasNext()) {
                        if (growbytebuffer.isDisposed()) {
                            return;
                        }
                        try {
                            SwipeRefreshLayout.AnonymousClass1 next = it2.next();
                            Objects.requireNonNull(next, "The iterator returned a null CompletableSource");
                            SwipeRefreshLayout.AnonymousClass1 anonymousClass1 = next;
                            if (growbytebuffer.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            anonymousClass1.values(mergeCompletableObserver);
                        } catch (Throwable th) {
                            FlatBufferBuilder.ah$a(th);
                            growbytebuffer.dispose();
                            mergeCompletableObserver.onError(th);
                            return;
                        }
                    } else {
                        mergeCompletableObserver.onComplete();
                        return;
                    }
                } catch (Throwable th2) {
                    FlatBufferBuilder.ah$a(th2);
                    growbytebuffer.dispose();
                    mergeCompletableObserver.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            FlatBufferBuilder.ah$a(th3);
            anonymousClass3.onError(th3);
        }
    }

    /* loaded from: classes7.dex */
    static final class MergeCompletableObserver extends AtomicBoolean implements SwipeRefreshLayout.AnonymousClass3, dataStart {
        private static final long serialVersionUID = -7730517613164279224L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;
        final growByteBuffer set;
        final AtomicInteger wip;

        MergeCompletableObserver(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, growByteBuffer growbytebuffer, AtomicInteger atomicInteger) {
            this.downstream = anonymousClass3;
            this.set = growbytebuffer;
            this.wip = atomicInteger;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            this.set.ah$a(datastart);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            this.set.dispose();
            if (compareAndSet(false, true)) {
                this.downstream.onError(th);
            } else {
                endMetadataList.valueOf(th);
            }
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onComplete() {
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // o.dataStart
        public void dispose() {
            this.set.dispose();
            set(true);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.set.isDisposed();
        }
    }
}
