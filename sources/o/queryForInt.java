package o;
/* loaded from: classes4.dex */
public final class queryForInt {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof queryForInt) && runAnimators.values((Object) this.ag$a, (Object) ((queryForInt) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "__Section_name_String(value=" + this.ag$a + ')';
    }

    public queryForInt(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String ah$a() {
        return this.ag$a;
    }
}
