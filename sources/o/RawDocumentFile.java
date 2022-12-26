package o;
/* loaded from: classes4.dex */
public final class RawDocumentFile {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RawDocumentFile) && this.toString == ((RawDocumentFile) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "__Size_Of_Phonebook_Int__(value=" + this.toString + ')';
    }

    public RawDocumentFile(int i) {
        this.toString = i;
    }

    public final int values() {
        return this.toString;
    }
}
