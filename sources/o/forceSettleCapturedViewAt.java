package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class forceSettleCapturedViewAt implements getViewHorizontalDragRange {
    private final setCheckedButton values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof forceSettleCapturedViewAt) && runAnimators.values(this.values, ((forceSettleCapturedViewAt) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "RequestCount(_request_count=" + this.values + ')';
    }

    public forceSettleCapturedViewAt(setCheckedButton setcheckedbutton) {
        runAnimators.ag$a(setcheckedbutton, "_request_count");
        this.values = setcheckedbutton;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "RequestCount");
        hashMap.put("request_count", Integer.valueOf(this.values.valueOf()));
        return hashMap;
    }
}
