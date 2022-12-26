package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendColumns;
import o.builder;
import o.deleteDatabaseFile;
/* loaded from: classes7.dex */
public final class MaybeTimer extends deleteDatabaseFile<Long> {
    final long ag$a;
    final TimeUnit ah$a;
    final appendColumns toString;

    @Override // o.deleteDatabaseFile
    public void values(builder<? super Long> builderVar) {
        TimerDisposable timerDisposable = new TimerDisposable(builderVar);
        builderVar.onSubscribe(timerDisposable);
        timerDisposable.setFuture(this.toString.valueOf(timerDisposable, this.ag$a, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class TimerDisposable extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;
        final builder<? super Long> downstream;

        TimerDisposable(builder<? super Long> builderVar) {
            this.downstream = builderVar;
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
