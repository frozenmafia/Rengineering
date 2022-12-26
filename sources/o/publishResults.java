package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class publishResults implements getViewHorizontalDragRange {
    private final onItemRangeInserted ah$a;
    private final type toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof publishResults) {
            publishResults publishresults = (publishResults) obj;
            return runAnimators.values(this.toString, publishresults.toString) && runAnimators.values(this.ah$a, publishresults.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.toString.hashCode() * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        return "InvalidAmountEntered(_amountEntered=" + this.toString + ", _errorMessage=" + this.ah$a + ')';
    }

    public publishResults(type typeVar, onItemRangeInserted onitemrangeinserted) {
        runAnimators.ag$a(typeVar, "_amountEntered");
        runAnimators.ag$a(onitemrangeinserted, "_errorMessage");
        this.toString = typeVar;
        this.ah$a = onitemrangeinserted;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "InvalidAmountEntered");
        hashMap.put("amountEntered", Double.valueOf(this.toString.ag$a()));
        hashMap.put("errorMessage", this.ah$a.values());
        return hashMap;
    }
}
