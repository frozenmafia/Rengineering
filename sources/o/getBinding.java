package o;
/* loaded from: classes4.dex */
public final class getBinding {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getBinding) && runAnimators.values((Object) this.ah$a, (Object) ((getBinding) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Channel_member_count_String(value=" + this.ah$a + ')';
    }

    public getBinding(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String ag$a() {
        return this.ah$a;
    }
}
