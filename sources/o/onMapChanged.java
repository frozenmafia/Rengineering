package o;
/* loaded from: classes4.dex */
public final class onMapChanged {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onMapChanged) && runAnimators.values((Object) this.values, (Object) ((onMapChanged) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Errormessage_String(value=" + this.values + ')';
    }

    public onMapChanged(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ah$a() {
        return this.values;
    }
}
