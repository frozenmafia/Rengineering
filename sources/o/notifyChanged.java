package o;
/* loaded from: classes4.dex */
public final class notifyChanged {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof notifyChanged) && runAnimators.values((Object) this.valueOf, (Object) ((notifyChanged) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Contest_Category_String_(value=" + this.valueOf + ')';
    }

    public notifyChanged(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String values() {
        return this.valueOf;
    }
}
