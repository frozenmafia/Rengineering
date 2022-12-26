package o;
/* loaded from: classes4.dex */
public final class onCheckedChanged {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onCheckedChanged) && runAnimators.values((Object) this.valueOf, (Object) ((onCheckedChanged) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Preview_Type_String_(value=" + this.valueOf + ')';
    }

    public onCheckedChanged(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String ah$a() {
        return this.valueOf;
    }
}
