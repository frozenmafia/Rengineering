package o;
/* loaded from: classes4.dex */
public final class ensureBindingComponentIsNotNull {
    private final boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ensureBindingComponentIsNotNull) && this.valueOf == ((ensureBindingComponentIsNotNull) obj).valueOf;
    }

    public int hashCode() {
        boolean z = this.valueOf;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Recommended_Template_Boolean__(value=" + this.valueOf + ')';
    }

    public ensureBindingComponentIsNotNull(boolean z) {
        this.valueOf = z;
    }

    public final boolean ah$a() {
        return this.valueOf;
    }
}
