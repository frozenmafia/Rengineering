package o;
/* loaded from: classes4.dex */
public final class canRead {
    private final double values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof canRead) && runAnimators.values(Double.valueOf(this.values), Double.valueOf(((canRead) obj).values));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.values);
    }

    public String toString() {
        return "_Withdrawable_Amount_Double_(value=" + this.values + ')';
    }

    public canRead(double d) {
        this.values = d;
    }

    public final double ag$a() {
        return this.values;
    }
}
