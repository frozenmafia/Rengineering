package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.SupportSQLiteQuery;
import o.appendColumns;
import o.moveSpinner;
/* loaded from: classes7.dex */
public final class ObservableIntervalRange extends SupportSQLiteQuery<Long> {
    final TimeUnit HaptikSDK$a;
    final appendColumns ag$a;
    final long ah$a;
    final long toString;
    final long valueOf;
    final long values;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super Long> factory) {
        IntervalRangeObserver intervalRangeObserver = new IntervalRangeObserver(factory, this.toString, this.ah$a);
        factory.onSubscribe(intervalRangeObserver);
        appendColumns appendcolumns = this.ag$a;
        if (appendcolumns instanceof moveSpinner) {
            appendColumns.values ah$a = appendcolumns.ah$a();
            intervalRangeObserver.setResource(ah$a);
            ah$a.values(intervalRangeObserver, this.valueOf, this.values, this.HaptikSDK$a);
            return;
        }
        intervalRangeObserver.setResource(appendcolumns.ah$a(intervalRangeObserver, this.valueOf, this.values, this.HaptikSDK$a));
    }

    /* loaded from: classes7.dex */
    static final class IntervalRangeObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        long count;
        final SupportSQLiteOpenHelper.Factory<? super Long> downstream;
        final long end;

        IntervalRangeObserver(SupportSQLiteOpenHelper.Factory<? super Long> factory, long j, long j2) {
            this.downstream = factory;
            this.count = j;
            this.end = j2;
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
            long j = this.count;
            this.downstream.onNext(Long.valueOf(j));
            if (j == this.end) {
                DisposableHelper.dispose(this);
                this.downstream.onComplete();
                return;
            }
            this.count = j + 1;
        }

        public void setResource(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }
    }
}
