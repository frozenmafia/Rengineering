package o;

import java.util.HashMap;
import java.util.Map;
import o.SeekBarBindingAdapter;
/* loaded from: classes4.dex */
public final class setViewBinder implements getViewHorizontalDragRange {
    private final SeekBarBindingAdapter.OnProgressChanged toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setViewBinder) && runAnimators.values(this.toString, ((setViewBinder) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "LocationPermissionGranted(_selection=" + this.toString + ')';
    }

    public setViewBinder(SeekBarBindingAdapter.OnProgressChanged onProgressChanged) {
        runAnimators.ag$a(onProgressChanged, "_selection");
        this.toString = onProgressChanged;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "LocationPermissionGranted");
        hashMap.put("selection", this.toString.ag$a());
        return hashMap;
    }
}
