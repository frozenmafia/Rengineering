package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import o.SwipeRefreshLayout;
import o.getSidecar;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.required;
/* loaded from: classes7.dex */
public final class FlowableRepeat<T> extends required<T, T> {
    final long toString;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        registerconfigurationchangelistener.onSubscribe(subscriptionArbiter);
        long j = this.toString;
        new RepeatSubscriber(registerconfigurationchangelistener, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, subscriptionArbiter, this.ag$a).subscribeNext();
    }

    /* loaded from: classes7.dex */
    static final class RepeatSubscriber<T> extends AtomicInteger implements SwipeRefreshLayout.AnonymousClass5<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final registerConfigurationChangeListener<? super T> downstream;
        long produced;
        long remaining;
        final SubscriptionArbiter sa;
        final getSidecar<? extends T> source;

        RepeatSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, long j, SubscriptionArbiter subscriptionArbiter, getSidecar<? extends T> getsidecar) {
            this.downstream = registerconfigurationchangelistener;
            this.sa = subscriptionArbiter;
            this.source = getsidecar;
            this.remaining = j;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            this.sa.setSubscription(getsidecarversion);
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sa.isCancelled()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0L;
                        this.sa.produced(j);
                    }
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
