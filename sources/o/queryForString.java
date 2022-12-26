package o;
/* loaded from: classes4.dex */
public final class queryForString {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof queryForString) && runAnimators.values((Object) this.valueOf, (Object) ((queryForString) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "__Section_Contest_String_(value=" + this.valueOf + ')';
    }

    public queryForString(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String ah$a() {
        return this.valueOf;
    }
}
