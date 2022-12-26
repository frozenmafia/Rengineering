package o;
/* loaded from: classes4.dex */
public final class DocumentFile {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DocumentFile) && runAnimators.values((Object) this.values, (Object) ((DocumentFile) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Winning_Amount_String_(value=" + this.values + ')';
    }

    public DocumentFile(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String values() {
        return this.values;
    }
}
