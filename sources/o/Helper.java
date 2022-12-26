package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class Helper {
    private final double ag$a;
    private final List<Integer> ah$a;
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Helper) {
            Helper helper = (Helper) obj;
            return runAnimators.values(Double.valueOf(this.ag$a), Double.valueOf(helper.ag$a)) && runAnimators.values(this.ah$a, helper.ah$a) && this.toString == helper.toString;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int doubleToLongBits = Double.doubleToLongBits(this.ag$a);
        int hashCode = this.ah$a.hashCode();
        boolean z = this.toString;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((doubleToLongBits * 31) + hashCode) * 31) + i;
    }

    public String toString() {
        double d = this.ag$a;
        List<Integer> list = this.ah$a;
        boolean z = this.toString;
        return "AmountSelectionConfig(prefilledAmount=" + d + ", suggestedAmounts=" + list + ", isDefaultLayout=" + z + ")";
    }

    public Helper(double d, List<Integer> list, boolean z) {
        runAnimators.ag$a(list, "suggestedAmounts");
        this.ag$a = d;
        this.ah$a = list;
        this.toString = z;
    }

    public final double ag$a() {
        return this.ag$a;
    }

    public final List<Integer> values() {
        return this.ah$a;
    }

    public final boolean valueOf() {
        return this.toString;
    }
}
