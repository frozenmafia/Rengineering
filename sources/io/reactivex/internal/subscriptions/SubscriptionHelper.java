package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.getSidecarVersion;
import o.setProgressBackgroundColor;
import o.startAlphaAnimation;
/* loaded from: classes5.dex */
public enum SubscriptionHelper implements getSidecarVersion {
    CANCELLED;

    @Override // o.getSidecarVersion
    public void cancel() {
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
    }

    public static boolean validate(getSidecarVersion getsidecarversion, getSidecarVersion getsidecarversion2) {
        if (getsidecarversion2 == null) {
            setProgressBackgroundColor.values(new NullPointerException("next is null"));
            return false;
        } else if (getsidecarversion != null) {
            getsidecarversion2.cancel();
            reportSubscriptionSet();
            return false;
        } else {
            return true;
        }
    }

    public static void reportSubscriptionSet() {
        setProgressBackgroundColor.values(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean validate(long j) {
        if (j <= 0) {
            setProgressBackgroundColor.values(new IllegalArgumentException("n > 0 required but it was " + j));
            return false;
        }
        return true;
    }

    public static void reportMoreProduced(long j) {
        setProgressBackgroundColor.values(new ProtocolViolationException("More produced than requested: " + j));
    }

    public static boolean set(AtomicReference<getSidecarVersion> atomicReference, getSidecarVersion getsidecarversion) {
        getSidecarVersion getsidecarversion2;
        do {
            getsidecarversion2 = atomicReference.get();
            if (getsidecarversion2 == CANCELLED) {
                if (getsidecarversion != null) {
                    getsidecarversion.cancel();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(getsidecarversion2, getsidecarversion));
        if (getsidecarversion2 != null) {
            getsidecarversion2.cancel();
            return true;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<getSidecarVersion> atomicReference, getSidecarVersion getsidecarversion) {
        Objects.requireNonNull(getsidecarversion, "s is null");
        if (atomicReference.compareAndSet(null, getsidecarversion)) {
            return true;
        }
        getsidecarversion.cancel();
        if (atomicReference.get() != CANCELLED) {
            reportSubscriptionSet();
            return false;
        }
        return false;
    }

    public static boolean replace(AtomicReference<getSidecarVersion> atomicReference, getSidecarVersion getsidecarversion) {
        getSidecarVersion getsidecarversion2;
        do {
            getsidecarversion2 = atomicReference.get();
            if (getsidecarversion2 == CANCELLED) {
                if (getsidecarversion != null) {
                    getsidecarversion.cancel();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(getsidecarversion2, getsidecarversion));
        return true;
    }

    public static boolean cancel(AtomicReference<getSidecarVersion> atomicReference) {
        getSidecarVersion andSet;
        getSidecarVersion getsidecarversion = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (getsidecarversion == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet != null) {
            andSet.cancel();
            return true;
        }
        return true;
    }

    public static boolean deferredSetOnce(AtomicReference<getSidecarVersion> atomicReference, AtomicLong atomicLong, getSidecarVersion getsidecarversion) {
        if (setOnce(atomicReference, getsidecarversion)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                getsidecarversion.request(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static void deferredRequest(AtomicReference<getSidecarVersion> atomicReference, AtomicLong atomicLong, long j) {
        getSidecarVersion getsidecarversion = atomicReference.get();
        if (getsidecarversion != null) {
            getsidecarversion.request(j);
        } else if (validate(j)) {
            startAlphaAnimation.ag$a(atomicLong, j);
            getSidecarVersion getsidecarversion2 = atomicReference.get();
            if (getsidecarversion2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    getsidecarversion2.request(andSet);
                }
            }
        }
    }

    public static boolean setOnce(AtomicReference<getSidecarVersion> atomicReference, getSidecarVersion getsidecarversion, long j) {
        if (setOnce(atomicReference, getsidecarversion)) {
            getsidecarversion.request(j);
            return true;
        }
        return false;
    }
}
