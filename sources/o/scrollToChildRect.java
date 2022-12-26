package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class scrollToChildRect implements getViewHorizontalDragRange {
    private final String values;

    public scrollToChildRect() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof scrollToChildRect) && runAnimators.values((Object) this.values, (Object) ((scrollToChildRect) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "ConfirmEmailTapped(_no_value=" + this.values + ')';
    }

    public scrollToChildRect(String str) {
        runAnimators.ag$a(str, "_no_value");
        this.values = str;
    }

    public /* synthetic */ scrollToChildRect(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ConfirmEmailTapped");
        return hashMap;
    }
}
