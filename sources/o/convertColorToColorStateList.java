package o;
/* loaded from: classes4.dex */
public final class convertColorToColorStateList {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof convertColorToColorStateList) && runAnimators.values((Object) this.values, (Object) ((convertColorToColorStateList) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Previous_Sport_Name_String__(value=" + this.values + ')';
    }

    public convertColorToColorStateList(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String valueOf() {
        return this.values;
    }
}
