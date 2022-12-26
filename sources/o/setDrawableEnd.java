package o;
/* loaded from: classes4.dex */
public final class setDrawableEnd {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setDrawableEnd) && runAnimators.values((Object) this.ah$a, (Object) ((setDrawableEnd) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Tab_Selected_String_(value=" + this.ah$a + ')';
    }

    public setDrawableEnd(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String ag$a() {
        return this.ah$a;
    }
}
