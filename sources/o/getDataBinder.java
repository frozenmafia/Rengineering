package o;
/* loaded from: classes4.dex */
public final class getDataBinder {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getDataBinder) && runAnimators.values((Object) this.ah$a, (Object) ((getDataBinder) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Channel_custom_type_String(value=" + this.ah$a + ')';
    }

    public getDataBinder(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String valueOf() {
        return this.ah$a;
    }
}
