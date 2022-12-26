package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getMaxLines implements getViewHorizontalDragRange {
    private final String ag$a;

    public getMaxLines() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getMaxLines) && runAnimators.values((Object) this.ag$a, (Object) ((getMaxLines) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "EmailAddedSuccessClient(_no_value=" + this.ag$a + ')';
    }

    public getMaxLines(String str) {
        runAnimators.ag$a(str, "_no_value");
        this.ag$a = str;
    }

    public /* synthetic */ getMaxLines(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "EmailAddedSuccessClient");
        return hashMap;
    }
}
