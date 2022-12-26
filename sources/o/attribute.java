package o;
/* loaded from: classes4.dex */
public final class attribute {
    private final double ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof attribute) && runAnimators.values(Double.valueOf(this.ag$a), Double.valueOf(((attribute) obj).ag$a));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.ag$a);
    }

    public String toString() {
        return "_Add_Cash_Amount_Double__(value=" + this.ag$a + ')';
    }

    public attribute(double d) {
        this.ag$a = d;
    }

    public final double values() {
        return this.ag$a;
    }
}
