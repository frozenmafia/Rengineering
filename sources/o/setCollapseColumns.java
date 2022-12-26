package o;
/* loaded from: classes4.dex */
public final class setCollapseColumns {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setCollapseColumns) && this.toString == ((setCollapseColumns) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "_Sportid_Int(value=" + this.toString + ')';
    }

    public setCollapseColumns(int i) {
        this.toString = i;
    }

    public final int values() {
        return this.toString;
    }
}
