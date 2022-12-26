package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReferenceArray;
import o.FrameworkSQLiteDatabase;
import o.getSidecarVersion;
/* loaded from: classes7.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<getSidecarVersion> implements FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i) {
        super(i);
    }

    public boolean setResource(int i, getSidecarVersion getsidecarversion) {
        getSidecarVersion getsidecarversion2;
        do {
            getsidecarversion2 = get(i);
            if (getsidecarversion2 == SubscriptionHelper.CANCELLED) {
                if (getsidecarversion != null) {
                    getsidecarversion.cancel();
                    return false;
                }
                return false;
            }
        } while (!compareAndSet(i, getsidecarversion2, getsidecarversion));
        if (getsidecarversion2 != null) {
            getsidecarversion2.cancel();
            return true;
        }
        return true;
    }

    public getSidecarVersion replaceResource(int i, getSidecarVersion getsidecarversion) {
        getSidecarVersion getsidecarversion2;
        do {
            getsidecarversion2 = get(i);
            if (getsidecarversion2 == SubscriptionHelper.CANCELLED) {
                if (getsidecarversion != null) {
                    getsidecarversion.cancel();
                    return null;
                }
                return null;
            }
        } while (!compareAndSet(i, getsidecarversion2, getsidecarversion));
        return getsidecarversion2;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        getSidecarVersion andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (get(i) != SubscriptionHelper.CANCELLED && (andSet = getAndSet(i, SubscriptionHelper.CANCELLED)) != SubscriptionHelper.CANCELLED && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }
}
