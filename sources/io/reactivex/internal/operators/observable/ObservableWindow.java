package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.SupportSQLiteQuery;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableWindow<T> extends setProgressRotation<T, SupportSQLiteQuery<T>> {
    final int ah$a;
    final long valueOf;
    final long values;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super SupportSQLiteQuery<T>> factory) {
        if (this.values == this.valueOf) {
            this.toString.subscribe(new WindowExactObserver(factory, this.values, this.ah$a));
        } else {
            this.toString.subscribe(new WindowSkipObserver(factory, this.values, this.valueOf, this.ah$a));
        }
    }

    /* loaded from: classes7.dex */
    static final class WindowExactObserver<T> extends AtomicInteger implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final SupportSQLiteOpenHelper.Factory<? super SupportSQLiteQuery<T>> downstream;
        long size;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;
        UnicastSubject<T> window;

        WindowExactObserver(SupportSQLiteOpenHelper.Factory<? super SupportSQLiteQuery<T>> factory, long j, int i) {
            this.downstream = factory;
            this.count = j;
            this.capacityHint = i;
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
            UnicastSubject<T> unicastSubject = this.window;
            if (unicastSubject == null && !this.cancelled) {
                unicastSubject = UnicastSubject.ag$a(this.capacityHint, this);
                this.window = unicastSubject;
                this.downstream.onNext(unicastSubject);
            }
            if (unicastSubject != null) {
                unicastSubject.onNext(t);
                long j = this.size + 1;
                this.size = j;
                if (j >= this.count) {
                    this.size = 0L;
                    this.window = null;
                    unicastSubject.onComplete();
                    if (this.cancelled) {
                        this.upstream.dispose();
                    }
                }
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            UnicastSubject<T> unicastSubject = this.window;
            if (unicastSubject != null) {
                this.window = null;
                unicastSubject.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            UnicastSubject<T> unicastSubject = this.window;
            if (unicastSubject != null) {
                this.window = null;
                unicastSubject.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.cancelled = true;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.upstream.dispose();
            }
        }
    }

    /* loaded from: classes7.dex */
    static final class WindowSkipObserver<T> extends AtomicBoolean implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final SupportSQLiteOpenHelper.Factory<? super SupportSQLiteQuery<T>> downstream;
        long firstEmission;
        long index;
        final long skip;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;
        final AtomicInteger wip = new AtomicInteger();
        final ArrayDeque<UnicastSubject<T>> windows = new ArrayDeque<>();

        WindowSkipObserver(SupportSQLiteOpenHelper.Factory<? super SupportSQLiteQuery<T>> factory, long j, long j2, int i) {
            this.downstream = factory;
            this.count = j;
            this.skip = j2;
            this.capacityHint = i;
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
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            long j = this.index;
            long j2 = this.skip;
            if (j % j2 == 0 && !this.cancelled) {
                this.wip.getAndIncrement();
                UnicastSubject<T> ag$a = UnicastSubject.ag$a(this.capacityHint, this);
                arrayDeque.offer(ag$a);
                this.downstream.onNext(ag$a);
            }
            long j3 = this.firstEmission + 1;
            Iterator<UnicastSubject<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j3 >= this.count) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.cancelled) {
                    this.upstream.dispose();
                    return;
                }
                this.firstEmission = j3 - j2;
            } else {
                this.firstEmission = j3;
            }
            this.index = j + 1;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.cancelled = true;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.decrementAndGet() == 0 && this.cancelled) {
                this.upstream.dispose();
            }
        }
    }
}
