package o;
/* loaded from: classes4.dex */
public final class setList {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setList) && runAnimators.values((Object) this.valueOf, (Object) ((setList) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Reaction_Id_String_(value=" + this.valueOf + ')';
    }

    public setList(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String valueOf() {
        return this.valueOf;
    }
}
