package o;
/* loaded from: classes4.dex */
public final class isFile {
    private final int ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isFile) && this.ah$a == ((isFile) obj).ah$a;
    }

    public int hashCode() {
        return this.ah$a;
    }

    public String toString() {
        return "__No_of_friends_selected_Int(value=" + this.ah$a + ')';
    }

    public isFile(int i) {
        this.ah$a = i;
    }

    public final int valueOf() {
        return this.ah$a;
    }
}
