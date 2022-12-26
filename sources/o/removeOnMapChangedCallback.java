package o;
/* loaded from: classes4.dex */
public final class removeOnMapChangedCallback {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof removeOnMapChangedCallback) && runAnimators.values((Object) this.toString, (Object) ((removeOnMapChangedCallback) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Current_Value_String_(value=" + this.toString + ')';
    }

    public removeOnMapChangedCallback(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String ag$a() {
        return this.toString;
    }
}
