package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendColumns;
import o.isRefreshing;
import o.setProgressBackgroundColor;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableThrottleFirstTimed<T> extends setProgressRotation<T, T> {
    final long ag$a;
    final TimeUnit ah$a;
    final appendColumns valueOf;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new DebounceTimedObserver(new isRefreshing(factory), this.ag$a, this.ah$a, this.valueOf.ah$a()));
    }

    /* loaded from: classes7.dex */
    static final class DebounceTimedObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        boolean done;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final TimeUnit unit;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;
        final appendColumns.values worker;

        DebounceTimedObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, long j, TimeUnit timeUnit, appendColumns.values valuesVar) {
            this.downstream = factory;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = valuesVar;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            if (this.gate || this.done) {
                return;
            }
            this.gate = true;
            this.downstream.onNext(t);
            FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = get();
            if (anonymousClass2 != null) {
                anonymousClass2.dispose();
            }
            DisposableHelper.replace(this, this.worker.ah$a(this, this.timeout, this.unit));
        }

        @Override // java.lang.Runnable
        public void run() {
            this.gate = false;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            if (this.done) {
                setProgressBackgroundColor.values(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.worker.isDisposed();
        }
    }
}
