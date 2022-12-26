package o;
/* loaded from: classes4.dex */
public final class onBound {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onBound) && runAnimators.values((Object) this.values, (Object) ((onBound) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Group_Name_String_(value=" + this.values + ')';
    }

    public onBound(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ah$a() {
        return this.values;
    }
}
