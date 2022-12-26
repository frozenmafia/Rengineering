package o;
/* loaded from: classes4.dex */
public final class fromSingleUri {
    private final double values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fromSingleUri) && runAnimators.values(Double.valueOf(this.values), Double.valueOf(((fromSingleUri) obj).values));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.values);
    }

    public String toString() {
        return "_Winnings_E_F_Double__(value=" + this.values + ')';
    }

    public fromSingleUri(double d) {
        this.values = d;
    }

    public final double ag$a() {
        return this.values;
    }
}
