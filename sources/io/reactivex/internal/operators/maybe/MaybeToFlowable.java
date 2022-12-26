package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import o.FrameworkSQLiteDatabase;
import o.SimpleSQLiteQuery;
import o.SupportSQLiteOpenHelper;
import o.builder;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class MaybeToFlowable<T> extends SimpleSQLiteQuery<T> {
    final SupportSQLiteOpenHelper.Configuration.Builder<T> valueOf;

    public MaybeToFlowable(SupportSQLiteOpenHelper.Configuration.Builder<T> builder) {
        this.valueOf = builder;
    }

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.valueOf.valueOf(new MaybeToFlowableSubscriber(registerconfigurationchangelistener));
    }

    /* loaded from: classes7.dex */
    static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements builder<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        MaybeToFlowableSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
            super(registerconfigurationchangelistener);
        }

        @Override // o.builder
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.builder
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // o.builder
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.builder
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }
    }
}
