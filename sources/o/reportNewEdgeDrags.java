package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class reportNewEdgeDrags implements getViewHorizontalDragRange {
    private final setValidator ag$a;
    private final AutoCompleteTextViewBindingAdapter ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof reportNewEdgeDrags) {
            reportNewEdgeDrags reportnewedgedrags = (reportNewEdgeDrags) obj;
            return runAnimators.values(this.ag$a, reportnewedgedrags.ag$a) && runAnimators.values(this.ah$a, reportnewedgedrags.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.ag$a.hashCode() * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        return "ReportProfileInitiated(_other_user_id=" + this.ag$a + ", _other_user_type=" + this.ah$a + ')';
    }

    public reportNewEdgeDrags(setValidator setvalidator, AutoCompleteTextViewBindingAdapter autoCompleteTextViewBindingAdapter) {
        runAnimators.ag$a(setvalidator, "_other_user_id");
        runAnimators.ag$a(autoCompleteTextViewBindingAdapter, "_other_user_type");
        this.ag$a = setvalidator;
        this.ah$a = autoCompleteTextViewBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ReportProfileInitiated");
        hashMap.put("other_user_id", Long.valueOf(this.ag$a.valueOf()));
        hashMap.put("other_user_type", this.ah$a.values());
        return hashMap;
    }
}
