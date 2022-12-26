package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendColumns;
import o.noBackupDirectory;
import o.setProgressRotation;
/* loaded from: classes.dex */
public final class ObservableSubscribeOn<T> extends setProgressRotation<T, T> {
    final appendColumns ah$a;

    public ObservableSubscribeOn(noBackupDirectory<T> nobackupdirectory, appendColumns appendcolumns) {
        super(nobackupdirectory);
        this.ah$a = appendcolumns;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        final SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(factory);
        factory.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.setDisposable(this.ah$a.values(new Runnable(subscribeOnObserver) { // from class: io.reactivex.internal.operators.observable.ObservableSubscribeOn$ag$a
            private final ObservableSubscribeOn.SubscribeOnObserver<T> toString;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.toString = subscribeOnObserver;
            }

            @Override // java.lang.Runnable
            public void run() {
                ObservableSubscribeOn.this.toString.subscribe(this.toString);
            }
        }));
    }

    /* loaded from: classes5.dex */
    static final class SubscribeOnObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 8094547886072529208L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> upstream = new AtomicReference<>();

        SubscribeOnObserver(SupportSQLiteOpenHelper.Factory<? super T> factory) {
            this.downstream = factory;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this.upstream, anonymousClass2);
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
            this.downstream.onComplete();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        void setDisposable(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }
    }
}
