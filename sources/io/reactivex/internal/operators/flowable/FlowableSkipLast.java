package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import o.SupportSQLiteOpenHelper;
import o.getArrowHeight;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class FlowableSkipLast<T> extends getArrowHeight<T, T> {
    final int values;

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.valueOf.ah$a(new SkipLastSubscriber(registerconfigurationchangelistener, this.values));
    }

    /* loaded from: classes7.dex */
    static final class SkipLastSubscriber<T> extends ArrayDeque<T> implements SupportSQLiteOpenHelper<T>, getSidecarVersion {
        private static final long serialVersionUID = -3807491841935125653L;
        final registerConfigurationChangeListener<? super T> downstream;
        final int skip;
        getSidecarVersion upstream;

        SkipLastSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, int i) {
            super(i);
            this.downstream = registerconfigurationchangelistener;
            this.skip = i;
        }

        @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            if (SubscriptionHelper.validate(this.upstream, getsidecarversion)) {
                this.upstream = getsidecarversion;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            if (this.skip == size()) {
                this.downstream.onNext((T) poll());
            } else {
                this.upstream.request(1L);
            }
            offer(t);
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
            this.upstream.request(j);
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            this.upstream.cancel();
        }
    }
}
