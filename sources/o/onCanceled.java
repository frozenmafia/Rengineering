package o;
/* loaded from: classes4.dex */
public final class onCanceled {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onCanceled) && runAnimators.values((Object) this.ah$a, (Object) ((onCanceled) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Group_String(value=" + this.ah$a + ')';
    }

    public onCanceled(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String ah$a() {
        return this.ah$a;
    }
}
