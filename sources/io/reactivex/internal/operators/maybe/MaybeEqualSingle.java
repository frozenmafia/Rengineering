package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendClause;
import o.builder;
import o.getWrappedDb;
import o.groupBy;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class MaybeEqualSingle<T> extends groupBy<Boolean> {
    final getWrappedDb<? super T, ? super T> ah$a;
    final SupportSQLiteOpenHelper.Configuration.Builder<? extends T> valueOf;
    final SupportSQLiteOpenHelper.Configuration.Builder<? extends T> values;

    @Override // o.groupBy
    public void toString(appendClause<? super Boolean> appendclause) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(appendclause, this.ah$a);
        appendclause.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe(this.values, this.valueOf);
    }

    /* loaded from: classes7.dex */
    static final class EqualCoordinator<T> extends AtomicInteger implements FrameworkSQLiteDatabase.AnonymousClass2 {
        final appendClause<? super Boolean> downstream;
        final getWrappedDb<? super T, ? super T> isEqual;
        final EqualObserver<T> observer1;
        final EqualObserver<T> observer2;

        EqualCoordinator(appendClause<? super Boolean> appendclause, getWrappedDb<? super T, ? super T> getwrappeddb) {
            super(2);
            this.downstream = appendclause;
            this.isEqual = getwrappeddb;
            this.observer1 = new EqualObserver<>(this);
            this.observer2 = new EqualObserver<>(this);
        }

        void subscribe(SupportSQLiteOpenHelper.Configuration.Builder<? extends T> builder, SupportSQLiteOpenHelper.Configuration.Builder<? extends T> builder2) {
            builder.valueOf(this.observer1);
            builder2.valueOf(this.observer2);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.observer1.dispose();
            this.observer2.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.observer1.get());
        }

        void done() {
            if (decrementAndGet() == 0) {
                Object obj = this.observer1.value;
                Object obj2 = this.observer2.value;
                if (obj != null && obj2 != null) {
                    try {
                        this.downstream.onSuccess(Boolean.valueOf(this.isEqual.valueOf(obj, obj2)));
                        return;
                    } catch (Throwable th) {
                        FrameworkSQLiteDatabase.values(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                this.downstream.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
            }
        }

        void error(EqualObserver<T> equalObserver, Throwable th) {
            if (getAndSet(0) > 0) {
                EqualObserver<T> equalObserver2 = this.observer1;
                if (equalObserver == equalObserver2) {
                    this.observer2.dispose();
                } else {
                    equalObserver2.dispose();
                }
                this.downstream.onError(th);
                return;
            }
            setProgressBackgroundColor.values(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class EqualObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T> {
        private static final long serialVersionUID = -3031974433025990931L;
        final EqualCoordinator<T> parent;
        Object value;

        EqualObserver(EqualCoordinator<T> equalCoordinator) {
            this.parent = equalCoordinator;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.builder
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }

        @Override // o.builder
        public void onSuccess(T t) {
            this.value = t;
            this.parent.done();
        }

        @Override // o.builder
        public void onError(Throwable th) {
            this.parent.error(this, th);
        }

        @Override // o.builder
        public void onComplete() {
            this.parent.done();
        }
    }
}
