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
public final class FlowableSingle<T> extends getArrowHeight<T, T> {
    final T ah$a;
    final boolean values;

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.valueOf.ah$a(new SingleElementSubscriber(registerconfigurationchangelistener, this.ah$a, this.values));
    }

    /* loaded from: classes7.dex */
    static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements SupportSQLiteOpenHelper<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        final T defaultValue;
        boolean done;
        final boolean failOnEmpty;
        getSidecarVersion upstream;

        SingleElementSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, T t, boolean z) {
            super(registerconfigurationchangelistener);
            this.defaultValue = t;
            this.failOnEmpty = z;
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
            if (this.value != null) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.value = t;
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
            T t = this.value;
            this.value = null;
            if (t == null) {
                t = this.defaultValue;
            }
            if (t == null) {
                if (this.failOnEmpty) {
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
