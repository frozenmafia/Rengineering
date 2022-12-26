package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class onSizeChanged implements getViewHorizontalDragRange {
    private final setDrawableEnd values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onSizeChanged) && runAnimators.values(this.values, ((onSizeChanged) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "ContestShareTabSwitched(_tabSelected=" + this.values + ')';
    }

    public onSizeChanged(setDrawableEnd setdrawableend) {
        runAnimators.ag$a(setdrawableend, "_tabSelected");
        this.values = setdrawableend;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ContestShareTabSwitched");
        hashMap.put("tabSelected", this.values.ag$a());
        return hashMap;
    }
}
