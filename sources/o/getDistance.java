package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getDistance implements getViewHorizontalDragRange {
    private final onItemRangeInserted valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getDistance) && runAnimators.values(this.valueOf, ((getDistance) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "AddEmailError(_errorMessage=" + this.valueOf + ')';
    }

    public getDistance(onItemRangeInserted onitemrangeinserted) {
        runAnimators.ag$a(onitemrangeinserted, "_errorMessage");
        this.valueOf = onitemrangeinserted;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "AddEmailError");
        hashMap.put("errorMessage", this.valueOf.values());
        return hashMap;
    }
}
