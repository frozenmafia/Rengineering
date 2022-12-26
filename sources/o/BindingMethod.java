package o;
/* loaded from: classes4.dex */
public final class BindingMethod {
    private final boolean ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BindingMethod) && this.ag$a == ((BindingMethod) obj).ag$a;
    }

    public int hashCode() {
        boolean z = this.ag$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Age_Check_Box_Boolean__(value=" + this.ag$a + ')';
    }

    public BindingMethod(boolean z) {
        this.ag$a = z;
    }

    public final boolean values() {
        return this.ag$a;
    }
}
