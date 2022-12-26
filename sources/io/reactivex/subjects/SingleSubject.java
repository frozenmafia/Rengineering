package io.reactivex.subjects;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendClause;
import o.groupBy;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class SingleSubject<T> extends groupBy<T> implements appendClause<T> {
    static final SingleDisposable[] ah$a = new SingleDisposable[0];
    static final SingleDisposable[] toString = new SingleDisposable[0];
    T HaptikSDK$c;
    final AtomicBoolean ag$a = new AtomicBoolean();
    final AtomicReference<SingleDisposable<T>[]> valueOf = new AtomicReference<>(ah$a);
    Throwable values;

    SingleSubject() {
    }

    @Override // o.appendClause
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (this.valueOf.get() == toString) {
            anonymousClass2.dispose();
        }
    }

    @Override // o.appendClause
    public void onSuccess(T t) {
        Objects.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.ag$a.compareAndSet(false, true)) {
            this.HaptikSDK$c = t;
            for (SingleDisposable<T> singleDisposable : this.valueOf.getAndSet(toString)) {
                singleDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // o.appendClause
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.ag$a.compareAndSet(false, true)) {
            this.values = th;
            for (SingleDisposable<T> singleDisposable : this.valueOf.getAndSet(toString)) {
                singleDisposable.downstream.onError(th);
            }
            return;
        }
        setProgressBackgroundColor.values(th);
    }

    @Override // o.groupBy
    public void toString(appendClause<? super T> appendclause) {
        SingleDisposable<T> singleDisposable = new SingleDisposable<>(appendclause, this);
        appendclause.onSubscribe(singleDisposable);
        if (toString(singleDisposable)) {
            if (singleDisposable.isDisposed()) {
                values(singleDisposable);
                return;
            }
            return;
        }
        Throwable th = this.values;
        if (th != null) {
            appendclause.onError(th);
        } else {
            appendclause.onSuccess((T) this.HaptikSDK$c);
        }
    }

    boolean toString(SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        SingleDisposable<T>[] singleDisposableArr2;
        do {
            singleDisposableArr = this.valueOf.get();
            if (singleDisposableArr == toString) {
                return false;
            }
            int length = singleDisposableArr.length;
            singleDisposableArr2 = new SingleDisposable[length + 1];
            System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
        } while (!this.valueOf.compareAndSet(singleDisposableArr, singleDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void values(SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            singleDisposableArr = this.valueOf.get();
            int length = singleDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (singleDisposableArr[i2] == singleDisposable) {
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
                singleDisposableArr2 = ah$a;
            } else {
                SingleDisposable[] singleDisposableArr3 = new SingleDisposable[length - 1];
                System.arraycopy(singleDisposableArr, 0, singleDisposableArr3, 0, i);
                System.arraycopy(singleDisposableArr, i + 1, singleDisposableArr3, i, (length - i) - 1);
                singleDisposableArr2 = singleDisposableArr3;
            }
        } while (!this.valueOf.compareAndSet(singleDisposableArr, singleDisposableArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -7650903191002190468L;
        final appendClause<? super T> downstream;

        SingleDisposable(appendClause<? super T> appendclause, SingleSubject<T> singleSubject) {
            this.downstream = appendclause;
            lazySet(singleSubject);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.values(this);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
