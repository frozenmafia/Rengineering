package io.reactivex.rxjava3.internal.subscriptions;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.codepointsLength;
import o.getSidecarVersion;
/* loaded from: classes7.dex */
public class SubscriptionArbiter extends AtomicInteger implements getSidecarVersion {
    private static final long serialVersionUID = -2189523197179400958L;
    getSidecarVersion actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<getSidecarVersion> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public SubscriptionArbiter(boolean z) {
        this.cancelOnReplace = z;
    }

    public final void setSubscription(getSidecarVersion getsidecarversion) {
        if (this.cancelled) {
            getsidecarversion.cancel();
            return;
        }
        Objects.requireNonNull(getsidecarversion, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            getSidecarVersion getsidecarversion2 = this.actual;
            if (getsidecarversion2 != null && this.cancelOnReplace) {
                getsidecarversion2.cancel();
            }
            this.actual = getsidecarversion;
            long j = this.requested;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (j != 0) {
                getsidecarversion.request(j);
                return;
            }
            return;
        }
        getSidecarVersion andSet = this.missedSubscription.getAndSet(getsidecarversion);
        if (andSet != null && this.cancelOnReplace) {
            andSet.cancel();
        }
        drain();
    }

    @Override // o.getSidecarVersion
    public final void request(long j) {
        if (!SubscriptionHelper.validate(j) || this.unbounded) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long codepointslength = codepointsLength.toString(j2, j);
                this.requested = codepointslength;
                if (codepointslength == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            getSidecarVersion getsidecarversion = this.actual;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (getsidecarversion != null) {
                getsidecarversion.request(j);
                return;
            }
            return;
        }
        codepointsLength.ag$a(this.missedRequested, j);
        drain();
    }

    public final void produced(long j) {
        if (this.unbounded) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    SubscriptionHelper.reportMoreProduced(j3);
                    j3 = 0;
                }
                this.requested = j3;
            }
            if (decrementAndGet() == 0) {
                return;
            }
            drainLoop();
            return;
        }
        codepointsLength.ag$a(this.missedProduced, j);
        drain();
    }

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        drain();
    }

    final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    final void drainLoop() {
        int i = 1;
        getSidecarVersion getsidecarversion = null;
        long j = 0;
        do {
            getSidecarVersion getsidecarversion2 = this.missedSubscription.get();
            if (getsidecarversion2 != null) {
                getsidecarversion2 = this.missedSubscription.getAndSet(null);
            }
            long j2 = this.missedRequested.get();
            if (j2 != 0) {
                j2 = this.missedRequested.getAndSet(0L);
            }
            long j3 = this.missedProduced.get();
            if (j3 != 0) {
                j3 = this.missedProduced.getAndSet(0L);
            }
            getSidecarVersion getsidecarversion3 = this.actual;
            if (this.cancelled) {
                if (getsidecarversion3 != null) {
                    getsidecarversion3.cancel();
                    this.actual = null;
                }
                if (getsidecarversion2 != null) {
                    getsidecarversion2.cancel();
                }
            } else {
                long j4 = this.requested;
                if (j4 != Long.MAX_VALUE) {
                    j4 = codepointsLength.toString(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            SubscriptionHelper.reportMoreProduced(j4);
                            j4 = 0;
                        }
                    }
                    this.requested = j4;
                }
                if (getsidecarversion2 != null) {
                    if (getsidecarversion3 != null && this.cancelOnReplace) {
                        getsidecarversion3.cancel();
                    }
                    this.actual = getsidecarversion2;
                    if (j4 != 0) {
                        j = codepointsLength.toString(j, j4);
                        getsidecarversion = getsidecarversion2;
                    }
                } else if (getsidecarversion3 != null && j2 != 0) {
                    j = codepointsLength.toString(j, j2);
                    getsidecarversion = getsidecarversion3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            getsidecarversion.request(j);
        }
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }
}
