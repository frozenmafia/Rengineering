package o;
/* renamed from: o.fixed  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0370fixed {
    private final int ag$a;
    private final int ah$a;
    private final double invoke;
    private final ratio toString;
    private final int valueOf;
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0370fixed) {
            C0370fixed c0370fixed = (C0370fixed) obj;
            return this.values == c0370fixed.values && this.ag$a == c0370fixed.ag$a && this.valueOf == c0370fixed.valueOf && this.ah$a == c0370fixed.ah$a && runAnimators.values(Double.valueOf(this.invoke), Double.valueOf(c0370fixed.invoke)) && runAnimators.values(this.toString, c0370fixed.toString);
        }
        return false;
    }

    public int hashCode() {
        int i = this.values;
        int i2 = this.ag$a;
        int i3 = this.valueOf;
        int i4 = this.ah$a;
        int doubleToLongBits = Double.doubleToLongBits(this.invoke);
        ratio ratioVar = this.toString;
        return (((((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31) + doubleToLongBits) * 31) + (ratioVar == null ? 0 : ratioVar.hashCode());
    }

    public String toString() {
        int i = this.values;
        int i2 = this.ag$a;
        int i3 = this.valueOf;
        int i4 = this.ah$a;
        double d = this.invoke;
        ratio ratioVar = this.toString;
        return "CareerStatsBreakup(sports=" + i + ", series=" + i2 + ", matches=" + i3 + ", contests=" + i4 + ", winPercentage=" + d + ", contestsBreakup=" + ratioVar + ")";
    }

    public C0370fixed(int i, int i2, int i3, int i4, double d, ratio ratioVar) {
        this.values = i;
        this.ag$a = i2;
        this.valueOf = i3;
        this.ah$a = i4;
        this.invoke = d;
        this.toString = ratioVar;
    }

    public final int ag$a() {
        return this.ah$a;
    }

    public final int ah$a() {
        return this.ag$a;
    }

    public final int values() {
        return this.valueOf;
    }

    public final double HaptikSDK$b() {
        return this.invoke;
    }

    public final ratio valueOf() {
        return this.toString;
    }
}
