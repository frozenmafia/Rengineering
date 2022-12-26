package o;
/* loaded from: classes4.dex */
public final class InverseBindingMethod {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InverseBindingMethod) && this.toString == ((InverseBindingMethod) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "_Contest_Id_Int_(value=" + this.toString + ')';
    }

    public InverseBindingMethod(int i) {
        this.toString = i;
    }

    public final int values() {
        return this.toString;
    }
}
