package o;
/* loaded from: classes4.dex */
public final class addOnListChangedCallback {
    private final double values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof addOnListChangedCallback) && runAnimators.values(Double.valueOf(this.values), Double.valueOf(((addOnListChangedCallback) obj).values));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.values);
    }

    public String toString() {
        return "_Credit_Balance_Double_(value=" + this.values + ')';
    }

    public addOnListChangedCallback(double d) {
        this.values = d;
    }

    public final double ah$a() {
        return this.values;
    }
}
