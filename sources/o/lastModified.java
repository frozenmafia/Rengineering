package o;
/* loaded from: classes4.dex */
public final class lastModified {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lastModified) && runAnimators.values((Object) this.ah$a, (Object) ((lastModified) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "__Promo_Code_Name_String__(value=" + this.ah$a + ')';
    }

    public lastModified(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String values() {
        return this.ah$a;
    }
}
