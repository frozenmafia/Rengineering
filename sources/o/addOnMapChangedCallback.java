package o;
/* loaded from: classes4.dex */
public final class addOnMapChangedCallback {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof addOnMapChangedCallback) && runAnimators.values((Object) this.values, (Object) ((addOnMapChangedCallback) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Coupon_Code_String_(value=" + this.values + ')';
    }

    public addOnMapChangedCallback(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ag$a() {
        return this.values;
    }
}
