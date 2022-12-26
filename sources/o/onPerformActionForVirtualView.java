package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class onPerformActionForVirtualView implements getViewHorizontalDragRange {
    private final setHour values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onPerformActionForVirtualView) && runAnimators.values(this.values, ((onPerformActionForVirtualView) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "NotificationCenterLoaded(_unread_notifications=" + this.values + ')';
    }

    public onPerformActionForVirtualView(setHour sethour) {
        runAnimators.ag$a(sethour, "_unread_notifications");
        this.values = sethour;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "NotificationCenterLoaded");
        hashMap.put("unread_notifications", this.values.ag$a());
        return hashMap;
    }
}
