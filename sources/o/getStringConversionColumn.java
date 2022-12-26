package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getStringConversionColumn implements getViewHorizontalDragRange {
    private final ProgressBarBindingAdapter ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getStringConversionColumn) && runAnimators.values(this.ah$a, ((getStringConversionColumn) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "LocalisationCoreLogicExecuted(_result=" + this.ah$a + ')';
    }

    public getStringConversionColumn(ProgressBarBindingAdapter progressBarBindingAdapter) {
        runAnimators.ag$a(progressBarBindingAdapter, "_result");
        this.ah$a = progressBarBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "LocalisationCoreLogicExecuted");
        hashMap.put(com.dreampay.commons.constants.Constants.RESULT, this.ah$a.ah$a());
        return hashMap;
    }
}
