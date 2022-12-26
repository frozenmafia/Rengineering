package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendClause;
import o.groupBy;
import o.having;
/* loaded from: classes7.dex */
public final class SingleCache<T> extends groupBy<T> implements appendClause<T> {
    T HaptikSDK$b;
    final AtomicInteger HaptikSDK$c;
    final having<? extends T> toString;
    final AtomicReference<CacheDisposable<T>[]> valueOf;
    Throwable values;
    static final CacheDisposable[] ah$a = new CacheDisposable[0];
    static final CacheDisposable[] ag$a = new CacheDisposable[0];

    @Override // o.appendClause
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
    }

    @Override // o.groupBy
    public void toString(appendClause<? super T> appendclause) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(appendclause, this);
        appendclause.onSubscribe(cacheDisposable);
        if (ag$a(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                values(cacheDisposable);
            }
            if (this.HaptikSDK$c.getAndIncrement() == 0) {
                this.toString.values(this);
                return;
            }
            return;
        }
        Throwable th = this.values;
        if (th != null) {
            appendclause.onError(th);
        } else {
            appendclause.onSuccess((T) this.HaptikSDK$b);
        }
    }

    boolean ag$a(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable<T>[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.valueOf.get();
            if (cacheDisposableArr == ag$a) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!this.valueOf.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void values(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.valueOf.get();
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
        } while (!this.valueOf.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // o.appendClause
    public void onSuccess(T t) {
        CacheDisposable<T>[] andSet;
        this.HaptikSDK$b = t;
        for (CacheDisposable<T> cacheDisposable : this.valueOf.getAndSet(ag$a)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // o.appendClause
    public void onError(Throwable th) {
        CacheDisposable<T>[] andSet;
        this.values = th;
        for (CacheDisposable<T> cacheDisposable : this.valueOf.getAndSet(ag$a)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onError(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class CacheDisposable<T> extends AtomicBoolean implements FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 7514387411091976596L;
        final appendClause<? super T> downstream;
        final SingleCache<T> parent;

        CacheDisposable(appendClause<? super T> appendclause, SingleCache<T> singleCache) {
            this.downstream = appendclause;
            this.parent = singleCache;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.values(this);
            }
        }
    }
}
