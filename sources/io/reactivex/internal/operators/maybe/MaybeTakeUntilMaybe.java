package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.builder;
import o.setArrowDimensions;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class MaybeTakeUntilMaybe<T, U> extends setArrowDimensions<T, T> {
    final SupportSQLiteOpenHelper.Configuration.Builder<U> toString;

    @Override // o.deleteDatabaseFile
    public void values(builder<? super T> builderVar) {
        TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new TakeUntilMainMaybeObserver(builderVar);
        builderVar.onSubscribe(takeUntilMainMaybeObserver);
        this.toString.valueOf(takeUntilMainMaybeObserver.other);
        this.values.valueOf(takeUntilMainMaybeObserver);
    }

    /* loaded from: classes7.dex */
    static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -2187421758664251153L;
        final builder<? super T> downstream;
        final TakeUntilOtherMaybeObserver<U> other = new TakeUntilOtherMaybeObserver<>(this);

        TakeUntilMainMaybeObserver(builder<? super T> builderVar) {
            this.downstream = builderVar;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.other);
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

        void otherError(Throwable th) {
            if (DisposableHelper.dispose(this)) {
                this.downstream.onError(th);
            } else {
                setProgressBackgroundColor.values(th);
            }
        }

        void otherComplete() {
            if (DisposableHelper.dispose(this)) {
                this.downstream.onComplete();
            }
        }

        /* loaded from: classes7.dex */
        static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            final TakeUntilMainMaybeObserver<?, U> parent;

            TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.parent = takeUntilMainMaybeObserver;
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
    }
}
