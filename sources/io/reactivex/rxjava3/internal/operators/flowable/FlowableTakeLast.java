package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o.SwipeRefreshLayout;
import o.codepointsLength;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.required;
/* loaded from: classes7.dex */
public final class FlowableTakeLast<T> extends required<T, T> {
    final int ah$a;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.ag$a.values(new TakeLastSubscriber(registerconfigurationchangelistener, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class TakeLastSubscriber<T> extends ArrayDeque<T> implements SwipeRefreshLayout.AnonymousClass5<T>, getSidecarVersion {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        volatile boolean done;
        final registerConfigurationChangeListener<? super T> downstream;
        getSidecarVersion upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger wip = new AtomicInteger();

        TakeLastSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, int i) {
            this.downstream = registerconfigurationchangelistener;
            this.count = i;
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
            if (this.count == size()) {
                poll();
            }
            offer(t);
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // o.getSidecarVersion
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                codepointsLength.ag$a(this.requested, j);
                drain();
            }
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        void drain() {
            if (this.wip.getAndIncrement() == 0) {
                registerConfigurationChangeListener<? super T> registerconfigurationchangelistener = this.downstream;
                long j = this.requested.get();
                while (!this.cancelled) {
                    if (this.done) {
                        long j2 = 0;
                        while (j2 != j) {
                            if (this.cancelled) {
                                return;
                            }
                            Object obj = (T) poll();
                            if (obj == null) {
                                registerconfigurationchangelistener.onComplete();
                                return;
                            } else {
                                registerconfigurationchangelistener.onNext(obj);
                                j2++;
                            }
                        }
                        if (isEmpty()) {
                            registerconfigurationchangelistener.onComplete();
                            return;
                        } else if (j2 != 0) {
                            j = codepointsLength.toString(this.requested, j2);
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }
}
