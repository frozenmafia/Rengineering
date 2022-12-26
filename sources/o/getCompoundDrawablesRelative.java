package o;

import java.util.HashMap;
import java.util.Map;
import o.SeekBarBindingAdapter;
/* loaded from: classes4.dex */
public final class getCompoundDrawablesRelative implements getViewHorizontalDragRange {
    private final SeekBarBindingAdapter.OnProgressChanged valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getCompoundDrawablesRelative) && runAnimators.values(this.valueOf, ((getCompoundDrawablesRelative) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "EnterNamePageInteracted(_selection=" + this.valueOf + ')';
    }

    public getCompoundDrawablesRelative(SeekBarBindingAdapter.OnProgressChanged onProgressChanged) {
        runAnimators.ag$a(onProgressChanged, "_selection");
        this.valueOf = onProgressChanged;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "EnterNamePageInteracted");
        hashMap.put("selection", this.valueOf.ag$a());
        return hashMap;
    }
}
