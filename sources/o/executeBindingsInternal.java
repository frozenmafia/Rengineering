package o;
/* loaded from: classes4.dex */
public final class executeBindingsInternal {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof executeBindingsInternal) && this.toString == ((executeBindingsInternal) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Hasprofilepicture_Boolean(value=" + this.toString + ')';
    }

    public executeBindingsInternal(boolean z) {
        this.toString = z;
    }

    public final boolean values() {
        return this.toString;
    }
}
