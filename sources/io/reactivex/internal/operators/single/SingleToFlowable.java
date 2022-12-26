package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import o.FrameworkSQLiteDatabase;
import o.SimpleSQLiteQuery;
import o.appendClause;
import o.having;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class SingleToFlowable<T> extends SimpleSQLiteQuery<T> {
    final having<? extends T> valueOf;

    public SingleToFlowable(having<? extends T> havingVar) {
        this.valueOf = havingVar;
    }

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.valueOf.values(new SingleToFlowableObserver(registerconfigurationchangelistener));
    }

    /* loaded from: classes7.dex */
    static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements appendClause<T> {
        private static final long serialVersionUID = 187782011903685568L;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        SingleToFlowableObserver(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
            super(registerconfigurationchangelistener);
        }

        @Override // o.appendClause
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.appendClause
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // o.appendClause
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }
    }
}
