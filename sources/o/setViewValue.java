package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class setViewValue implements getViewHorizontalDragRange {
    private final String values;

    public setViewValue() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setViewValue) && runAnimators.values((Object) this.values, (Object) ((setViewValue) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "LocationPermissionRequested(_no_value=" + this.values + ')';
    }

    public setViewValue(String str) {
        runAnimators.ag$a(str, "_no_value");
        this.values = str;
    }

    public /* synthetic */ setViewValue(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "LocationPermissionRequested");
        return hashMap;
    }
}
