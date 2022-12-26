package o;
/* loaded from: classes4.dex */
public final class setAutoText {
    private final boolean ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setAutoText) && this.ah$a == ((setAutoText) obj).ah$a;
    }

    public int hashCode() {
        boolean z = this.ah$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_State_filled_Boolean(value=" + this.ah$a + ')';
    }

    public setAutoText(boolean z) {
        this.ah$a = z;
    }

    public final boolean ah$a() {
        return this.ah$a;
    }
}
