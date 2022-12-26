package o;
/* loaded from: classes4.dex */
public final class removeRange {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof removeRange) && runAnimators.values((Object) this.valueOf, (Object) ((removeRange) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Coupon_Validity_String_(value=" + this.valueOf + ')';
    }

    public removeRange(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String values() {
        return this.valueOf;
    }
}
