package o;
/* loaded from: classes4.dex */
public final class setStretchColumns {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setStretchColumns) && this.values == ((setStretchColumns) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_Spots_Filled_Int_(value=" + this.values + ')';
    }

    public setStretchColumns(int i) {
        this.values = i;
    }

    public final int ag$a() {
        return this.values;
    }
}
