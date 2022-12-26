package o;
/* loaded from: classes4.dex */
public final class setBufferType {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setBufferType) && runAnimators.values((Object) this.valueOf, (Object) ((setBufferType) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_State_Name_String_(value=" + this.valueOf + ')';
    }

    public setBufferType(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String ah$a() {
        return this.valueOf;
    }
}
