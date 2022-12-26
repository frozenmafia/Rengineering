package o;
/* loaded from: classes4.dex */
public final class findBinding {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof findBinding) && this.values == ((findBinding) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_Channel_member_count_Int(value=" + this.values + ')';
    }

    public findBinding(int i) {
        this.values = i;
    }

    public final int values() {
        return this.values;
    }
}
