package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableCache<T> extends startObject<T, T> implements IdlingResource<T> {
    static final CacheDisposable[] ah$a = new CacheDisposable[0];
    static final CacheDisposable[] values = new CacheDisposable[0];
    final AtomicReference<CacheDisposable<T>[]> HaptikSDK$a;
    final values<T> HaptikSDK$b;
    volatile long HaptikSDK$c;
    int HaptikSDK$d;
    values<T> HaptikSDK$e;
    final int ag$a;
    Throwable ah$b;
    final AtomicBoolean invoke;
    volatile boolean toString;

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
    }

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(idlingResource, this);
        idlingResource.onSubscribe(cacheDisposable);
        ah$a(cacheDisposable);
        if (!this.invoke.get() && this.invoke.compareAndSet(false, true)) {
            this.valueOf.subscribe(this);
        } else {
            toString(cacheDisposable);
        }
    }

    void ah$a(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable<T>[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.HaptikSDK$a.get();
            if (cacheDisposableArr == values) {
                return;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!this.HaptikSDK$a.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    void valueOf(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.HaptikSDK$a.get();
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
                cacheDisposableArr2 = ah$a;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!this.HaptikSDK$a.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    void toString(CacheDisposable<T> cacheDisposable) {
        if (cacheDisposable.getAndIncrement() != 0) {
            return;
        }
        long j = cacheDisposable.index;
        int i = cacheDisposable.offset;
        values<T> valuesVar = cacheDisposable.node;
        IdlingResource<? super T> idlingResource = cacheDisposable.downstream;
        int i2 = this.ag$a;
        int i3 = 1;
        while (!cacheDisposable.disposed) {
            boolean z = this.toString;
            boolean z2 = this.HaptikSDK$c == j;
            if (z && z2) {
                cacheDisposable.node = null;
                Throwable th = this.ah$b;
                if (th != null) {
                    idlingResource.onError(th);
                    return;
                } else {
                    idlingResource.onComplete();
                    return;
                }
            } else if (!z2) {
                if (i == i2) {
                    valuesVar = valuesVar.valueOf;
                    i = 0;
                }
                idlingResource.onNext((Object) valuesVar.toString[i]);
                i++;
                j++;
            } else {
                cacheDisposable.index = j;
                cacheDisposable.offset = i;
                cacheDisposable.node = valuesVar;
                i3 = cacheDisposable.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
        }
        cacheDisposable.node = null;
    }

    @Override // o.IdlingResource
    public void onNext(T t) {
        int i = this.HaptikSDK$d;
        if (i == this.ag$a) {
            values<T> valuesVar = new values<>(i);
            valuesVar.toString[0] = t;
            this.HaptikSDK$d = 1;
            this.HaptikSDK$e.valueOf = valuesVar;
            this.HaptikSDK$e = valuesVar;
        } else {
            this.HaptikSDK$e.toString[i] = t;
            this.HaptikSDK$d = i + 1;
        }
        this.HaptikSDK$c++;
        for (CacheDisposable<T> cacheDisposable : this.HaptikSDK$a.get()) {
            toString(cacheDisposable);
        }
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        this.ah$b = th;
        this.toString = true;
        for (CacheDisposable<T> cacheDisposable : this.HaptikSDK$a.getAndSet(values)) {
            toString(cacheDisposable);
        }
    }

    @Override // o.IdlingResource
    public void onComplete() {
        this.toString = true;
        for (CacheDisposable<T> cacheDisposable : this.HaptikSDK$a.getAndSet(values)) {
            toString(cacheDisposable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class CacheDisposable<T> extends AtomicInteger implements dataStart {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final IdlingResource<? super T> downstream;
        long index;
        values<T> node;
        int offset;
        final ObservableCache<T> parent;

        CacheDisposable(IdlingResource<? super T> idlingResource, ObservableCache<T> observableCache) {
            this.downstream = idlingResource;
            this.parent = observableCache;
            this.node = observableCache.HaptikSDK$b;
        }

        @Override // o.dataStart
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.parent.valueOf(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.disposed;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class values<T> {
        final T[] toString;
        volatile values<T> valueOf;

        values(int i) {
            this.toString = (T[]) new Object[i];
        }
    }
}
