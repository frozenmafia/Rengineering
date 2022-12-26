package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class majorAxisDistanceRaw implements getViewHorizontalDragRange {
    private final CallbackRegistry ag$a;
    private final onItemRangeInserted ah$a;
    private final setOnScroll toString;
    private final lastModified values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof majorAxisDistanceRaw) {
            majorAxisDistanceRaw majoraxisdistanceraw = (majorAxisDistanceRaw) obj;
            return runAnimators.values(this.values, majoraxisdistanceraw.values) && runAnimators.values(this.ag$a, majoraxisdistanceraw.ag$a) && runAnimators.values(this.ah$a, majoraxisdistanceraw.ah$a) && runAnimators.values(this.toString, majoraxisdistanceraw.toString);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.values.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.ah$a.hashCode()) * 31) + this.toString.hashCode();
    }

    public String toString() {
        return "PromoCodeApplyAction(_promoCodeName=" + this.values + ", _amountToAdd=" + this.ag$a + ", _errorMessage=" + this.ah$a + ", _offerID=" + this.toString + ')';
    }

    public majorAxisDistanceRaw(lastModified lastmodified, CallbackRegistry callbackRegistry, onItemRangeInserted onitemrangeinserted, setOnScroll setonscroll) {
        runAnimators.ag$a(lastmodified, "_promoCodeName");
        runAnimators.ag$a(callbackRegistry, "_amountToAdd");
        runAnimators.ag$a(onitemrangeinserted, "_errorMessage");
        runAnimators.ag$a(setonscroll, "_offerID");
        this.values = lastmodified;
        this.ag$a = callbackRegistry;
        this.ah$a = onitemrangeinserted;
        this.toString = setonscroll;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "PromoCodeApplyAction");
        hashMap.put("PromoCodeName", this.values.values());
        hashMap.put("amountToAdd", Integer.valueOf(this.ag$a.valueOf()));
        hashMap.put("errorMessage", this.ah$a.values());
        hashMap.put("offerID", Integer.valueOf(this.toString.ah$a()));
        return hashMap;
    }
}
