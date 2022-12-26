package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class PopupMenuCompat implements getViewHorizontalDragRange {
    private final addOnMapChangedCallback ag$a;
    private final setRequiresFadingEdge toString;

    public PopupMenuCompat() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PopupMenuCompat) {
            PopupMenuCompat popupMenuCompat = (PopupMenuCompat) obj;
            return runAnimators.values(this.ag$a, popupMenuCompat.ag$a) && runAnimators.values(this.toString, popupMenuCompat.toString);
        }
        return false;
    }

    public int hashCode() {
        addOnMapChangedCallback addonmapchangedcallback = this.ag$a;
        int hashCode = addonmapchangedcallback == null ? 0 : addonmapchangedcallback.hashCode();
        setRequiresFadingEdge setrequiresfadingedge = this.toString;
        return (hashCode * 31) + (setrequiresfadingedge != null ? setrequiresfadingedge.hashCode() : 0);
    }

    public String toString() {
        return "CouponCodeManualInteraction(_couponCode=" + this.ag$a + ", _utm_redirection=" + this.toString + ')';
    }

    public PopupMenuCompat(addOnMapChangedCallback addonmapchangedcallback, setRequiresFadingEdge setrequiresfadingedge) {
        this.ag$a = addonmapchangedcallback;
        this.toString = setrequiresfadingedge;
    }

    public /* synthetic */ PopupMenuCompat(addOnMapChangedCallback addonmapchangedcallback, setRequiresFadingEdge setrequiresfadingedge, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : addonmapchangedcallback, (i & 2) != 0 ? null : setrequiresfadingedge);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "CouponCodeManualInteraction");
        addOnMapChangedCallback addonmapchangedcallback = this.ag$a;
        if (addonmapchangedcallback != null) {
            hashMap.put("couponCode", addonmapchangedcallback.ag$a());
        }
        setRequiresFadingEdge setrequiresfadingedge = this.toString;
        if (setrequiresfadingedge != null) {
            hashMap.put("utm_redirection", setrequiresfadingedge.ah$a());
        }
        return hashMap;
    }
}
