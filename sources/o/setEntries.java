package o;
/* loaded from: classes4.dex */
public final class setEntries {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setEntries) && this.toString == ((setEntries) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_One_Click_Payment_Eligible_Boolean___(value=" + this.toString + ')';
    }

    public setEntries(boolean z) {
        this.toString = z;
    }

    public final boolean ag$a() {
        return this.toString;
    }
}
