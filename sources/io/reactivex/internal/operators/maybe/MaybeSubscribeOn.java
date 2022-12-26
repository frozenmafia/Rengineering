package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendColumns;
import o.builder;
import o.setArrowDimensions;
/* loaded from: classes7.dex */
public final class MaybeSubscribeOn<T> extends setArrowDimensions<T, T> {
    final appendColumns ag$a;

    @Override // o.deleteDatabaseFile
    public void values(builder<? super T> builderVar) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(builderVar);
        builderVar.onSubscribe(subscribeOnMaybeObserver);
        subscribeOnMaybeObserver.task.replace(this.ag$a.values(new valueOf(subscribeOnMaybeObserver, this.values)));
    }

    /* loaded from: classes7.dex */
    static final class valueOf<T> implements Runnable {
        final SupportSQLiteOpenHelper.Configuration.Builder<T> ah$a;
        final builder<? super T> toString;

        valueOf(builder<? super T> builderVar, SupportSQLiteOpenHelper.Configuration.Builder<T> builder) {
            this.toString = builderVar;
            this.ah$a = builder;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.ah$a.valueOf(this.toString);
        }
    }

    /* loaded from: classes7.dex */
    static final class SubscribeOnMaybeObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 8571289934935992137L;
        final builder<? super T> downstream;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnMaybeObserver(builder<? super T> builderVar) {
            this.downstream = builderVar;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
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
