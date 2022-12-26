package o;
/* loaded from: classes4.dex */
public final class handleFieldChange {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof handleFieldChange) && this.toString == ((handleFieldChange) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_User_Muted_Boolean__(value=" + this.toString + ')';
    }

    public handleFieldChange(boolean z) {
        this.toString = z;
    }

    public final boolean ag$a() {
        return this.toString;
    }
}
