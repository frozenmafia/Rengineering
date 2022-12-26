package o;
/* loaded from: classes4.dex */
public final class SingleDocumentFile {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SingleDocumentFile) && runAnimators.values((Object) this.ah$a, (Object) ((SingleDocumentFile) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "__Tab_Selected_String_(value=" + this.ah$a + ')';
    }

    public SingleDocumentFile(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String valueOf() {
        return this.ah$a;
    }
}
