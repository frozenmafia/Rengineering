package o;
/* loaded from: classes4.dex */
public final class notifyAdd {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof notifyAdd) && runAnimators.values((Object) this.values, (Object) ((notifyAdd) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Country_Name_String_(value=" + this.values + ')';
    }

    public notifyAdd(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String valueOf() {
        return this.values;
    }
}
