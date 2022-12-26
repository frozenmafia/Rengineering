package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.decrement;
import o.onTransitionToIdle;
/* loaded from: classes7.dex */
public final class SingleCache<T> extends onTransitionToIdle<T> implements IdlingResource.ResourceCallback<T> {
    static final CacheDisposable[] toString = new CacheDisposable[0];
    static final CacheDisposable[] valueOf = new CacheDisposable[0];
    final AtomicInteger HaptikSDK$a;
    Throwable ag$a;
    final decrement<? extends T> ah$a;
    T ah$b;
    final AtomicReference<CacheDisposable<T>[]> values;

    @Override // o.IdlingResource.ResourceCallback
    public void onSubscribe(dataStart datastart) {
    }

    @Override // o.onTransitionToIdle
    public void toString(IdlingResource.ResourceCallback<? super T> resourceCallback) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(resourceCallback, this);
        resourceCallback.onSubscribe(cacheDisposable);
        if (valueOf(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                values(cacheDisposable);
            }
            if (this.HaptikSDK$a.getAndIncrement() == 0) {
                this.ah$a.values(this);
                return;
            }
            return;
        }
        Throwable th = this.ag$a;
        if (th != null) {
            resourceCallback.onError(th);
        } else {
            resourceCallback.onSuccess((T) this.ah$b);
        }
    }

    boolean valueOf(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable<T>[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.values.get();
            if (cacheDisposableArr == valueOf) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!this.values.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void values(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.values.get();
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
        } while (!this.values.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // o.IdlingResource.ResourceCallback
    public void onSuccess(T t) {
        CacheDisposable<T>[] andSet;
        this.ah$b = t;
        for (CacheDisposable<T> cacheDisposable : this.values.getAndSet(valueOf)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // o.IdlingResource.ResourceCallback
    public void onError(Throwable th) {
        CacheDisposable<T>[] andSet;
        this.ag$a = th;
        for (CacheDisposable<T> cacheDisposable : this.values.getAndSet(valueOf)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onError(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class CacheDisposable<T> extends AtomicBoolean implements dataStart {
        private static final long serialVersionUID = 7514387411091976596L;
        final IdlingResource.ResourceCallback<? super T> downstream;
        final SingleCache<T> parent;

        CacheDisposable(IdlingResource.ResourceCallback<? super T> resourceCallback, SingleCache<T> singleCache) {
            this.downstream = resourceCallback;
            this.parent = singleCache;
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get();
        }

        @Override // o.dataStart
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.values(this);
            }
        }
    }
}
