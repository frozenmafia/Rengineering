package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class setImageTintMode implements getViewHorizontalDragRange {
    private final String toString;

    public setImageTintMode() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setImageTintMode) && runAnimators.values((Object) this.toString, (Object) ((setImageTintMode) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "BannedAadhaarStateBottomSheetShown(_no_value=" + this.toString + ')';
    }

    public setImageTintMode(String str) {
        runAnimators.ag$a(str, "_no_value");
        this.toString = str;
    }

    public /* synthetic */ setImageTintMode(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "BannedAadhaarStateBottomSheetShown");
        return hashMap;
    }
}
