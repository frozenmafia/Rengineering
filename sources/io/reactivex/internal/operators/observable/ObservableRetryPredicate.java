package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.initializeComponent;
import o.noBackupDirectory;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableRetryPredicate<T> extends setProgressRotation<T, T> {
    final long ah$a;
    final initializeComponent<? super Throwable> valueOf;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        factory.onSubscribe(sequentialDisposable);
        new RepeatObserver(factory, this.ah$a, this.valueOf, sequentialDisposable, this.toString).subscribeNext();
    }

    /* loaded from: classes7.dex */
    static final class RepeatObserver<T> extends AtomicInteger implements SupportSQLiteOpenHelper.Factory<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final initializeComponent<? super Throwable> predicate;
        long remaining;
        final noBackupDirectory<? extends T> source;
        final SequentialDisposable upstream;

        RepeatObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, long j, initializeComponent<? super Throwable> initializecomponent, SequentialDisposable sequentialDisposable, noBackupDirectory<? extends T> nobackupdirectory) {
            this.downstream = factory;
            this.upstream = sequentialDisposable;
            this.source = nobackupdirectory;
            this.predicate = initializecomponent;
            this.remaining = j;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            this.upstream.replace(anonymousClass2);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
                    this.downstream.onError(th);
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                FrameworkSQLiteDatabase.values(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            this.downstream.onComplete();
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.upstream.isDisposed()) {
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
