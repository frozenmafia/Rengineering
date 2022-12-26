package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getMinLines implements getViewHorizontalDragRange {
    private final String values;

    public getMinLines() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getMinLines) && runAnimators.values((Object) this.values, (Object) ((getMinLines) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "EnterNamePageLoaded(_no_value=" + this.values + ')';
    }

    public getMinLines(String str) {
        runAnimators.ag$a(str, "_no_value");
        this.values = str;
    }

    public /* synthetic */ getMinLines(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "EnterNamePageLoaded");
        return hashMap;
    }
}
