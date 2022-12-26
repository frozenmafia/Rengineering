package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.dataStart;
/* loaded from: classes7.dex */
public final class MaybeCache<T> extends SwipeRefreshLayout.AnonymousClass8<T> implements IdlingRegistry<T> {
    T HaptikSDK$a;
    final AtomicReference<CacheDisposable<T>[]> ag$a;
    Throwable valueOf;
    final AtomicReference<SwipeRefreshLayout.SavedState<T>> values;
    static final CacheDisposable[] toString = new CacheDisposable[0];
    static final CacheDisposable[] ah$a = new CacheDisposable[0];

    @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
    public void onSubscribe(dataStart datastart) {
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(idlingRegistry, this);
        idlingRegistry.onSubscribe(cacheDisposable);
        if (toString(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                valueOf(cacheDisposable);
                return;
            }
            SwipeRefreshLayout.SavedState<T> andSet = this.values.getAndSet(null);
            if (andSet != null) {
                andSet.ag$a(this);
            }
        } else if (cacheDisposable.isDisposed()) {
        } else {
            Throwable th = this.valueOf;
            if (th != null) {
                idlingRegistry.onError(th);
                return;
            }
            Object obj = (T) this.HaptikSDK$a;
            if (obj != null) {
                idlingRegistry.onSuccess(obj);
            } else {
                idlingRegistry.onComplete();
            }
        }
    }

    @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
    public void onSuccess(T t) {
        CacheDisposable<T>[] andSet;
        this.HaptikSDK$a = t;
        for (CacheDisposable<T> cacheDisposable : this.ag$a.getAndSet(ah$a)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
    public void onError(Throwable th) {
        CacheDisposable<T>[] andSet;
        this.valueOf = th;
        for (CacheDisposable<T> cacheDisposable : this.ag$a.getAndSet(ah$a)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onError(th);
            }
        }
    }

    @Override // o.IdlingRegistry
    public void onComplete() {
        CacheDisposable<T>[] andSet;
        for (CacheDisposable<T> cacheDisposable : this.ag$a.getAndSet(ah$a)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onComplete();
            }
        }
    }

    boolean toString(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable<T>[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.ag$a.get();
            if (cacheDisposableArr == ah$a) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!this.ag$a.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void valueOf(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.ag$a.get();
            int length = cacheDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (cacheDisposableArr[i2] == cacheDisposable) {
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
                cacheDisposableArr2 = toString;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!this.ag$a.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements dataStart {
        private static final long serialVersionUID = -5791853038359966195L;
        final IdlingRegistry<? super T> downstream;

        CacheDisposable(IdlingRegistry<? super T> idlingRegistry, MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.downstream = idlingRegistry;
        }

        @Override // o.dataStart
        public void dispose() {
            MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.valueOf(this);
            }
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
