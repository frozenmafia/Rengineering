package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableCache<T> extends setProgressRotation<T, T> implements SupportSQLiteOpenHelper.Factory<T> {
    volatile long HaptikSDK$a;
    final AtomicReference<CacheDisposable<T>[]> HaptikSDK$b;
    Throwable HaptikSDK$c;
    valueOf<T> HaptikSDK$d;
    int HaptikWebView;
    volatile boolean ah$a;
    final valueOf<T> ah$b;
    final AtomicBoolean invoke;
    final int valueOf;
    static final CacheDisposable[] values = new CacheDisposable[0];
    static final CacheDisposable[] ag$a = new CacheDisposable[0];

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(factory, this);
        factory.onSubscribe(cacheDisposable);
        ag$a((CacheDisposable) cacheDisposable);
        if (!this.invoke.get() && this.invoke.compareAndSet(false, true)) {
            this.toString.subscribe(this);
        } else {
            ah$a((CacheDisposable) cacheDisposable);
        }
    }

    void ag$a(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable<T>[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.HaptikSDK$b.get();
            if (cacheDisposableArr == ag$a) {
                return;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!this.HaptikSDK$b.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    void values(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.HaptikSDK$b.get();
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
                cacheDisposableArr2 = values;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!this.HaptikSDK$b.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    void ah$a(CacheDisposable<T> cacheDisposable) {
        if (cacheDisposable.getAndIncrement() != 0) {
            return;
        }
        long j = cacheDisposable.index;
        int i = cacheDisposable.offset;
        valueOf<T> valueof = cacheDisposable.node;
        SupportSQLiteOpenHelper.Factory<? super T> factory = cacheDisposable.downstream;
        int i2 = this.valueOf;
        int i3 = 1;
        while (!cacheDisposable.disposed) {
            boolean z = this.ah$a;
            boolean z2 = this.HaptikSDK$a == j;
            if (z && z2) {
                cacheDisposable.node = null;
                Throwable th = this.HaptikSDK$c;
                if (th != null) {
                    factory.onError(th);
                    return;
                } else {
                    factory.onComplete();
                    return;
                }
            } else if (!z2) {
                if (i == i2) {
                    valueof = valueof.ah$a;
                    i = 0;
                }
                factory.onNext((Object) valueof.valueOf[i]);
                i++;
                j++;
            } else {
                cacheDisposable.index = j;
                cacheDisposable.offset = i;
                cacheDisposable.node = valueof;
                i3 = cacheDisposable.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
        }
        cacheDisposable.node = null;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        int i = this.HaptikWebView;
        if (i == this.valueOf) {
            valueOf<T> valueof = new valueOf<>(i);
            valueof.valueOf[0] = t;
            this.HaptikWebView = 1;
            this.HaptikSDK$d.ah$a = valueof;
            this.HaptikSDK$d = valueof;
        } else {
            this.HaptikSDK$d.valueOf[i] = t;
            this.HaptikWebView = i + 1;
        }
        this.HaptikSDK$a++;
        for (CacheDisposable<T> cacheDisposable : this.HaptikSDK$b.get()) {
            ah$a((CacheDisposable) cacheDisposable);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        this.HaptikSDK$c = th;
        this.ah$a = true;
        for (CacheDisposable<T> cacheDisposable : this.HaptikSDK$b.getAndSet(ag$a)) {
            ah$a((CacheDisposable) cacheDisposable);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        this.ah$a = true;
        for (CacheDisposable<T> cacheDisposable : this.HaptikSDK$b.getAndSet(ag$a)) {
            ah$a((CacheDisposable) cacheDisposable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class CacheDisposable<T> extends AtomicInteger implements FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        long index;
        valueOf<T> node;
        int offset;
        final ObservableCache<T> parent;

        CacheDisposable(SupportSQLiteOpenHelper.Factory<? super T> factory, ObservableCache<T> observableCache) {
            this.downstream = factory;
            this.parent = observableCache;
            this.node = observableCache.ah$b;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.parent.values((CacheDisposable) this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.disposed;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class valueOf<T> {
        volatile valueOf<T> ah$a;
        final T[] valueOf;

        valueOf(int i) {
            this.valueOf = (T[]) new Object[i];
        }
    }
}
