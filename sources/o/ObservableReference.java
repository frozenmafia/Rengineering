package o;
/* loaded from: classes4.dex */
public final class ObservableReference {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableReference) && this.toString == ((ObservableReference) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_First_load_Boolean(value=" + this.toString + ')';
    }

    public ObservableReference(boolean z) {
        this.toString = z;
    }

    public final boolean valueOf() {
        return this.toString;
    }
}
