package o;
/* loaded from: classes4.dex */
public final class convertColorToDrawable {
    private final double ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof convertColorToDrawable) && runAnimators.values(Double.valueOf(this.ag$a), Double.valueOf(((convertColorToDrawable) obj).ag$a));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.ag$a);
    }

    public String toString() {
        return "_Prize_Amount_Double_(value=" + this.ag$a + ')';
    }

    public convertColorToDrawable(double d) {
        this.ag$a = d;
    }

    public final double valueOf() {
        return this.ag$a;
    }
}
