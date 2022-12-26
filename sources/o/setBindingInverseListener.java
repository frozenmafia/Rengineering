package o;
/* loaded from: classes4.dex */
public final class setBindingInverseListener {
    private final boolean ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setBindingInverseListener) && this.ag$a == ((setBindingInverseListener) obj).ag$a;
    }

    public int hashCode() {
        boolean z = this.ag$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_First_Install_Boolean__(value=" + this.ag$a + ')';
    }

    public setBindingInverseListener(boolean z) {
        this.ag$a = z;
    }

    public final boolean ah$a() {
        return this.ag$a;
    }
}
