package o;
/* loaded from: classes.dex */
public final class LayoutIncludeDetector {
    private final double ag$a;
    private final String toString;
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutIncludeDetector) {
            LayoutIncludeDetector layoutIncludeDetector = (LayoutIncludeDetector) obj;
            return runAnimators.values(Double.valueOf(this.ag$a), Double.valueOf(layoutIncludeDetector.ag$a)) && runAnimators.values((Object) this.toString, (Object) layoutIncludeDetector.toString) && this.values == layoutIncludeDetector.values;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int doubleToLongBits = Double.doubleToLongBits(this.ag$a);
        String str = this.toString;
        int hashCode = str == null ? 0 : str.hashCode();
        boolean z = this.values;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((doubleToLongBits * 31) + hashCode) * 31) + i;
    }

    public String toString() {
        double d = this.ag$a;
        String str = this.toString;
        boolean z = this.values;
        return "PointsAndBreakupModel(points=" + d + ", pointsBreakup=" + str + ", shouldShowPointsBreakup=" + z + ")";
    }

    public LayoutIncludeDetector(double d, String str, boolean z) {
        this.ag$a = d;
        this.toString = str;
        this.values = z;
    }

    public final boolean ag$a() {
        return this.values;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final double valueOf() {
        return this.ag$a;
    }
}
