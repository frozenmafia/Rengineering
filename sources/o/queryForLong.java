package o;
/* loaded from: classes4.dex */
public final class queryForLong {
    private final int ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof queryForLong) && this.ah$a == ((queryForLong) obj).ah$a;
    }

    public int hashCode() {
        return this.ah$a;
    }

    public String toString() {
        return "__Section_index_Int(value=" + this.ah$a + ')';
    }

    public queryForLong(int i) {
        this.ah$a = i;
    }

    public final int ah$a() {
        return this.ah$a;
    }
}
