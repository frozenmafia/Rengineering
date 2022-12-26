package o;
/* loaded from: classes4.dex */
public final class requestRebind {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof requestRebind) && runAnimators.values((Object) this.valueOf, (Object) ((requestRebind) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Isadmin_String(value=" + this.valueOf + ')';
    }

    public requestRebind(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String ah$a() {
        return this.valueOf;
    }
}
