package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.getWritableSupportDatabase;
import o.noBackupDirectory;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableRepeatUntil<T> extends setProgressRotation<T, T> {
    final getWritableSupportDatabase ag$a;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        factory.onSubscribe(sequentialDisposable);
        new RepeatUntilObserver(factory, this.ag$a, sequentialDisposable, this.toString).subscribeNext();
    }

    /* loaded from: classes7.dex */
    static final class RepeatUntilObserver<T> extends AtomicInteger implements SupportSQLiteOpenHelper.Factory<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final noBackupDirectory<? extends T> source;
        final getWritableSupportDatabase stop;
        final SequentialDisposable upstream;

        RepeatUntilObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, getWritableSupportDatabase getwritablesupportdatabase, SequentialDisposable sequentialDisposable, noBackupDirectory<? extends T> nobackupdirectory) {
            this.downstream = factory;
            this.upstream = sequentialDisposable;
            this.source = nobackupdirectory;
            this.stop = getwritablesupportdatabase;
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
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            try {
                if (this.stop.getAsBoolean()) {
                    this.downstream.onComplete();
                } else {
                    subscribeNext();
                }
            } catch (Throwable th) {
                FrameworkSQLiteDatabase.values(th);
                this.downstream.onError(th);
            }
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }
}
