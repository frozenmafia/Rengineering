package io.reactivex.subjects;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.__offset;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class AsyncSubject<T> extends __offset<T> {
    static final AsyncDisposable[] ah$a = new AsyncDisposable[0];
    static final AsyncDisposable[] valueOf = new AsyncDisposable[0];
    T ag$a;
    Throwable toString;
    final AtomicReference<AsyncDisposable<T>[]> values = new AtomicReference<>(ah$a);

    AsyncSubject() {
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (this.values.get() == valueOf) {
            anonymousClass2.dispose();
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.values.get() == valueOf) {
            return;
        }
        this.ag$a = t;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AsyncDisposable<T>[] asyncDisposableArr = this.values.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = valueOf;
        if (asyncDisposableArr == asyncDisposableArr2) {
            setProgressBackgroundColor.values(th);
            return;
        }
        this.ag$a = null;
        this.toString = th;
        for (AsyncDisposable<T> asyncDisposable : this.values.getAndSet(asyncDisposableArr2)) {
            asyncDisposable.onError(th);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        AsyncDisposable<T>[] asyncDisposableArr = this.values.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = valueOf;
        if (asyncDisposableArr == asyncDisposableArr2) {
            return;
        }
        T t = this.ag$a;
        AsyncDisposable<T>[] andSet = this.values.getAndSet(asyncDisposableArr2);
        int i = 0;
        if (t == null) {
            int length = andSet.length;
            while (i < length) {
                andSet[i].onComplete();
                i++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i < length2) {
            andSet[i].complete(t);
            i++;
        }
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        AsyncDisposable<T> asyncDisposable = new AsyncDisposable<>(factory, this);
        factory.onSubscribe(asyncDisposable);
        if (values((AsyncDisposable) asyncDisposable)) {
            if (asyncDisposable.isDisposed()) {
                ah$a((AsyncDisposable) asyncDisposable);
                return;
            }
            return;
        }
        Throwable th = this.toString;
        if (th != null) {
            factory.onError(th);
            return;
        }
        T t = this.ag$a;
        if (t != null) {
            asyncDisposable.complete(t);
        } else {
            asyncDisposable.onComplete();
        }
    }

    boolean values(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable<T>[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.values.get();
            if (asyncDisposableArr == valueOf) {
                return false;
            }
            int length = asyncDisposableArr.length;
            asyncDisposableArr2 = new AsyncDisposable[length + 1];
            System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
            asyncDisposableArr2[length] = asyncDisposable;
        } while (!this.values.compareAndSet(asyncDisposableArr, asyncDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void ah$a(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.values.get();
            int length = asyncDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (asyncDisposableArr[i2] == asyncDisposable) {
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
                asyncDisposableArr2 = ah$a;
            } else {
                AsyncDisposable[] asyncDisposableArr3 = new AsyncDisposable[length - 1];
                System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr3, 0, i);
                System.arraycopy(asyncDisposableArr, i + 1, asyncDisposableArr3, i, (length - i) - 1);
                asyncDisposableArr2 = asyncDisposableArr3;
            }
        } while (!this.values.compareAndSet(asyncDisposableArr, asyncDisposableArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncSubject<T> parent;

        AsyncDisposable(SupportSQLiteOpenHelper.Factory<? super T> factory, AsyncSubject<T> asyncSubject) {
            super(factory);
            this.parent = asyncSubject;
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            if (super.tryDispose()) {
                this.parent.ah$a((AsyncDisposable) this);
            }
        }

        void onComplete() {
            if (isDisposed()) {
                return;
            }
            this.downstream.onComplete();
        }

        void onError(Throwable th) {
            if (isDisposed()) {
                setProgressBackgroundColor.values(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
