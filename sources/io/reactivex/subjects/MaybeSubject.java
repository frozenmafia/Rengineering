package io.reactivex.subjects;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.builder;
import o.deleteDatabaseFile;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class MaybeSubject<T> extends deleteDatabaseFile<T> implements builder<T> {
    static final MaybeDisposable[] ah$a = new MaybeDisposable[0];
    static final MaybeDisposable[] toString = new MaybeDisposable[0];
    T HaptikSDK$a;
    Throwable ag$a;
    final AtomicBoolean values = new AtomicBoolean();
    final AtomicReference<MaybeDisposable<T>[]> valueOf = new AtomicReference<>(ah$a);

    MaybeSubject() {
    }

    @Override // o.builder
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (this.valueOf.get() == toString) {
            anonymousClass2.dispose();
        }
    }

    @Override // o.builder
    public void onSuccess(T t) {
        Objects.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.values.compareAndSet(false, true)) {
            this.HaptikSDK$a = t;
            for (MaybeDisposable<T> maybeDisposable : this.valueOf.getAndSet(toString)) {
                maybeDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // o.builder
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.values.compareAndSet(false, true)) {
            this.ag$a = th;
            for (MaybeDisposable<T> maybeDisposable : this.valueOf.getAndSet(toString)) {
                maybeDisposable.downstream.onError(th);
            }
            return;
        }
        setProgressBackgroundColor.values(th);
    }

    @Override // o.builder
    public void onComplete() {
        if (this.values.compareAndSet(false, true)) {
            for (MaybeDisposable<T> maybeDisposable : this.valueOf.getAndSet(toString)) {
                maybeDisposable.downstream.onComplete();
            }
        }
    }

    @Override // o.deleteDatabaseFile
    public void values(builder<? super T> builderVar) {
        MaybeDisposable<T> maybeDisposable = new MaybeDisposable<>(builderVar, this);
        builderVar.onSubscribe(maybeDisposable);
        if (toString(maybeDisposable)) {
            if (maybeDisposable.isDisposed()) {
                values(maybeDisposable);
                return;
            }
            return;
        }
        Throwable th = this.ag$a;
        if (th != null) {
            builderVar.onError(th);
            return;
        }
        Object obj = (T) this.HaptikSDK$a;
        if (obj == null) {
            builderVar.onComplete();
        } else {
            builderVar.onSuccess(obj);
        }
    }

    boolean toString(MaybeDisposable<T> maybeDisposable) {
        MaybeDisposable<T>[] maybeDisposableArr;
        MaybeDisposable<T>[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.valueOf.get();
            if (maybeDisposableArr == toString) {
                return false;
            }
            int length = maybeDisposableArr.length;
            maybeDisposableArr2 = new MaybeDisposable[length + 1];
            System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
            maybeDisposableArr2[length] = maybeDisposable;
        } while (!this.valueOf.compareAndSet(maybeDisposableArr, maybeDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void values(MaybeDisposable<T> maybeDisposable) {
        MaybeDisposable<T>[] maybeDisposableArr;
        MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.valueOf.get();
            int length = maybeDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (maybeDisposableArr[i2] == maybeDisposable) {
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
                maybeDisposableArr2 = ah$a;
            } else {
                MaybeDisposable[] maybeDisposableArr3 = new MaybeDisposable[length - 1];
                System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr3, 0, i);
                System.arraycopy(maybeDisposableArr, i + 1, maybeDisposableArr3, i, (length - i) - 1);
                maybeDisposableArr2 = maybeDisposableArr3;
            }
        } while (!this.valueOf.compareAndSet(maybeDisposableArr, maybeDisposableArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -7650903191002190468L;
        final builder<? super T> downstream;

        MaybeDisposable(builder<? super T> builderVar, MaybeSubject<T> maybeSubject) {
            this.downstream = builderVar;
            lazySet(maybeSubject);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            MaybeSubject<T> andSet = getAndSet(null);
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
