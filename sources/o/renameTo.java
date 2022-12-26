package o;
/* loaded from: classes4.dex */
public final class renameTo {
    private final int ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof renameTo) && this.ag$a == ((renameTo) obj).ag$a;
    }

    public int hashCode() {
        return this.ag$a;
    }

    public String toString() {
        return "__No_of_participants_selected_Int(value=" + this.ag$a + ')';
    }

    public renameTo(int i) {
        this.ag$a = i;
    }

    public final int ah$a() {
        return this.ag$a;
    }
}
