package o;
/* loaded from: classes4.dex */
public final class inflateInternal {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inflateInternal) && this.toString == ((inflateInternal) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Caption_Boolean_(value=" + this.toString + ')';
    }

    public inflateInternal(boolean z) {
        this.toString = z;
    }

    public final boolean ag$a() {
        return this.toString;
    }
}
