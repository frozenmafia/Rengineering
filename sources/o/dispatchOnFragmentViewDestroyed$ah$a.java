package o;

import java.util.UUID;
/* loaded from: classes4.dex */
public final class dispatchOnFragmentViewDestroyed$ah$a {
    public /* synthetic */ dispatchOnFragmentViewDestroyed$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private dispatchOnFragmentViewDestroyed$ah$a() {
    }

    public static final /* synthetic */ boolean values(dispatchOnFragmentViewDestroyed$ah$a dispatchonfragmentviewdestroyed_ah_a, dispatchOnFragmentViewDestroyed dispatchonfragmentviewdestroyed) {
        return dispatchonfragmentviewdestroyed_ah_a.valueOf(dispatchonfragmentviewdestroyed);
    }

    public final dispatchOnFragmentViewDestroyed ah$a() {
        return dispatchOnFragmentViewDestroyed.ag$a();
    }

    public final dispatchOnFragmentViewDestroyed ah$a(UUID uuid, int i) {
        synchronized (this) {
            runAnimators.ag$a(uuid, "callId");
            dispatchOnFragmentViewDestroyed ah$a = ah$a();
            if (ah$a != null && runAnimators.values(ah$a.values(), uuid) && ah$a.valueOf() == i) {
                valueOf(null);
                return ah$a;
            }
            return null;
        }
    }

    public final boolean valueOf(dispatchOnFragmentViewDestroyed dispatchonfragmentviewdestroyed) {
        boolean z;
        synchronized (this) {
            dispatchOnFragmentViewDestroyed ah$a = ah$a();
            dispatchOnFragmentViewDestroyed.ag$a(dispatchonfragmentviewdestroyed);
            z = ah$a != null;
        }
        return z;
    }
}
