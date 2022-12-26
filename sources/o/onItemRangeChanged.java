package o;
/* loaded from: classes4.dex */
public final class onItemRangeChanged {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onItemRangeChanged) && this.values == ((onItemRangeChanged) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_Error_Code_Int_(value=" + this.values + ')';
    }

    public onItemRangeChanged(int i) {
        this.values = i;
    }

    public final int ag$a() {
        return this.values;
    }
}
