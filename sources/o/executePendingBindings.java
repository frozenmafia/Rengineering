package o;
/* loaded from: classes4.dex */
public final class executePendingBindings {
    private final boolean ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof executePendingBindings) && this.ah$a == ((executePendingBindings) obj).ah$a;
    }

    public int hashCode() {
        boolean z = this.ah$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Payment_Option_Available_Boolean___(value=" + this.ah$a + ')';
    }

    public executePendingBindings(boolean z) {
        this.ah$a = z;
    }

    public final boolean ag$a() {
        return this.ah$a;
    }
}
