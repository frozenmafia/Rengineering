package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getSidecar;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class CompletableAndThenPublisher<R> extends SwipeRefreshLayout.AnonymousClass2<R> {
    final SwipeRefreshLayout.AnonymousClass1 ag$a;
    final getSidecar<? extends R> toString;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super R> registerconfigurationchangelistener) {
        this.ag$a.values(new AndThenPublisherSubscriber(registerconfigurationchangelistener, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class AndThenPublisherSubscriber<R> extends AtomicReference<getSidecarVersion> implements SwipeRefreshLayout.AnonymousClass5<R>, SwipeRefreshLayout.AnonymousClass3, getSidecarVersion {
        private static final long serialVersionUID = -8948264376121066672L;
        final registerConfigurationChangeListener<? super R> downstream;
        getSidecar<? extends R> other;
        final AtomicLong requested = new AtomicLong();
        dataStart upstream;

        AndThenPublisherSubscriber(registerConfigurationChangeListener<? super R> registerconfigurationchangelistener, getSidecar<? extends R> getsidecar) {
            this.downstream = registerconfigurationchangelistener;
            this.other = getsidecar;
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            getSidecar<? extends R> getsidecar = this.other;
            if (getsidecar == null) {
                this.downstream.onComplete();
                return;
            }
            this.other = null;
            getsidecar.subscribe(this);
        }

        @Override // o.getSidecarVersion
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this, this.requested, j);
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, getsidecarversion);
        }
    }
}
