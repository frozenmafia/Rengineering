package o;
/* loaded from: classes4.dex */
public final class getObservedField {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getObservedField) && this.toString == ((getObservedField) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Visible_Boolean_(value=" + this.toString + ')';
    }

    public getObservedField(boolean z) {
        this.toString = z;
    }

    public final boolean valueOf() {
        return this.toString;
    }
}
