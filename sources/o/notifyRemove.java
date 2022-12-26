package o;
/* loaded from: classes4.dex */
public final class notifyRemove {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof notifyRemove) && runAnimators.values((Object) this.toString, (Object) ((notifyRemove) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Coupon_Application_String_(value=" + this.toString + ')';
    }

    public notifyRemove(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String ag$a() {
        return this.toString;
    }
}
