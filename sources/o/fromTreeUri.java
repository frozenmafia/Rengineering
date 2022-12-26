package o;
/* loaded from: classes6.dex */
public final class fromTreeUri {
    private final double valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fromTreeUri) && runAnimators.values(Double.valueOf(this.valueOf), Double.valueOf(((fromTreeUri) obj).valueOf));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.valueOf);
    }

    public String toString() {
        return "_Withdraw_Amount_Double_(value=" + this.valueOf + ')';
    }

    public fromTreeUri(double d) {
        this.valueOf = d;
    }

    public final double ag$a() {
        return this.valueOf;
    }
}
