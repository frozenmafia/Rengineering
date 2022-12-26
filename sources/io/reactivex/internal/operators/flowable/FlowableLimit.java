package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import o.SupportSQLiteOpenHelper;
import o.getArrowHeight;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class FlowableLimit<T> extends getArrowHeight<T, T> {
    final long ah$a;

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.valueOf.ah$a(new LimitSubscriber(registerconfigurationchangelistener, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class LimitSubscriber<T> extends AtomicLong implements SupportSQLiteOpenHelper<T>, getSidecarVersion {
        private static final long serialVersionUID = 2288246011222124525L;
        final registerConfigurationChangeListener<? super T> downstream;
        long remaining;
        getSidecarVersion upstream;

        LimitSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, long j) {
            this.downstream = registerconfigurationchangelistener;
            this.remaining = j;
            lazySet(j);
        }

        @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
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
            setProgressBackgroundColor.values(th);
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
            long j3;
            if (SubscriptionHelper.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    }
                    j3 = j2 <= j ? j2 : j;
                } while (!compareAndSet(j2, j2 - j3));
                this.upstream.request(j3);
            }
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            this.upstream.cancel();
        }
    }
}
