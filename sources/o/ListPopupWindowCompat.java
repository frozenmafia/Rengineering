package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class ListPopupWindowCompat implements getViewHorizontalDragRange {
    private final setDigits valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListPopupWindowCompat) && runAnimators.values(this.valueOf, ((ListPopupWindowCompat) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "BayonetSubscriptionError(_subscriptionTopic=" + this.valueOf + ')';
    }

    public ListPopupWindowCompat(setDigits setdigits) {
        runAnimators.ag$a(setdigits, "_subscriptionTopic");
        this.valueOf = setdigits;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "BayonetSubscriptionError");
        hashMap.put("subscriptionTopic", this.valueOf.valueOf());
        return hashMap;
    }
}
