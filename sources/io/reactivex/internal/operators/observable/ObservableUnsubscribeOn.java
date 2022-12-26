package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendColumns;
import o.noBackupDirectory;
import o.setProgressBackgroundColor;
import o.setProgressRotation;
/* loaded from: classes.dex */
public final class ObservableUnsubscribeOn<T> extends setProgressRotation<T, T> {
    final appendColumns ag$a;

    public ObservableUnsubscribeOn(noBackupDirectory<T> nobackupdirectory, appendColumns appendcolumns) {
        super(nobackupdirectory);
        this.ag$a = appendcolumns;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new UnsubscribeObserver(factory, this.ag$a));
    }

    /* loaded from: classes7.dex */
    static final class UnsubscribeObserver<T> extends AtomicBoolean implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 1015244841293359600L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final appendColumns scheduler;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        UnsubscribeObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, appendColumns appendcolumns) {
            this.downstream = factory;
            this.scheduler = appendcolumns;
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
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            if (get()) {
                setProgressBackgroundColor.values(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.scheduler.values(new values());
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get();
        }

        /* loaded from: classes7.dex */
        final class values implements Runnable {
            values() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeObserver.this.upstream.dispose();
            }
        }
    }
}
