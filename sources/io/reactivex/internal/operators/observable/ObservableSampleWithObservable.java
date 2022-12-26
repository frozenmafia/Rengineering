package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.isRefreshing;
import o.noBackupDirectory;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableSampleWithObservable<T> extends setProgressRotation<T, T> {
    final noBackupDirectory<?> ah$a;
    final boolean values;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        isRefreshing isrefreshing = new isRefreshing(factory);
        if (this.values) {
            this.toString.subscribe(new SampleMainEmitLast(isrefreshing, this.ah$a));
        } else {
            this.toString.subscribe(new SampleMainNoLast(isrefreshing, this.ah$a));
        }
    }

    /* loaded from: classes7.dex */
    static abstract class SampleMainObserver<T> extends AtomicReference<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -3517602651313910099L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> other = new AtomicReference<>();
        final noBackupDirectory<?> sampler;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        abstract void completion();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void run();

        SampleMainObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, noBackupDirectory<?> nobackupdirectory) {
            this.downstream = factory;
            this.sampler = nobackupdirectory;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new SupportSQLiteOpenHelper.Factory<Object>(this) { // from class: io.reactivex.internal.operators.observable.ObservableSampleWithObservable$ag$a
                        final ObservableSampleWithObservable.SampleMainObserver<T> ah$a;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.ah$a = this;
                        }

                        @Override // o.SupportSQLiteOpenHelper.Factory
                        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass22) {
                            this.ah$a.setOther(anonymousClass22);
                        }

                        @Override // o.SupportSQLiteOpenHelper.Factory
                        public void onNext(Object obj) {
                            this.ah$a.run();
                        }

                        @Override // o.SupportSQLiteOpenHelper.Factory
                        public void onError(Throwable th) {
                            this.ah$a.error(th);
                        }

                        @Override // o.SupportSQLiteOpenHelper.Factory
                        public void onComplete() {
                            this.ah$a.complete();
                        }
                    });
                }
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            completion();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean setOther(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            return DisposableHelper.setOnce(this.other, anonymousClass2);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this.other);
            this.upstream.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.other.get() == DisposableHelper.DISPOSED;
        }

        public void error(Throwable th) {
            this.upstream.dispose();
            this.downstream.onError(th);
        }

        public void complete() {
            this.upstream.dispose();
            completion();
        }

        void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }
    }

    /* loaded from: classes7.dex */
    static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(SupportSQLiteOpenHelper.Factory<? super T> factory, noBackupDirectory<?> nobackupdirectory) {
            super(factory, nobackupdirectory);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void completion() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void run() {
            emit();
        }
    }

    /* loaded from: classes7.dex */
    static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final AtomicInteger wip;

        SampleMainEmitLast(SupportSQLiteOpenHelper.Factory<? super T> factory, noBackupDirectory<?> nobackupdirectory) {
            super(factory, nobackupdirectory);
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void completion() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z = this.done;
                    emit();
                    if (z) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }
    }
}
