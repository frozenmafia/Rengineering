package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.SupportSQLiteQuery;
import o.appendColumns;
/* loaded from: classes.dex */
public final class ObservableTimer extends SupportSQLiteQuery<Long> {
    final long ag$a;
    final TimeUnit valueOf;
    final appendColumns values;

    public ObservableTimer(long j, TimeUnit timeUnit, appendColumns appendcolumns) {
        this.ag$a = j;
        this.valueOf = timeUnit;
        this.values = appendcolumns;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super Long> factory) {
        TimerObserver timerObserver = new TimerObserver(factory);
        factory.onSubscribe(timerObserver);
        timerObserver.setResource(this.values.valueOf(timerObserver, this.ag$a, this.valueOf));
    }

    /* loaded from: classes5.dex */
    static final class TimerObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final SupportSQLiteOpenHelper.Factory<? super Long> downstream;

        TimerObserver(SupportSQLiteOpenHelper.Factory<? super Long> factory) {
            this.downstream = factory;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            this.downstream.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            this.downstream.onComplete();
        }

        public void setResource(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.trySet(this, anonymousClass2);
        }
    }
}
