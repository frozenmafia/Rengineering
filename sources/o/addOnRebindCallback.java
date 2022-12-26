package o;
/* loaded from: classes4.dex */
public final class addOnRebindCallback {
    private final boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof addOnRebindCallback) && this.valueOf == ((addOnRebindCallback) obj).valueOf;
    }

    public int hashCode() {
        boolean z = this.valueOf;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Rejoin_Boolean_(value=" + this.valueOf + ')';
    }

    public addOnRebindCallback(boolean z) {
        this.valueOf = z;
    }

    public final boolean valueOf() {
        return this.valueOf;
    }
}
