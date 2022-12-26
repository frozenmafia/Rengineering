package io.reactivex.rxjava3.internal.subscribers;

import com.google.android.exoplayer2.C;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import o.SwipeRefreshLayout;
import o.codepointsLength;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements SwipeRefreshLayout.AnonymousClass5<T>, getSidecarVersion {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final registerConfigurationChangeListener<? super R> downstream;
    protected long produced;
    protected getSidecarVersion upstream;
    protected R value;

    protected void onDrop(R r) {
    }

    public SinglePostCompleteSubscriber(registerConfigurationChangeListener<? super R> registerconfigurationchangelistener) {
        this.downstream = registerconfigurationchangelistener;
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (SubscriptionHelper.validate(this.upstream, getsidecarversion)) {
            this.upstream = getsidecarversion;
            this.downstream.onSubscribe(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void complete(R r) {
        long j = this.produced;
        if (j != 0) {
            codepointsLength.toString(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                onDrop(r);
                return;
            } else if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(C.TIME_UNSET);
                this.downstream.onNext(r);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                }
                this.value = null;
            }
        }
    }

    @Override // o.getSidecarVersion
    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, C.TIME_UNSET)) {
                        this.downstream.onNext((R) this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, codepointsLength.toString(j2, j)));
            this.upstream.request(j);
        }
    }

    public void cancel() {
        this.upstream.cancel();
    }
}
