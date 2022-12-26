package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class onPropertyChanged implements getViewHorizontalDragRange {
    private final onItemRangeInserted ag$a;
    private final canRead valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onPropertyChanged) {
            onPropertyChanged onpropertychanged = (onPropertyChanged) obj;
            return runAnimators.values(this.ag$a, onpropertychanged.ag$a) && runAnimators.values(this.valueOf, onpropertychanged.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (this.ag$a.hashCode() * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        return "WithdrawalPageLoadFailed(_errorMessage=" + this.ag$a + ", _withdrawableAmount=" + this.valueOf + ')';
    }

    public onPropertyChanged(onItemRangeInserted onitemrangeinserted, canRead canread) {
        runAnimators.ag$a(onitemrangeinserted, "_errorMessage");
        runAnimators.ag$a(canread, "_withdrawableAmount");
        this.ag$a = onitemrangeinserted;
        this.valueOf = canread;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "WithdrawalPageLoadFailed");
        hashMap.put("errorMessage", this.ag$a.values());
        hashMap.put("withdrawableAmount", Double.valueOf(this.valueOf.ag$a()));
        return hashMap;
    }
}
