package o;
/* loaded from: classes4.dex */
public final class trackListener {
    private final int ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof trackListener) && this.ag$a == ((trackListener) obj).ag$a;
    }

    public int hashCode() {
        return this.ag$a;
    }

    public String toString() {
        return "_Quantity_Int(value=" + this.ag$a + ')';
    }

    public trackListener(int i) {
        this.ag$a = i;
    }

    public final int ag$a() {
        return this.ag$a;
    }
}
