package o;
/* loaded from: classes4.dex */
public final class isDirectory {
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isDirectory) && this.valueOf == ((isDirectory) obj).valueOf;
    }

    public int hashCode() {
        return this.valueOf;
    }

    public String toString() {
        return "__No_of_contacts_selected_Int(value=" + this.valueOf + ')';
    }

    public isDirectory(int i) {
        this.valueOf = i;
    }

    public final int ag$a() {
        return this.valueOf;
    }
}
