package o;
/* loaded from: classes4.dex */
public final class requireAll {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof requireAll) && runAnimators.values((Object) this.values, (Object) ((requireAll) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Action_String(value=" + this.values + ')';
    }

    public requireAll(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String valueOf() {
        return this.values;
    }
}
