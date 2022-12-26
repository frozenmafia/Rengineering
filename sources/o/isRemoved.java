package o;
/* loaded from: classes4.dex */
public final class isRemoved {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isRemoved) && runAnimators.values((Object) this.valueOf, (Object) ((isRemoved) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Animation_Trigger_String_(value=" + this.valueOf + ')';
    }

    public isRemoved(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String valueOf() {
        return this.valueOf;
    }
}
