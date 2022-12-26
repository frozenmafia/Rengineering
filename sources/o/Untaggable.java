package o;
/* loaded from: classes4.dex */
public final class Untaggable {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Untaggable) && this.toString == ((Untaggable) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Has_Description_Boolean_(value=" + this.toString + ')';
    }

    public Untaggable(boolean z) {
        this.toString = z;
    }

    public final boolean ah$a() {
        return this.toString;
    }
}
