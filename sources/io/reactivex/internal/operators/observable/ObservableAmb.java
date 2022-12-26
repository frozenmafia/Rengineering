package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.SupportSQLiteQuery;
import o.noBackupDirectory;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class ObservableAmb<T> extends SupportSQLiteQuery<T> {
    final noBackupDirectory<? extends T>[] ag$a;
    final Iterable<? extends noBackupDirectory<? extends T>> valueOf;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        int length;
        noBackupDirectory<? extends T>[] nobackupdirectoryArr = this.ag$a;
        if (nobackupdirectoryArr == null) {
            nobackupdirectoryArr = new noBackupDirectory[8];
            try {
                length = 0;
                for (noBackupDirectory<? extends T> nobackupdirectory : this.valueOf) {
                    if (nobackupdirectory == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), factory);
                        return;
                    }
                    if (length == nobackupdirectoryArr.length) {
                        noBackupDirectory<? extends T>[] nobackupdirectoryArr2 = new noBackupDirectory[(length >> 2) + length];
                        System.arraycopy(nobackupdirectoryArr, 0, nobackupdirectoryArr2, 0, length);
                        nobackupdirectoryArr = nobackupdirectoryArr2;
                    }
                    nobackupdirectoryArr[length] = nobackupdirectory;
                    length++;
                }
            } catch (Throwable th) {
                FrameworkSQLiteDatabase.values(th);
                EmptyDisposable.error(th, factory);
                return;
            }
        } else {
            length = nobackupdirectoryArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(factory);
        } else if (length == 1) {
            nobackupdirectoryArr[0].subscribe(factory);
        } else {
            new toString(factory, length).valueOf(nobackupdirectoryArr);
        }
    }

    /* loaded from: classes7.dex */
    static final class toString<T> implements FrameworkSQLiteDatabase.AnonymousClass2 {
        final AmbInnerObserver<T>[] ag$a;
        final AtomicInteger ah$a = new AtomicInteger();
        final SupportSQLiteOpenHelper.Factory<? super T> toString;

        toString(SupportSQLiteOpenHelper.Factory<? super T> factory, int i) {
            this.toString = factory;
            this.ag$a = new AmbInnerObserver[i];
        }

        public void valueOf(noBackupDirectory<? extends T>[] nobackupdirectoryArr) {
            AmbInnerObserver<T>[] ambInnerObserverArr = this.ag$a;
            int length = ambInnerObserverArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                ambInnerObserverArr[i] = new AmbInnerObserver<>(this, i2, this.toString);
                i = i2;
            }
            this.ah$a.lazySet(0);
            this.toString.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.ah$a.get() == 0; i3++) {
                nobackupdirectoryArr[i3].subscribe(ambInnerObserverArr[i3]);
            }
        }

        public boolean values(int i) {
            int i2 = this.ah$a.get();
            int i3 = 0;
            if (i2 != 0) {
                return i2 == i;
            } else if (this.ah$a.compareAndSet(0, i)) {
                AmbInnerObserver<T>[] ambInnerObserverArr = this.ag$a;
                int length = ambInnerObserverArr.length;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    if (i4 != i) {
                        ambInnerObserverArr[i3].dispose();
                    }
                    i3 = i4;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            if (this.ah$a.get() != -1) {
                this.ah$a.lazySet(-1);
                for (AmbInnerObserver<T> ambInnerObserver : this.ag$a) {
                    ambInnerObserver.dispose();
                }
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.ah$a.get() == -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class AmbInnerObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final int index;
        final toString<T> parent;
        boolean won;

        AmbInnerObserver(toString<T> tostring, int i, SupportSQLiteOpenHelper.Factory<? super T> factory) {
            this.parent = tostring;
            this.index = i;
            this.downstream = factory;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            if (this.won) {
                this.downstream.onNext(t);
            } else if (this.parent.values(this.index)) {
                this.won = true;
                this.downstream.onNext(t);
            } else {
                get().dispose();
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.values(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                setProgressBackgroundColor.values(th);
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.values(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }
    }
}
