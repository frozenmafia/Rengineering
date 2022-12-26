package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.required;
/* loaded from: classes7.dex */
public final class FlowableConcatWithCompletable<T> extends required<T, T> {
    final SwipeRefreshLayout.AnonymousClass1 values;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.ag$a.values(new ConcatWithSubscriber(registerconfigurationchangelistener, this.values));
    }

    /* loaded from: classes7.dex */
    static final class ConcatWithSubscriber<T> extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass5<T>, SwipeRefreshLayout.AnonymousClass3, getSidecarVersion {
        private static final long serialVersionUID = -7346385463600070225L;
        final registerConfigurationChangeListener<? super T> downstream;
        boolean inCompletable;
        SwipeRefreshLayout.AnonymousClass1 other;
        getSidecarVersion upstream;

        ConcatWithSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, SwipeRefreshLayout.AnonymousClass1 anonymousClass1) {
            this.downstream = registerconfigurationchangelistener;
            this.other = anonymousClass1;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            if (SubscriptionHelper.validate(this.upstream, getsidecarversion)) {
                this.upstream = getsidecarversion;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.setOnce(this, datastart);
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
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            this.upstream = SubscriptionHelper.CANCELLED;
            SwipeRefreshLayout.AnonymousClass1 anonymousClass1 = this.other;
            this.other = null;
            anonymousClass1.values(this);
        }

        @Override // o.getSidecarVersion
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            this.upstream.cancel();
            DisposableHelper.dispose(this);
        }
    }
}
