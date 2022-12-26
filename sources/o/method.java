package o;
/* loaded from: classes4.dex */
public final class method {
    private final double valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof method) && runAnimators.values(Double.valueOf(this.valueOf), Double.valueOf(((method) obj).valueOf));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.valueOf);
    }

    public String toString() {
        return "_Amount_Double(value=" + this.valueOf + ')';
    }

    public method(double d) {
        this.valueOf = d;
    }

    public final double ah$a() {
        return this.valueOf;
    }
}
