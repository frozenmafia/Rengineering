package o;
/* loaded from: classes4.dex */
public final class hasPendingBindings {
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hasPendingBindings) && this.values == ((hasPendingBindings) obj).values;
    }

    public int hashCode() {
        boolean z = this.values;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Wallet_Linkable_Boolean__(value=" + this.values + ')';
    }

    public hasPendingBindings(boolean z) {
        this.values = z;
    }

    public final boolean ag$a() {
        return this.values;
    }
}
