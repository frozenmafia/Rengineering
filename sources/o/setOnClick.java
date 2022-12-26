package o;
/* loaded from: classes4.dex */
public final class setOnClick {
    private final double valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setOnClick) && runAnimators.values(Double.valueOf(this.valueOf), Double.valueOf(((setOnClick) obj).valueOf));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.valueOf);
    }

    public String toString() {
        return "_Usable_Cash_Bonus_Double__(value=" + this.valueOf + ')';
    }

    public setOnClick(double d) {
        this.valueOf = d;
    }

    public final double values() {
        return this.valueOf;
    }
}
