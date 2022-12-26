package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.builder;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableConcatWithMaybe<T> extends setProgressRotation<T, T> {
    final SupportSQLiteOpenHelper.Configuration.Builder<? extends T> valueOf;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new ConcatWithObserver(factory, this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class ConcatWithObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T>, builder<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -1953724749712440952L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        boolean inMaybe;
        SupportSQLiteOpenHelper.Configuration.Builder<? extends T> other;

        ConcatWithObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, SupportSQLiteOpenHelper.Configuration.Builder<? extends T> builder) {
            this.downstream = factory;
            this.other = builder;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (!DisposableHelper.setOnce(this, anonymousClass2) || this.inMaybe) {
                return;
            }
            this.downstream.onSubscribe(this);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // o.builder
        public void onSuccess(T t) {
            this.downstream.onNext(t);
            this.downstream.onComplete();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            if (this.inMaybe) {
                this.downstream.onComplete();
                return;
            }
            this.inMaybe = true;
            DisposableHelper.replace(this, null);
            SupportSQLiteOpenHelper.Configuration.Builder<? extends T> builder = this.other;
            this.other = null;
            builder.valueOf(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }
}
