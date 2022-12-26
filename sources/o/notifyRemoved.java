package o;
/* loaded from: classes4.dex */
public final class notifyRemoved {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof notifyRemoved) && runAnimators.values((Object) this.toString, (Object) ((notifyRemoved) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Contest_Page_String_(value=" + this.toString + ')';
    }

    public notifyRemoved(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String valueOf() {
        return this.toString;
    }
}
