package o;
/* loaded from: classes4.dex */
public final class loadFeatures {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof loadFeatures) && runAnimators.values((Object) this.values, (Object) ((loadFeatures) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Contestfilter_String(value=" + this.values + ')';
    }

    public loadFeatures(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ah$a() {
        return this.values;
    }
}
