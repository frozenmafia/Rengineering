package o;
/* loaded from: classes4.dex */
public final class OnRebindCallback {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnRebindCallback) && this.values == ((OnRebindCallback) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_Following_count_Int(value=" + this.values + ')';
    }

    public OnRebindCallback(int i) {
        this.values = i;
    }

    public final int ag$a() {
        return this.values;
    }
}
