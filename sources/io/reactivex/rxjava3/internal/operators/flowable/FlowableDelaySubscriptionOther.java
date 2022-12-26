package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.endMetadataList;
import o.getSidecar;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends SwipeRefreshLayout.AnonymousClass2<T> {
    final getSidecar<? extends T> toString;
    final getSidecar<U> values;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        MainSubscriber mainSubscriber = new MainSubscriber(registerconfigurationchangelistener, this.toString);
        registerconfigurationchangelistener.onSubscribe(mainSubscriber);
        this.values.subscribe(mainSubscriber.other);
    }

    /* loaded from: classes7.dex */
    static final class MainSubscriber<T> extends AtomicLong implements SwipeRefreshLayout.AnonymousClass5<T>, getSidecarVersion {
        private static final long serialVersionUID = 2259811067697317255L;
        final registerConfigurationChangeListener<? super T> downstream;
        final getSidecar<? extends T> main;
        final MainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicReference<getSidecarVersion> upstream = new AtomicReference<>();

        MainSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, getSidecar<? extends T> getsidecar) {
            this.downstream = registerconfigurationchangelistener;
            this.main = getsidecar;
        }

        void next() {
            this.main.subscribe(this);
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // o.getSidecarVersion
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                SubscriptionHelper.deferredRequest(this.upstream, this, j);
            }
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            SubscriptionHelper.cancel(this.upstream);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this, getsidecarversion);
        }

        /* loaded from: classes7.dex */
        final class OtherSubscriber extends AtomicReference<getSidecarVersion> implements SwipeRefreshLayout.AnonymousClass5<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            OtherSubscriber() {
            }

            @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
            public void onSubscribe(getSidecarVersion getsidecarversion) {
                if (SubscriptionHelper.setOnce(this, getsidecarversion)) {
                    getsidecarversion.request(Long.MAX_VALUE);
                }
            }

            @Override // o.registerConfigurationChangeListener
            public void onNext(Object obj) {
                getSidecarVersion getsidecarversion = get();
                if (getsidecarversion != SubscriptionHelper.CANCELLED) {
                    lazySet(SubscriptionHelper.CANCELLED);
                    getsidecarversion.cancel();
                    MainSubscriber.this.next();
                }
            }

            @Override // o.registerConfigurationChangeListener
            public void onError(Throwable th) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th);
                } else {
                    endMetadataList.valueOf(th);
                }
            }

            @Override // o.registerConfigurationChangeListener
            public void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.next();
                }
            }
        }
    }
}
