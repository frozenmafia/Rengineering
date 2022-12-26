package o;
/* loaded from: classes4.dex */
public final class getFromArray {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getFromArray) && this.values == ((getFromArray) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_Is_Admin_Int_(value=" + this.values + ')';
    }

    public getFromArray(int i) {
        this.values = i;
    }

    public final int values() {
        return this.values;
    }
}
