package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.getWrappedDb;
import o.noBackupDirectory;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableRetryBiPredicate<T> extends setProgressRotation<T, T> {
    final getWrappedDb<? super Integer, ? super Throwable> values;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        factory.onSubscribe(sequentialDisposable);
        new RetryBiObserver(factory, this.values, sequentialDisposable, this.toString).subscribeNext();
    }

    /* loaded from: classes7.dex */
    static final class RetryBiObserver<T> extends AtomicInteger implements SupportSQLiteOpenHelper.Factory<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final getWrappedDb<? super Integer, ? super Throwable> predicate;
        int retries;
        final noBackupDirectory<? extends T> source;
        final SequentialDisposable upstream;

        RetryBiObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, getWrappedDb<? super Integer, ? super Throwable> getwrappeddb, SequentialDisposable sequentialDisposable, noBackupDirectory<? extends T> nobackupdirectory) {
            this.downstream = factory;
            this.upstream = sequentialDisposable;
            this.source = nobackupdirectory;
            this.predicate = getwrappeddb;
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
            try {
                getWrappedDb<? super Integer, ? super Throwable> getwrappeddb = this.predicate;
                int i = this.retries + 1;
                this.retries = i;
                if (!getwrappeddb.valueOf(Integer.valueOf(i), th)) {
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
