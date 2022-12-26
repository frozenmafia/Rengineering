package o;
/* loaded from: classes.dex */
public final class setCurrentTabTag {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setCurrentTabTag) && runAnimators.values((Object) this.values, (Object) ((setCurrentTabTag) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Source_String(value=" + this.values + ')';
    }

    public setCurrentTabTag(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ah$a() {
        return this.values;
    }
}
