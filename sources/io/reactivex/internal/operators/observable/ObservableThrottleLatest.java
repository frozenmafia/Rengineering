package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendColumns;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableThrottleLatest<T> extends setProgressRotation<T, T> {
    final appendColumns ag$a;
    final long ah$a;
    final boolean valueOf;
    final TimeUnit values;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new ThrottleLatestObserver(factory, this.ah$a, this.values, this.ag$a.ah$a(), this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class ThrottleLatestObserver<T> extends AtomicInteger implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final boolean emitLast;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;
        final appendColumns.values worker;

        ThrottleLatestObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, long j, TimeUnit timeUnit, appendColumns.values valuesVar, boolean z) {
            this.downstream = factory;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = valuesVar;
            this.emitLast = z;
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
            this.latest.set(t);
            drain();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.latest;
            SupportSQLiteOpenHelper.Factory<? super T> factory = this.downstream;
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                if (z && this.error != null) {
                    atomicReference.lazySet(null);
                    factory.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z2 && this.emitLast) {
                        factory.onNext(andSet);
                    }
                    factory.onComplete();
                    this.worker.dispose();
                    return;
                }
                if (z2) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                } else if (!this.timerRunning || this.timerFired) {
                    factory.onNext(atomicReference.getAndSet(null));
                    this.timerFired = false;
                    this.timerRunning = true;
                    this.worker.ah$a(this, this.timeout, this.unit);
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }
    }
}
