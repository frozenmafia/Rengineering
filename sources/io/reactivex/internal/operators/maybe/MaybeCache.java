package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.builder;
import o.deleteDatabaseFile;
/* loaded from: classes7.dex */
public final class MaybeCache<T> extends deleteDatabaseFile<T> implements builder<T> {
    static final CacheDisposable[] valueOf = new CacheDisposable[0];
    static final CacheDisposable[] values = new CacheDisposable[0];
    final AtomicReference<SupportSQLiteOpenHelper.Configuration.Builder<T>> ag$a;
    final AtomicReference<CacheDisposable<T>[]> ah$a;
    T ah$b;
    Throwable toString;

    @Override // o.builder
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
    }

    @Override // o.deleteDatabaseFile
    public void values(builder<? super T> builderVar) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(builderVar, this);
        builderVar.onSubscribe(cacheDisposable);
        if (ah$a(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                valueOf(cacheDisposable);
                return;
            }
            SupportSQLiteOpenHelper.Configuration.Builder<T> andSet = this.ag$a.getAndSet(null);
            if (andSet != null) {
                andSet.valueOf(this);
            }
        } else if (cacheDisposable.isDisposed()) {
        } else {
            Throwable th = this.toString;
            if (th != null) {
                builderVar.onError(th);
                return;
            }
            Object obj = (T) this.ah$b;
            if (obj != null) {
                builderVar.onSuccess(obj);
            } else {
                builderVar.onComplete();
            }
        }
    }

    @Override // o.builder
    public void onSuccess(T t) {
        CacheDisposable<T>[] andSet;
        this.ah$b = t;
        for (CacheDisposable<T> cacheDisposable : this.ah$a.getAndSet(values)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // o.builder
    public void onError(Throwable th) {
        CacheDisposable<T>[] andSet;
        this.toString = th;
        for (CacheDisposable<T> cacheDisposable : this.ah$a.getAndSet(values)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onError(th);
            }
        }
    }

    @Override // o.builder
    public void onComplete() {
        CacheDisposable<T>[] andSet;
        for (CacheDisposable<T> cacheDisposable : this.ah$a.getAndSet(values)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onComplete();
            }
        }
    }

    boolean ah$a(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable<T>[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.ah$a.get();
            if (cacheDisposableArr == values) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!this.ah$a.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void valueOf(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.ah$a.get();
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
                cacheDisposableArr2 = valueOf;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!this.ah$a.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -5791853038359966195L;
        final builder<? super T> downstream;

        CacheDisposable(builder<? super T> builderVar, MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.downstream = builderVar;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.valueOf(this);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
