package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.noBackupDirectory;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableRepeat<T> extends setProgressRotation<T, T> {
    final long ag$a;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        factory.onSubscribe(sequentialDisposable);
        long j = this.ag$a;
        new RepeatObserver(factory, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, sequentialDisposable, this.toString).subscribeNext();
    }

    /* loaded from: classes7.dex */
    static final class RepeatObserver<T> extends AtomicInteger implements SupportSQLiteOpenHelper.Factory<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        long remaining;
        final SequentialDisposable sd;
        final noBackupDirectory<? extends T> source;

        RepeatObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, long j, SequentialDisposable sequentialDisposable, noBackupDirectory<? extends T> nobackupdirectory) {
            this.downstream = factory;
            this.sd = sequentialDisposable;
            this.source = nobackupdirectory;
            this.remaining = j;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            this.sd.replace(anonymousClass2);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sd.isDisposed()) {
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
