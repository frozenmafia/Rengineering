package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableSkipLast<T> extends setProgressRotation<T, T> {
    final int values;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new SkipLastObserver(factory, this.values));
    }

    /* loaded from: classes7.dex */
    static final class SkipLastObserver<T> extends ArrayDeque<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -3807491841935125653L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final int skip;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        SkipLastObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, int i) {
            super(i);
            this.downstream = factory;
            this.skip = i;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            if (this.skip == size()) {
                this.downstream.onNext((T) poll());
            }
            offer(t);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
