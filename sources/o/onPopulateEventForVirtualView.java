package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class onPopulateEventForVirtualView implements getViewHorizontalDragRange {
    private final WeakListener ag$a;
    private final getMinute valueOf;
    private final AbsListViewBindingAdapter values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onPopulateEventForVirtualView) {
            onPopulateEventForVirtualView onpopulateeventforvirtualview = (onPopulateEventForVirtualView) obj;
            return runAnimators.values(this.ag$a, onpopulateeventforvirtualview.ag$a) && runAnimators.values(this.values, onpopulateeventforvirtualview.values) && runAnimators.values(this.valueOf, onpopulateeventforvirtualview.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (((this.ag$a.hashCode() * 31) + this.values.hashCode()) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        return "NotificationClicked(_notification_type=" + this.ag$a + ", _notificationdeeplink=" + this.values + ", _unread_notifications=" + this.valueOf + ')';
    }

    public onPopulateEventForVirtualView(WeakListener weakListener, AbsListViewBindingAdapter absListViewBindingAdapter, getMinute getminute) {
        runAnimators.ag$a(weakListener, "_notification_type");
        runAnimators.ag$a(absListViewBindingAdapter, "_notificationdeeplink");
        runAnimators.ag$a(getminute, "_unread_notifications");
        this.ag$a = weakListener;
        this.values = absListViewBindingAdapter;
        this.valueOf = getminute;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "NotificationClicked");
        hashMap.put("notification_type", this.ag$a.ag$a());
        hashMap.put("notificationdeeplink", this.values.ag$a());
        hashMap.put("unread_notifications", Boolean.valueOf(this.valueOf.ag$a()));
        return hashMap;
    }
}
