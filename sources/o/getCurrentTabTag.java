package o;
/* loaded from: classes4.dex */
public final class getCurrentTabTag {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getCurrentTabTag) && this.toString == ((getCurrentTabTag) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Sort_Applied_Boolean_(value=" + this.toString + ')';
    }

    public getCurrentTabTag(boolean z) {
        this.toString = z;
    }

    public final boolean valueOf() {
        return this.toString;
    }
}
