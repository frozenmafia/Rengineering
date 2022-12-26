package o;
/* loaded from: classes4.dex */
public final class canWrite {
    private final boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof canWrite) && this.valueOf == ((canWrite) obj).valueOf;
    }

    public int hashCode() {
        boolean z = this.valueOf;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "__A_L_L_O_W_E_D_Boolean______(value=" + this.valueOf + ')';
    }

    public canWrite(boolean z) {
        this.valueOf = z;
    }

    public final boolean ah$a() {
        return this.valueOf;
    }
}
