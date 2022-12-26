package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import o.FlatBufferBuilder;
import o.Nested;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.endMetadataList;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableDoFinally extends setSlingshotDistance {
    final Nested ag$a;
    final SwipeRefreshLayout.AnonymousClass1 toString;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        this.toString.values(new DoFinallyObserver(anonymousClass3, this.ag$a));
    }

    /* loaded from: classes7.dex */
    static final class DoFinallyObserver extends AtomicInteger implements SwipeRefreshLayout.AnonymousClass3, dataStart {
        private static final long serialVersionUID = 4109457741734051389L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;
        final Nested onFinally;
        dataStart upstream;

        DoFinallyObserver(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, Nested nested) {
            this.downstream = anonymousClass3;
            this.onFinally = nested;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // o.dataStart
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.ag$a();
                } catch (Throwable th) {
                    FlatBufferBuilder.ah$a(th);
                    endMetadataList.valueOf(th);
                }
            }
        }
    }
}
