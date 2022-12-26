package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendColumns;
import o.setColors;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableSkipLastTimed<T> extends setProgressRotation<T, T> {
    final TimeUnit HaptikSDK$c;
    final long ag$a;
    final appendColumns ah$a;
    final boolean valueOf;
    final int values;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new SkipLastTimedObserver(factory, this.ag$a, this.HaptikSDK$c, this.ah$a, this.values, this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class SkipLastTimedObserver<T> extends AtomicInteger implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        Throwable error;
        final setColors<Object> queue;
        final appendColumns scheduler;
        final long time;
        final TimeUnit unit;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        SkipLastTimedObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, long j, TimeUnit timeUnit, appendColumns appendcolumns, int i, boolean z) {
            this.downstream = factory;
            this.time = j;
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
            this.queue.toString(Long.valueOf(this.scheduler.valueOf(this.unit)), t);
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
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.cancelled;
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SupportSQLiteOpenHelper.Factory<? super T> factory = this.downstream;
            setColors<Object> setcolors = this.queue;
            boolean z = this.delayError;
            TimeUnit timeUnit = this.unit;
            appendColumns appendcolumns = this.scheduler;
            long j = this.time;
            int i = 1;
            while (!this.cancelled) {
                boolean z2 = this.done;
                Long l = (Long) setcolors.ah$a();
                boolean z3 = l == null;
                long valueOf = appendcolumns.valueOf(timeUnit);
                if (!z3 && l.longValue() > valueOf - j) {
                    z3 = true;
                }
                if (z2) {
                    if (!z) {
                        Throwable th = this.error;
                        if (th != null) {
                            this.queue.clear();
                            factory.onError(th);
                            return;
                        } else if (z3) {
                            factory.onComplete();
                            return;
                        }
                    } else if (z3) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            factory.onError(th2);
                            return;
                        } else {
                            factory.onComplete();
                            return;
                        }
                    }
                }
                if (!z3) {
                    setcolors.poll();
                    factory.onNext(setcolors.poll());
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            this.queue.clear();
        }
    }
}
