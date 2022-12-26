package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import o.SupportSQLiteOpenHelper;
import o.getArrowHeight;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class FlowableTake<T> extends getArrowHeight<T, T> {
    final long values;

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.valueOf.ah$a(new TakeSubscriber(registerconfigurationchangelistener, this.values));
    }

    /* loaded from: classes7.dex */
    static final class TakeSubscriber<T> extends AtomicBoolean implements SupportSQLiteOpenHelper<T>, getSidecarVersion {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final registerConfigurationChangeListener<? super T> downstream;
        final long limit;
        long remaining;
        getSidecarVersion upstream;

        TakeSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, long j) {
            this.downstream = registerconfigurationchangelistener;
            this.limit = j;
            this.remaining = j;
        }

        @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            if (SubscriptionHelper.validate(this.upstream, getsidecarversion)) {
                this.upstream = getsidecarversion;
                if (this.limit == 0) {
                    getsidecarversion.cancel();
                    this.done = true;
                    EmptySubscription.complete(this.downstream);
                    return;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.remaining;
            long j2 = j - 1;
            this.remaining = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.downstream.onNext(t);
                if (z) {
                    this.upstream.cancel();
                    onComplete();
                }
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onError(th);
                return;
            }
            setProgressBackgroundColor.values(th);
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // o.getSidecarVersion
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                if (!get() && compareAndSet(false, true) && j >= this.limit) {
                    this.upstream.request(Long.MAX_VALUE);
                } else {
                    this.upstream.request(j);
                }
            }
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            this.upstream.cancel();
        }
    }
}
