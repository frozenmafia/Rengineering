package o;
/* loaded from: classes4.dex */
public final class executeBindings {
    private final boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof executeBindings) && this.valueOf == ((executeBindings) obj).valueOf;
    }

    public int hashCode() {
        boolean z = this.valueOf;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Multi_Entry_Boolean__(value=" + this.valueOf + ')';
    }

    public executeBindings(boolean z) {
        this.valueOf = z;
    }

    public final boolean ag$a() {
        return this.valueOf;
    }
}
