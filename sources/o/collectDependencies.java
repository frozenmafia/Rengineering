package o;
/* loaded from: classes4.dex */
public final class collectDependencies {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof collectDependencies) && runAnimators.values((Object) this.values, (Object) ((collectDependencies) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Captain_In_Teams_String__(value=" + this.values + ')';
    }

    public collectDependencies(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String valueOf() {
        return this.values;
    }
}
