package o;
/* loaded from: classes4.dex */
public final class mapBindings {
    private final boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mapBindings) && this.valueOf == ((mapBindings) obj).valueOf;
    }

    public int hashCode() {
        boolean z = this.valueOf;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Confirmed_Boolean_(value=" + this.valueOf + ')';
    }

    public mapBindings(boolean z) {
        this.valueOf = z;
    }

    public final boolean ag$a() {
        return this.valueOf;
    }
}
