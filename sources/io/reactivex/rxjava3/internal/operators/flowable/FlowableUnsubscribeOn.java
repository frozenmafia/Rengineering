package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import o.SwipeRefreshLayout;
import o.endMetadataList;
import o.getLoopers;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.required;
/* loaded from: classes7.dex */
public final class FlowableUnsubscribeOn<T> extends required<T, T> {
    final getLoopers values;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.ag$a.values(new UnsubscribeSubscriber(registerconfigurationchangelistener, this.values));
    }

    /* loaded from: classes7.dex */
    static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements SwipeRefreshLayout.AnonymousClass5<T>, getSidecarVersion {
        private static final long serialVersionUID = 1015244841293359600L;
        final registerConfigurationChangeListener<? super T> downstream;
        final getLoopers scheduler;
        getSidecarVersion upstream;

        UnsubscribeSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, getLoopers getloopers) {
            this.downstream = registerconfigurationchangelistener;
            this.scheduler = getloopers;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            if (SubscriptionHelper.validate(this.upstream, getsidecarversion)) {
                this.upstream = getsidecarversion;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            if (get()) {
                endMetadataList.valueOf(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // o.getSidecarVersion
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.scheduler.values(new valueOf());
            }
        }

        /* loaded from: classes7.dex */
        final class valueOf implements Runnable {
            valueOf() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeSubscriber.this.upstream.cancel();
            }
        }
    }
}
