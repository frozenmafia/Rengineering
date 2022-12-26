package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelper;
import o.builder;
import o.setArrowDimensions;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class MaybeDoFinally<T> extends setArrowDimensions<T, T> {
    final FrameworkSQLiteOpenHelper.OpenHelper toString;

    @Override // o.deleteDatabaseFile
    public void values(builder<? super T> builderVar) {
        this.values.valueOf(new DoFinallyObserver(builderVar, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class DoFinallyObserver<T> extends AtomicInteger implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 4109457741734051389L;
        final builder<? super T> downstream;
        final FrameworkSQLiteOpenHelper.OpenHelper onFinally;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        DoFinallyObserver(builder<? super T> builderVar, FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
            this.downstream = builderVar;
            this.onFinally = openHelper;
        }

        @Override // o.builder
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.builder
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
            runFinally();
        }

        @Override // o.builder
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // o.builder
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    FrameworkSQLiteDatabase.values(th);
                    setProgressBackgroundColor.values(th);
                }
            }
        }
    }
}
