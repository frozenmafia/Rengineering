package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableTakeLast<T> extends setProgressRotation<T, T> {
    final int ag$a;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new TakeLastObserver(factory, this.ag$a));
    }

    /* loaded from: classes7.dex */
    static final class TakeLastObserver<T> extends ArrayDeque<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        TakeLastObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, int i) {
            this.downstream = factory;
            this.count = i;
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
            if (this.count == size()) {
                poll();
            }
            offer(t);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            SupportSQLiteOpenHelper.Factory<? super T> factory = this.downstream;
            while (!this.cancelled) {
                Object obj = (T) poll();
                if (obj == null) {
                    if (this.cancelled) {
                        return;
                    }
                    factory.onComplete();
                    return;
                }
                factory.onNext(obj);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.cancelled;
        }
    }
}
