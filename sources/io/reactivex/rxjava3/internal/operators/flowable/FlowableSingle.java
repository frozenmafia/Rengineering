package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import o.SwipeRefreshLayout;
import o.endMetadataList;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.required;
/* loaded from: classes7.dex */
public final class FlowableSingle<T> extends required<T, T> {
    final boolean ah$a;
    final T values;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.ag$a.values(new SingleElementSubscriber(registerconfigurationchangelistener, this.values, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements SwipeRefreshLayout.AnonymousClass5<T> {
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

        @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
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
                endMetadataList.valueOf(th);
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

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }
}
