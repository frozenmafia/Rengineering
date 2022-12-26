package o;
/* loaded from: classes4.dex */
public final class safeUnbox {
    private final boolean ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof safeUnbox) && this.ag$a == ((safeUnbox) obj).ag$a;
    }

    public int hashCode() {
        boolean z = this.ag$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Linkable_Boolean_(value=" + this.ag$a + ')';
    }

    public safeUnbox(boolean z) {
        this.ag$a = z;
    }

    public final boolean ag$a() {
        return this.ag$a;
    }
}
