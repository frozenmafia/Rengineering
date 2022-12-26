package o;
/* loaded from: classes4.dex */
public final class notifyInserted {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof notifyInserted) && runAnimators.values((Object) this.valueOf, (Object) ((notifyInserted) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Contest_Name_String_(value=" + this.valueOf + ')';
    }

    public notifyInserted(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String valueOf() {
        return this.valueOf;
    }
}
