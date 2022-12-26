package o;
/* loaded from: classes4.dex */
public final class setRootTag {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setRootTag) && runAnimators.values((Object) this.values, (Object) ((setRootTag) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_League_Join_Source_String__(value=" + this.values + ')';
    }

    public setRootTag(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ah$a() {
        return this.values;
    }
}
