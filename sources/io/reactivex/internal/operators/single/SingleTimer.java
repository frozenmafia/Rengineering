package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendClause;
import o.appendColumns;
import o.groupBy;
/* loaded from: classes7.dex */
public final class SingleTimer extends groupBy<Long> {
    final appendColumns ag$a;
    final long valueOf;
    final TimeUnit values;

    @Override // o.groupBy
    public void toString(appendClause<? super Long> appendclause) {
        TimerDisposable timerDisposable = new TimerDisposable(appendclause);
        appendclause.onSubscribe(timerDisposable);
        timerDisposable.setFuture(this.ag$a.valueOf(timerDisposable, this.valueOf, this.values));
    }

    /* loaded from: classes7.dex */
    static final class TimerDisposable extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        final appendClause<? super Long> downstream;

        TimerDisposable(appendClause<? super Long> appendclause) {
            this.downstream = appendclause;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.downstream.onSuccess(0L);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        void setFuture(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.replace(this, anonymousClass2);
        }
    }
}
