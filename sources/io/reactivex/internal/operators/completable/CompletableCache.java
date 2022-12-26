package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.isDraggable;
/* loaded from: classes7.dex */
public final class CompletableCache extends isDraggable implements SlidingPaneLayout.SavedState {
    final SlidingPaneLayout.TouchBlocker HaptikSDK$a;
    final AtomicBoolean ah$a;
    final AtomicReference<InnerCompletableCache[]> valueOf;
    Throwable values;
    static final InnerCompletableCache[] toString = new InnerCompletableCache[0];
    static final InnerCompletableCache[] ag$a = new InnerCompletableCache[0];

    @Override // o.SlidingPaneLayout.SavedState
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
    }

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        InnerCompletableCache innerCompletableCache = new InnerCompletableCache(savedState);
        savedState.onSubscribe(innerCompletableCache);
        if (ah$a(innerCompletableCache)) {
            if (innerCompletableCache.isDisposed()) {
                valueOf(innerCompletableCache);
            }
            if (this.ah$a.compareAndSet(false, true)) {
                this.HaptikSDK$a.ag$a(this);
                return;
            }
            return;
        }
        Throwable th = this.values;
        if (th != null) {
            savedState.onError(th);
        } else {
            savedState.onComplete();
        }
    }

    @Override // o.SlidingPaneLayout.SavedState
    public void onError(Throwable th) {
        InnerCompletableCache[] andSet;
        this.values = th;
        for (InnerCompletableCache innerCompletableCache : this.valueOf.getAndSet(ag$a)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.downstream.onError(th);
            }
        }
    }

    @Override // o.SlidingPaneLayout.SavedState
    public void onComplete() {
        InnerCompletableCache[] andSet;
        for (InnerCompletableCache innerCompletableCache : this.valueOf.getAndSet(ag$a)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.downstream.onComplete();
            }
        }
    }

    boolean ah$a(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = this.valueOf.get();
            if (innerCompletableCacheArr == ag$a) {
                return false;
            }
            int length = innerCompletableCacheArr.length;
            innerCompletableCacheArr2 = new InnerCompletableCache[length + 1];
            System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr2, 0, length);
            innerCompletableCacheArr2[length] = innerCompletableCache;
        } while (!this.valueOf.compareAndSet(innerCompletableCacheArr, innerCompletableCacheArr2));
        return true;
    }

    void valueOf(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = this.valueOf.get();
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
                innerCompletableCacheArr2 = toString;
            } else {
                InnerCompletableCache[] innerCompletableCacheArr3 = new InnerCompletableCache[length - 1];
                System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr3, 0, i);
                System.arraycopy(innerCompletableCacheArr, i + 1, innerCompletableCacheArr3, i, (length - i) - 1);
                innerCompletableCacheArr2 = innerCompletableCacheArr3;
            }
        } while (!this.valueOf.compareAndSet(innerCompletableCacheArr, innerCompletableCacheArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class InnerCompletableCache extends AtomicBoolean implements FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 8943152917179642732L;
        final SlidingPaneLayout.SavedState downstream;

        InnerCompletableCache(SlidingPaneLayout.SavedState savedState) {
            this.downstream = savedState;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            if (compareAndSet(false, true)) {
                CompletableCache.this.valueOf(this);
            }
        }
    }
}
