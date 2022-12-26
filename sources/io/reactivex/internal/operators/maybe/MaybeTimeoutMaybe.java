package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.builder;
import o.setArrowDimensions;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class MaybeTimeoutMaybe<T, U> extends setArrowDimensions<T, T> {
    final SupportSQLiteOpenHelper.Configuration.Builder<? extends T> ah$a;
    final SupportSQLiteOpenHelper.Configuration.Builder<U> valueOf;

    @Override // o.deleteDatabaseFile
    public void values(builder<? super T> builderVar) {
        TimeoutMainMaybeObserver timeoutMainMaybeObserver = new TimeoutMainMaybeObserver(builderVar, this.ah$a);
        builderVar.onSubscribe(timeoutMainMaybeObserver);
        this.valueOf.valueOf(timeoutMainMaybeObserver.other);
        this.values.valueOf(timeoutMainMaybeObserver);
    }

    /* loaded from: classes7.dex */
    static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -5955289211445418871L;
        final builder<? super T> downstream;
        final SupportSQLiteOpenHelper.Configuration.Builder<? extends T> fallback;
        final TimeoutOtherMaybeObserver<T, U> other = new TimeoutOtherMaybeObserver<>(this);
        final TimeoutFallbackMaybeObserver<T> otherObserver;

        TimeoutMainMaybeObserver(builder<? super T> builderVar, SupportSQLiteOpenHelper.Configuration.Builder<? extends T> builder) {
            this.downstream = builderVar;
            this.fallback = builder;
            this.otherObserver = builder != null ? new TimeoutFallbackMaybeObserver<>(builderVar) : null;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.other);
            TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.otherObserver;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.dispose(timeoutFallbackMaybeObserver);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.builder
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }

        @Override // o.builder
        public void onSuccess(T t) {
            DisposableHelper.dispose(this.other);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.downstream.onSuccess(t);
            }
        }

        @Override // o.builder
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.other);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.downstream.onError(th);
            } else {
                setProgressBackgroundColor.values(th);
            }
        }

        @Override // o.builder
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.downstream.onComplete();
            }
        }

        public void otherError(Throwable th) {
            if (DisposableHelper.dispose(this)) {
                this.downstream.onError(th);
            } else {
                setProgressBackgroundColor.values(th);
            }
        }

        public void otherComplete() {
            if (DisposableHelper.dispose(this)) {
                SupportSQLiteOpenHelper.Configuration.Builder<? extends T> builder = this.fallback;
                if (builder == null) {
                    this.downstream.onError(new TimeoutException());
                } else {
                    builder.valueOf(this.otherObserver);
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        final TimeoutMainMaybeObserver<T, U> parent;

        TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.parent = timeoutMainMaybeObserver;
        }

        @Override // o.builder
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }

        @Override // o.builder
        public void onSuccess(Object obj) {
            this.parent.otherComplete();
        }

        @Override // o.builder
        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        @Override // o.builder
        public void onComplete() {
            this.parent.otherComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        final builder<? super T> downstream;

        TimeoutFallbackMaybeObserver(builder<? super T> builderVar) {
            this.downstream = builderVar;
        }

        @Override // o.builder
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }

        @Override // o.builder
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // o.builder
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.builder
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
