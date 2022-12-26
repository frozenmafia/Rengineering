package o;
/* loaded from: classes4.dex */
public final class removeOnRebindCallback {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof removeOnRebindCallback) && this.toString == ((removeOnRebindCallback) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Isadmin_Boolean(value=" + this.toString + ')';
    }

    public removeOnRebindCallback(boolean z) {
        this.toString = z;
    }

    public final boolean ag$a() {
        return this.toString;
    }
}
