package o;
/* loaded from: classes4.dex */
public final class access$getListener$p {
    private final double ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof access$getListener$p) && runAnimators.values(Double.valueOf(this.ag$a), Double.valueOf(((access$getListener$p) obj).ag$a));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.ag$a);
    }

    public String toString() {
        return "_New_Prefilled_Amt_Double__(value=" + this.ag$a + ')';
    }

    public access$getListener$p(double d) {
        this.ag$a = d;
    }

    public final double ag$a() {
        return this.ag$a;
    }
}
