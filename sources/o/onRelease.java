package o;

import java.util.HashMap;
import java.util.Map;
import o.SeekBarBindingAdapter;
/* loaded from: classes4.dex */
public final class onRelease implements getViewHorizontalDragRange {
    private final SeekBarBindingAdapter.OnProgressChanged ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onRelease) && runAnimators.values(this.ah$a, ((onRelease) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "BannedAadhaarStateBottomSheetInteracted(_selection=" + this.ah$a + ')';
    }

    public onRelease(SeekBarBindingAdapter.OnProgressChanged onProgressChanged) {
        runAnimators.ag$a(onProgressChanged, "_selection");
        this.ah$a = onProgressChanged;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "BannedAadhaarStateBottomSheetInteracted");
        hashMap.put("selection", this.ah$a.ag$a());
        return hashMap;
    }
}
