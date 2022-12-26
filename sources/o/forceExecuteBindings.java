package o;
/* loaded from: classes4.dex */
public final class forceExecuteBindings {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof forceExecuteBindings) && this.toString == ((forceExecuteBindings) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Source_Fc_C_T_A_Boolean_____(value=" + this.toString + ')';
    }

    public forceExecuteBindings(boolean z) {
        this.toString = z;
    }

    public final boolean valueOf() {
        return this.toString;
    }
}
