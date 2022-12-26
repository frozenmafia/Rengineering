package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class getVirtualViewAt implements getViewHorizontalDragRange {
    private final String toString;

    public getVirtualViewAt() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getVirtualViewAt) && runAnimators.values((Object) this.toString, (Object) ((getVirtualViewAt) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "MyMatchesViewAllClicked(_no_value=" + this.toString + ')';
    }

    public getVirtualViewAt(String str) {
        runAnimators.ag$a(str, "_no_value");
        this.toString = str;
    }

    public /* synthetic */ getVirtualViewAt(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MyMatchesViewAllClicked");
        return hashMap;
    }
}
