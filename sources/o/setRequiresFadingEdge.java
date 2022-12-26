package o;
/* loaded from: classes4.dex */
public final class setRequiresFadingEdge {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setRequiresFadingEdge) && runAnimators.values((Object) this.values, (Object) ((setRequiresFadingEdge) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Utm_redirection_String(value=" + this.values + ')';
    }

    public setRequiresFadingEdge(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ah$a() {
        return this.values;
    }
}
