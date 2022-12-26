package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class canScrollList implements getViewHorizontalDragRange {
    private final notifyRemove ag$a;
    private final addOnMapChangedCallback toString;
    private final removeRange valueOf;
    private final FrameLayoutBindingAdapter values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof canScrollList) {
            canScrollList canscrolllist = (canScrollList) obj;
            return runAnimators.values(this.ag$a, canscrolllist.ag$a) && runAnimators.values(this.toString, canscrolllist.toString) && runAnimators.values(this.valueOf, canscrolllist.valueOf) && runAnimators.values(this.values, canscrolllist.values);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ag$a.hashCode();
        addOnMapChangedCallback addonmapchangedcallback = this.toString;
        int hashCode2 = addonmapchangedcallback == null ? 0 : addonmapchangedcallback.hashCode();
        removeRange removerange = this.valueOf;
        return (((((hashCode * 31) + hashCode2) * 31) + (removerange != null ? removerange.hashCode() : 0)) * 31) + this.values.hashCode();
    }

    public String toString() {
        return "CelebrationPageEventClicked(_couponApplication=" + this.ag$a + ", _couponCode=" + this.toString + ", _couponValidity=" + this.valueOf + ", _promoId=" + this.values + ')';
    }

    public canScrollList(notifyRemove notifyremove, addOnMapChangedCallback addonmapchangedcallback, removeRange removerange, FrameLayoutBindingAdapter frameLayoutBindingAdapter) {
        runAnimators.ag$a(notifyremove, "_couponApplication");
        runAnimators.ag$a(frameLayoutBindingAdapter, "_promoId");
        this.ag$a = notifyremove;
        this.toString = addonmapchangedcallback;
        this.valueOf = removerange;
        this.values = frameLayoutBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "CelebrationPageEventClicked");
        hashMap.put("couponApplication", this.ag$a.ag$a());
        addOnMapChangedCallback addonmapchangedcallback = this.toString;
        if (addonmapchangedcallback != null) {
            hashMap.put("couponCode", addonmapchangedcallback.ag$a());
        }
        removeRange removerange = this.valueOf;
        if (removerange != null) {
            hashMap.put("couponValidity", removerange.values());
        }
        hashMap.put("promoId", Integer.valueOf(this.values.values()));
        return hashMap;
    }
}
