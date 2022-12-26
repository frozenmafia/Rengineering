package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class TextViewKt implements getViewHorizontalDragRange {
    private final onItemRangeInserted ag$a;

    public TextViewKt() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextViewKt) && runAnimators.values(this.ag$a, ((TextViewKt) obj).ag$a);
    }

    public int hashCode() {
        onItemRangeInserted onitemrangeinserted = this.ag$a;
        if (onitemrangeinserted == null) {
            return 0;
        }
        return onitemrangeinserted.hashCode();
    }

    public String toString() {
        return "FomoApiError(_errorMessage=" + this.ag$a + ')';
    }

    public TextViewKt(onItemRangeInserted onitemrangeinserted) {
        this.ag$a = onitemrangeinserted;
    }

    public /* synthetic */ TextViewKt(onItemRangeInserted onitemrangeinserted, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : onitemrangeinserted);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "FomoApiError");
        onItemRangeInserted onitemrangeinserted = this.ag$a;
        if (onitemrangeinserted != null) {
            hashMap.put("errorMessage", onitemrangeinserted.values());
        }
        return hashMap;
    }
}
