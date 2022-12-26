package o;

import java.util.HashMap;
import java.util.Map;
import o.ViewDataBinding;
/* loaded from: classes4.dex */
public final class setDragState implements getViewHorizontalDragRange {
    private final ViewDataBinding.AnonymousClass3 ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setDragState) && runAnimators.values(this.ag$a, ((setDragState) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "SideNavDataLoaded(_loyaltyLevel=" + this.ag$a + ')';
    }

    public setDragState(ViewDataBinding.AnonymousClass3 anonymousClass3) {
        runAnimators.ag$a(anonymousClass3, "_loyaltyLevel");
        this.ag$a = anonymousClass3;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "SideNavDataLoaded");
        hashMap.put("loyaltyLevel", Integer.valueOf(this.ag$a.valueOf()));
        return hashMap;
    }
}
