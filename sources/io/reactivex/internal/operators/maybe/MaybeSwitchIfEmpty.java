package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.builder;
import o.setArrowDimensions;
/* loaded from: classes7.dex */
public final class MaybeSwitchIfEmpty<T> extends setArrowDimensions<T, T> {
    final SupportSQLiteOpenHelper.Configuration.Builder<? extends T> ah$a;

    @Override // o.deleteDatabaseFile
    public void values(builder<? super T> builderVar) {
        this.values.valueOf(new SwitchIfEmptyMaybeObserver(builderVar, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -2223459372976438024L;
        final builder<? super T> downstream;
        final SupportSQLiteOpenHelper.Configuration.Builder<? extends T> other;

        SwitchIfEmptyMaybeObserver(builder<? super T> builderVar, SupportSQLiteOpenHelper.Configuration.Builder<? extends T> builder) {
            this.downstream = builderVar;
            this.other = builder;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.builder
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.setOnce(this, anonymousClass2)) {
                this.downstream.onSubscribe(this);
            }
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
            FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = get();
            if (anonymousClass2 == DisposableHelper.DISPOSED || !compareAndSet(anonymousClass2, null)) {
                return;
            }
            this.other.valueOf(new toString(this.downstream, this));
        }

        /* loaded from: classes7.dex */
        static final class toString<T> implements builder<T> {
            final builder<? super T> ag$a;
            final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> toString;

            toString(builder<? super T> builderVar, AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> atomicReference) {
                this.ag$a = builderVar;
                this.toString = atomicReference;
            }

            @Override // o.builder
            public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
                DisposableHelper.setOnce(this.toString, anonymousClass2);
            }

            @Override // o.builder
            public void onSuccess(T t) {
                this.ag$a.onSuccess(t);
            }

            @Override // o.builder
            public void onError(Throwable th) {
                this.ag$a.onError(th);
            }

            @Override // o.builder
            public void onComplete() {
                this.ag$a.onComplete();
            }
        }
    }
}
