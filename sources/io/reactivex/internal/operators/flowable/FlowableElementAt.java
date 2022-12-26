package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import o.SupportSQLiteOpenHelper;
import o.getArrowHeight;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class FlowableElementAt<T> extends getArrowHeight<T, T> {
    final T ah$a;
    final boolean toString;
    final long values;

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.valueOf.ah$a(new ElementAtSubscriber(registerconfigurationchangelistener, this.values, this.ah$a, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements SupportSQLiteOpenHelper<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;
        getSidecarVersion upstream;

        ElementAtSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, long j, T t, boolean z) {
            super(registerconfigurationchangelistener);
            this.index = j;
            this.defaultValue = t;
            this.errorOnFewer = z;
        }

        @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            if (SubscriptionHelper.validate(this.upstream, getsidecarversion)) {
                this.upstream = getsidecarversion;
                this.downstream.onSubscribe(this);
                getsidecarversion.request(Long.MAX_VALUE);
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.count;
            if (j == this.index) {
                this.done = true;
                this.upstream.cancel();
                complete(t);
                return;
            }
            this.count = j + 1;
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            if (this.done) {
                setProgressBackgroundColor.values(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t = this.defaultValue;
            if (t == null) {
                if (this.errorOnFewer) {
                    this.downstream.onError(new NoSuchElementException());
                    return;
                } else {
                    this.downstream.onComplete();
                    return;
                }
            }
            complete(t);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }
}
