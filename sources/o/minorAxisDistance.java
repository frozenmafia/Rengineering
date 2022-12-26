package o;

import java.util.HashMap;
import java.util.Map;
import o.TextViewBindingAdapter;
/* loaded from: classes6.dex */
public final class minorAxisDistance implements getViewHorizontalDragRange {
    private final TextViewBindingAdapter.AfterTextChanged ah$a;
    private final haveContentsChanged toString;
    private final onItemRangeInserted values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof minorAxisDistance) {
            minorAxisDistance minoraxisdistance = (minorAxisDistance) obj;
            return runAnimators.values(this.values, minoraxisdistance.values) && runAnimators.values(this.toString, minoraxisdistance.toString) && runAnimators.values(this.ah$a, minoraxisdistance.ah$a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.values.hashCode();
        haveContentsChanged havecontentschanged = this.toString;
        return (((hashCode * 31) + (havecontentschanged == null ? 0 : havecontentschanged.hashCode())) * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        return "ProfilePictureRemoveClient(_errorMessage=" + this.values + ", _status=" + this.toString + ", _type=" + this.ah$a + ')';
    }

    public minorAxisDistance(onItemRangeInserted onitemrangeinserted, haveContentsChanged havecontentschanged, TextViewBindingAdapter.AfterTextChanged afterTextChanged) {
        runAnimators.ag$a(onitemrangeinserted, "_errorMessage");
        runAnimators.ag$a(afterTextChanged, "_type");
        this.values = onitemrangeinserted;
        this.toString = havecontentschanged;
        this.ah$a = afterTextChanged;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ProfilePictureRemoveClient");
        hashMap.put("errorMessage", this.values.values());
        haveContentsChanged havecontentschanged = this.toString;
        if (havecontentschanged != null) {
            hashMap.put("status", havecontentschanged.ag$a());
        }
        hashMap.put("type", this.ah$a.values());
        return hashMap;
    }
}
