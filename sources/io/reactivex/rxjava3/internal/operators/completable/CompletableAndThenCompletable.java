package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableAndThenCompletable extends setSlingshotDistance {
    final SwipeRefreshLayout.AnonymousClass1 toString;
    final SwipeRefreshLayout.AnonymousClass1 values;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        this.values.values(new SourceObserver(anonymousClass3, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class SourceObserver extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass3, dataStart {
        private static final long serialVersionUID = -4101678820158072998L;
        final SwipeRefreshLayout.AnonymousClass3 actualObserver;
        final SwipeRefreshLayout.AnonymousClass1 next;

        SourceObserver(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, SwipeRefreshLayout.AnonymousClass1 anonymousClass1) {
            this.actualObserver = anonymousClass3;
            this.next = anonymousClass1;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.setOnce(this, datastart)) {
                this.actualObserver.onSubscribe(this);
            }
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            this.actualObserver.onError(th);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onComplete() {
            SwipeRefreshLayout.AnonymousClass1 anonymousClass1 = this.next;
            final SwipeRefreshLayout.AnonymousClass3 anonymousClass3 = this.actualObserver;
            anonymousClass1.values(new SwipeRefreshLayout.AnonymousClass3(this, anonymousClass3) { // from class: io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable$ah$a
                final AtomicReference<dataStart> ag$a;
                final SwipeRefreshLayout.AnonymousClass3 values;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.ag$a = this;
                    this.values = anonymousClass3;
                }

                @Override // o.SwipeRefreshLayout.AnonymousClass3
                public void onSubscribe(dataStart datastart) {
                    DisposableHelper.replace(this.ag$a, datastart);
                }

                @Override // o.SwipeRefreshLayout.AnonymousClass3
                public void onComplete() {
                    this.values.onComplete();
                }

                @Override // o.SwipeRefreshLayout.AnonymousClass3
                public void onError(Throwable th) {
                    this.values.onError(th);
                }
            });
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }
}
