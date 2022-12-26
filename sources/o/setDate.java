package o;
/* loaded from: classes4.dex */
public final class setDate {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setDate) && runAnimators.values((Object) this.values, (Object) ((setDate) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Payment_Sub_Type_String__(value=" + this.values + ')';
    }

    public setDate(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ah$a() {
        return this.values;
    }
}
