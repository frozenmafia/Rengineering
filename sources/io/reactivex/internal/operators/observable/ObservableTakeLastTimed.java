package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendColumns;
import o.setColors;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableTakeLastTimed<T> extends setProgressRotation<T, T> {
    final long HaptikSDK$a;
    final int ag$a;
    final boolean ah$a;
    final TimeUnit invoke;
    final long valueOf;
    final appendColumns values;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new TakeLastTimedObserver(factory, this.valueOf, this.HaptikSDK$a, this.invoke, this.values, this.ag$a, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class TakeLastTimedObserver<T> extends AtomicBoolean implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        Throwable error;
        final setColors<Object> queue;
        final appendColumns scheduler;
        final long time;
        final TimeUnit unit;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        TakeLastTimedObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, long j, long j2, TimeUnit timeUnit, appendColumns appendcolumns, int i, boolean z) {
            this.downstream = factory;
            this.count = j;
            this.time = j2;
            this.unit = timeUnit;
            this.scheduler = appendcolumns;
            this.queue = new setColors<>(i);
            this.delayError = z;
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
            setColors<Object> setcolors = this.queue;
            long valueOf = this.scheduler.valueOf(this.unit);
            long j = this.time;
            long j2 = this.count;
            boolean z = j2 == Long.MAX_VALUE;
            setcolors.toString(Long.valueOf(valueOf), t);
            while (!setcolors.isEmpty()) {
                if (((Long) setcolors.ah$a()).longValue() > valueOf - j && (z || (setcolors.valueOf() >> 1) <= j2)) {
                    return;
                }
                setcolors.poll();
                setcolors.poll();
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.error = th;
            drain();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            drain();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.queue.clear();
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.cancelled;
        }

        void drain() {
            Throwable th;
            if (compareAndSet(false, true)) {
                SupportSQLiteOpenHelper.Factory<? super T> factory = this.downstream;
                setColors<Object> setcolors = this.queue;
                boolean z = this.delayError;
                long valueOf = this.scheduler.valueOf(this.unit);
                long j = this.time;
                while (!this.cancelled) {
                    if (!z && (th = this.error) != null) {
                        setcolors.clear();
                        factory.onError(th);
                        return;
                    }
                    Object poll = setcolors.poll();
                    if (poll == null) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            factory.onError(th2);
                            return;
                        } else {
                            factory.onComplete();
                            return;
                        }
                    }
                    Object poll2 = setcolors.poll();
                    if (((Long) poll).longValue() >= valueOf - j) {
                        factory.onNext(poll2);
                    }
                }
                setcolors.clear();
            }
        }
    }
}
