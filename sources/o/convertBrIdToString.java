package o;
/* loaded from: classes4.dex */
public final class convertBrIdToString {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof convertBrIdToString) && runAnimators.values((Object) this.ah$a, (Object) ((convertBrIdToString) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Card_Category_String_(value=" + this.ah$a + ')';
    }

    public convertBrIdToString(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String ah$a() {
        return this.ah$a;
    }
}
