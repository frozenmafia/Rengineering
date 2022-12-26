package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.SupportSQLiteQuery;
import o.appendColumns;
import o.moveSpinner;
/* loaded from: classes.dex */
public final class ObservableInterval extends SupportSQLiteQuery<Long> {
    final long ag$a;
    final appendColumns ah$a;
    final long toString;
    final TimeUnit values;

    public ObservableInterval(long j, long j2, TimeUnit timeUnit, appendColumns appendcolumns) {
        this.toString = j;
        this.ag$a = j2;
        this.values = timeUnit;
        this.ah$a = appendcolumns;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super Long> factory) {
        IntervalObserver intervalObserver = new IntervalObserver(factory);
        factory.onSubscribe(intervalObserver);
        appendColumns appendcolumns = this.ah$a;
        if (appendcolumns instanceof moveSpinner) {
            appendColumns.values ah$a = appendcolumns.ah$a();
            intervalObserver.setResource(ah$a);
            ah$a.values(intervalObserver, this.toString, this.ag$a, this.values);
            return;
        }
        intervalObserver.setResource(appendcolumns.ah$a(intervalObserver, this.toString, this.ag$a, this.values));
    }

    /* loaded from: classes5.dex */
    static final class IntervalObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
        final SupportSQLiteOpenHelper.Factory<? super Long> downstream;

        IntervalObserver(SupportSQLiteOpenHelper.Factory<? super Long> factory) {
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
            if (get() != DisposableHelper.DISPOSED) {
                SupportSQLiteOpenHelper.Factory<? super Long> factory = this.downstream;
                long j = this.count;
                this.count = 1 + j;
                factory.onNext(Long.valueOf(j));
            }
        }

        public void setResource(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }
    }
}
