package o;
/* loaded from: classes4.dex */
public final class setAnimateLayoutChanges {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setAnimateLayoutChanges) && runAnimators.values((Object) this.toString, (Object) ((setAnimateLayoutChanges) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Verificationflow_String(value=" + this.toString + ')';
    }

    public setAnimateLayoutChanges(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String ag$a() {
        return this.toString;
    }
}
