package o;
/* loaded from: classes4.dex */
public final class notifyFirst64 {
    private final double values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof notifyFirst64) && runAnimators.values(Double.valueOf(this.values), Double.valueOf(((notifyFirst64) obj).values));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.values);
    }

    public String toString() {
        return "_Amount_To_Add_Double__(value=" + this.values + ')';
    }

    public notifyFirst64(double d) {
        this.values = d;
    }

    public final double valueOf() {
        return this.values;
    }
}
