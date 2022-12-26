package o;
/* loaded from: classes4.dex */
public final class BR {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BR) && runAnimators.values((Object) this.values, (Object) ((BR) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Visit_utm_source_String(value=" + this.values + ')';
    }

    public BR(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String values() {
        return this.values;
    }
}
