package o;
/* loaded from: classes4.dex */
public final class fixText {
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fixText) && this.values == ((fixText) obj).values;
    }

    public int hashCode() {
        boolean z = this.values;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Pay_If_You_Win_Flag_Boolean____(value=" + this.values + ')';
    }

    public fixText(boolean z) {
        this.values = z;
    }

    public final boolean ag$a() {
        return this.values;
    }
}
