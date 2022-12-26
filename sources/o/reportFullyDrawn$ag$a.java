package o;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import o.reportFullyDrawn;
/* loaded from: classes.dex */
public final class reportFullyDrawn$ag$a {
    private reportFullyDrawn$ag$a() {
    }

    public /* synthetic */ reportFullyDrawn$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    public final reportFullyDrawn<?> values(Object obj) {
        runAnimators.valueOf(obj, "value");
        return obj instanceof Map ? new reportFullyDrawn.valueOf((Map) obj) : obj instanceof List ? new reportFullyDrawn.toString((List) obj) : obj instanceof Boolean ? new reportFullyDrawn.values(((Boolean) obj).booleanValue()) : obj instanceof BigDecimal ? new reportFullyDrawn<Number>(runAnimators.valueOf((BigDecimal) obj, "$this$toNumber")) { // from class: o.reportFullyDrawn$HaptikSDK$c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r2, null);
                runAnimators.valueOf(r2, "value");
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof reportFullyDrawn$HaptikSDK$c) && !(runAnimators.values((Number) this.values, (Number) ((reportFullyDrawn$HaptikSDK$c) obj2).values) ^ true);
            }

            public int hashCode() {
                return ((Number) this.values).hashCode();
            }
        } : obj instanceof Number ? new reportFullyDrawn<Number>((Number) obj) { // from class: o.reportFullyDrawn$HaptikSDK$c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r2, null);
                runAnimators.valueOf(r2, "value");
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof reportFullyDrawn$HaptikSDK$c) && !(runAnimators.values((Number) this.values, (Number) ((reportFullyDrawn$HaptikSDK$c) obj2).values) ^ true);
            }

            public int hashCode() {
                return ((Number) this.values).hashCode();
            }
        } : new reportFullyDrawn.invoke(obj.toString());
    }
}
