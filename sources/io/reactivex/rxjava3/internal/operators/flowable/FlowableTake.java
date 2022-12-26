package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import o.SwipeRefreshLayout;
import o.endMetadataList;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.required;
/* loaded from: classes7.dex */
public final class FlowableTake<T> extends required<T, T> {
    final long ah$a;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.ag$a.values(new TakeSubscriber(registerconfigurationchangelistener, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class TakeSubscriber<T> extends AtomicLong implements SwipeRefreshLayout.AnonymousClass5<T>, getSidecarVersion {
        private static final long serialVersionUID = 2288246011222124525L;
        final registerConfigurationChangeListener<? super T> downstream;
        long remaining;
        getSidecarVersion upstream;

        TakeSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, long j) {
            this.downstream = registerconfigurationchangelistener;
            this.remaining = j;
            lazySet(j);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            if (SubscriptionHelper.validate(this.upstream, getsidecarversion)) {
                if (this.remaining == 0) {
                    getsidecarversion.cancel();
                    EmptySubscription.complete(this.downstream);
                    return;
                }
                this.upstream = getsidecarversion;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            long j = this.remaining;
            if (j > 0) {
                long j2 = j - 1;
                this.remaining = j2;
                this.downstream.onNext(t);
                if (j2 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onError(th);
                return;
            }
            endMetadataList.valueOf(th);
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // o.getSidecarVersion
        public void request(long j) {
            long j2;
            long min;
            if (SubscriptionHelper.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    }
                    min = Math.min(j2, j);
                } while (!compareAndSet(j2, j2 - min));
                this.upstream.request(min);
            }
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            this.upstream.cancel();
        }
    }
}
