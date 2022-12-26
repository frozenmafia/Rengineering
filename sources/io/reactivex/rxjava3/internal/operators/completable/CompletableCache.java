package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableCache extends setSlingshotDistance implements SwipeRefreshLayout.AnonymousClass3 {
    final SwipeRefreshLayout.AnonymousClass1 HaptikSDK$b;
    final AtomicBoolean ah$a;
    Throwable toString;
    final AtomicReference<InnerCompletableCache[]> values;
    static final InnerCompletableCache[] valueOf = new InnerCompletableCache[0];
    static final InnerCompletableCache[] ag$a = new InnerCompletableCache[0];

    @Override // o.SwipeRefreshLayout.AnonymousClass3
    public void onSubscribe(dataStart datastart) {
    }

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        InnerCompletableCache innerCompletableCache = new InnerCompletableCache(anonymousClass3);
        anonymousClass3.onSubscribe(innerCompletableCache);
        if (valueOf(innerCompletableCache)) {
            if (innerCompletableCache.isDisposed()) {
                values(innerCompletableCache);
            }
            if (this.ah$a.compareAndSet(false, true)) {
                this.HaptikSDK$b.values(this);
                return;
            }
            return;
        }
        Throwable th = this.toString;
        if (th != null) {
            anonymousClass3.onError(th);
        } else {
            anonymousClass3.onComplete();
        }
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass3
    public void onError(Throwable th) {
        InnerCompletableCache[] andSet;
        this.toString = th;
        for (InnerCompletableCache innerCompletableCache : this.values.getAndSet(ag$a)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.downstream.onError(th);
            }
        }
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass3
    public void onComplete() {
        InnerCompletableCache[] andSet;
        for (InnerCompletableCache innerCompletableCache : this.values.getAndSet(ag$a)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.downstream.onComplete();
            }
        }
    }

    boolean valueOf(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = this.values.get();
            if (innerCompletableCacheArr == ag$a) {
                return false;
            }
            int length = innerCompletableCacheArr.length;
            innerCompletableCacheArr2 = new InnerCompletableCache[length + 1];
            System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr2, 0, length);
            innerCompletableCacheArr2[length] = innerCompletableCache;
        } while (!this.values.compareAndSet(innerCompletableCacheArr, innerCompletableCacheArr2));
        return true;
    }

    void values(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = this.values.get();
            int length = innerCompletableCacheArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (innerCompletableCacheArr[i2] == innerCompletableCache) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                innerCompletableCacheArr2 = valueOf;
            } else {
                InnerCompletableCache[] innerCompletableCacheArr3 = new InnerCompletableCache[length - 1];
                System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr3, 0, i);
                System.arraycopy(innerCompletableCacheArr, i + 1, innerCompletableCacheArr3, i, (length - i) - 1);
                innerCompletableCacheArr2 = innerCompletableCacheArr3;
            }
        } while (!this.values.compareAndSet(innerCompletableCacheArr, innerCompletableCacheArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class InnerCompletableCache extends AtomicBoolean implements dataStart {
        private static final long serialVersionUID = 8943152917179642732L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;

        InnerCompletableCache(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
            this.downstream = anonymousClass3;
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get();
        }

        @Override // o.dataStart
        public void dispose() {
            if (compareAndSet(false, true)) {
                CompletableCache.this.values(this);
            }
        }
    }
}
