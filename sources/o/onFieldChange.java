package o;
/* loaded from: classes4.dex */
public final class onFieldChange {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onFieldChange) && runAnimators.values((Object) this.values, (Object) ((onFieldChange) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Issuer_Bank_String_(value=" + this.values + ')';
    }

    public onFieldChange(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String values() {
        return this.values;
    }
}
