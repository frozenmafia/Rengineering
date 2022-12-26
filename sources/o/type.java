package o;
/* loaded from: classes4.dex */
public final class type {
    private final double values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof type) && runAnimators.values(Double.valueOf(this.values), Double.valueOf(((type) obj).values));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.values);
    }

    public String toString() {
        return "_Amount_Entered_Double_(value=" + this.values + ')';
    }

    public type(double d) {
        this.values = d;
    }

    public final double ag$a() {
        return this.values;
    }
}
