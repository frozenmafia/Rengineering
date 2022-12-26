package o;

import java.util.HashMap;
import java.util.Map;
import o.AutoCompleteTextViewBindingAdapter;
/* loaded from: classes4.dex */
public final class notifyHorizontalEdgeReached implements getViewHorizontalDragRange {
    private final AutoCompleteTextViewBindingAdapter.FixText valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof notifyHorizontalEdgeReached) && runAnimators.values(this.valueOf, ((notifyHorizontalEdgeReached) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "DreamPeOrderCreate(_paymentAmount=" + this.valueOf + ')';
    }

    public notifyHorizontalEdgeReached(AutoCompleteTextViewBindingAdapter.FixText fixText) {
        runAnimators.ag$a(fixText, "_paymentAmount");
        this.valueOf = fixText;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "DreamPeOrderCreate");
        hashMap.put("paymentAmount", Double.valueOf(this.valueOf.ag$a()));
        return hashMap;
    }
}
