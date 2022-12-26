package io.reactivex.subjects;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.__offset;
import o.setProgressBackgroundColor;
/* loaded from: classes.dex */
public final class PublishSubject<T> extends __offset<T> {
    Throwable ah$a;
    final AtomicReference<PublishDisposable<T>[]> toString = new AtomicReference<>(ag$a);
    static final PublishDisposable[] values = new PublishDisposable[0];
    static final PublishDisposable[] ag$a = new PublishDisposable[0];

    public static <T> PublishSubject<T> invoke() {
        return new PublishSubject<>();
    }

    PublishSubject() {
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(factory, this);
        factory.onSubscribe(publishDisposable);
        if (ah$a((PublishDisposable) publishDisposable)) {
            if (publishDisposable.isDisposed()) {
                valueOf(publishDisposable);
                return;
            }
            return;
        }
        Throwable th = this.ah$a;
        if (th != null) {
            factory.onError(th);
        } else {
            factory.onComplete();
        }
    }

    boolean ah$a(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable<T>[] publishDisposableArr2;
        do {
            publishDisposableArr = this.toString.get();
            if (publishDisposableArr == values) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!this.toString.compareAndSet(publishDisposableArr, publishDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void valueOf(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.toString.get();
            if (publishDisposableArr == values || publishDisposableArr == ag$a) {
                return;
            }
            int length = publishDisposableArr.length;
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (publishDisposableArr[i2] == publishDisposable) {
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
                publishDisposableArr2 = ag$a;
            } else {
                PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!this.toString.compareAndSet(publishDisposableArr, publishDisposableArr2));
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (this.toString.get() == values) {
            anonymousClass2.dispose();
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable<T> publishDisposable : this.toString.get()) {
            publishDisposable.onNext(t);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishDisposable<T>[] publishDisposableArr = this.toString.get();
        PublishDisposable<T>[] publishDisposableArr2 = values;
        if (publishDisposableArr == publishDisposableArr2) {
            setProgressBackgroundColor.values(th);
            return;
        }
        this.ah$a = th;
        for (PublishDisposable<T> publishDisposable : this.toString.getAndSet(publishDisposableArr2)) {
            publishDisposable.onError(th);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.toString.get();
        PublishDisposable<T>[] publishDisposableArr2 = values;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        for (PublishDisposable<T> publishDisposable : this.toString.getAndSet(publishDisposableArr2)) {
            publishDisposable.onComplete();
        }
    }

    public boolean HaptikSDK$c() {
        return this.toString.get() == values && this.ah$a == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class PublishDisposable<T> extends AtomicBoolean implements FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 3562861878281475070L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final PublishSubject<T> parent;

        PublishDisposable(SupportSQLiteOpenHelper.Factory<? super T> factory, PublishSubject<T> publishSubject) {
            this.downstream = factory;
            this.parent = publishSubject;
        }

        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            if (get()) {
                setProgressBackgroundColor.values(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.valueOf(this);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get();
        }
    }
}
