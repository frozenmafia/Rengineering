package o;
/* loaded from: classes4.dex */
public final class setContainedBinding {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setContainedBinding) && this.toString == ((setContainedBinding) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Joined_Via_Invite_Boolean__(value=" + this.toString + ')';
    }

    public setContainedBinding(boolean z) {
        this.toString = z;
    }

    public final boolean ah$a() {
        return this.toString;
    }
}
