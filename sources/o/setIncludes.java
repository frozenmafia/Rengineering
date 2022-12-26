package o;
/* loaded from: classes4.dex */
public final class setIncludes {
    private final double ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setIncludes) && runAnimators.values(Double.valueOf(this.ah$a), Double.valueOf(((setIncludes) obj).ah$a));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.ah$a);
    }

    public String toString() {
        return "_Min_Amount_Double_(value=" + this.ah$a + ')';
    }

    public setIncludes(double d) {
        this.ah$a = d;
    }

    public final double values() {
        return this.ah$a;
    }
}
