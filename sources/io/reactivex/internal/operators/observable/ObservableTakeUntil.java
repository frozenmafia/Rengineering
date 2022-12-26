package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.getProgressViewEndOffset;
import o.noBackupDirectory;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableTakeUntil<T, U> extends setProgressRotation<T, T> {
    final noBackupDirectory<? extends U> ag$a;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(factory);
        factory.onSubscribe(takeUntilMainObserver);
        this.ag$a.subscribe(takeUntilMainObserver.otherObserver);
        this.toString.subscribe(takeUntilMainObserver);
    }

    /* loaded from: classes7.dex */
    static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 1418547743690811973L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> upstream = new AtomicReference<>();
        final TakeUntilMainObserver<T, U>.OtherObserver otherObserver = new OtherObserver();
        final AtomicThrowable error = new AtomicThrowable();

        TakeUntilMainObserver(SupportSQLiteOpenHelper.Factory<? super T> factory) {
            this.downstream = factory;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.otherObserver);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this.upstream, anonymousClass2);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            getProgressViewEndOffset.valueOf(this.downstream, t, this, this.error);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.otherObserver);
            getProgressViewEndOffset.ag$a(this.downstream, th, this, this.error);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            DisposableHelper.dispose(this.otherObserver);
            getProgressViewEndOffset.ah$a(this.downstream, this, this.error);
        }

        void otherError(Throwable th) {
            DisposableHelper.dispose(this.upstream);
            getProgressViewEndOffset.ag$a(this.downstream, th, this, this.error);
        }

        void otherComplete() {
            DisposableHelper.dispose(this.upstream);
            getProgressViewEndOffset.ah$a(this.downstream, this, this.error);
        }

        /* loaded from: classes7.dex */
        final class OtherObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            OtherObserver() {
            }

            @Override // o.SupportSQLiteOpenHelper.Factory
            public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
                DisposableHelper.setOnce(this, anonymousClass2);
            }

            @Override // o.SupportSQLiteOpenHelper.Factory
            public void onNext(U u) {
                DisposableHelper.dispose(this);
                TakeUntilMainObserver.this.otherComplete();
            }

            @Override // o.SupportSQLiteOpenHelper.Factory
            public void onError(Throwable th) {
                TakeUntilMainObserver.this.otherError(th);
            }

            @Override // o.SupportSQLiteOpenHelper.Factory
            public void onComplete() {
                TakeUntilMainObserver.this.otherComplete();
            }
        }
    }
}
