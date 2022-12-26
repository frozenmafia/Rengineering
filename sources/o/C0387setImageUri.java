package o;
/* renamed from: o.setImageUri  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0387setImageUri {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0387setImageUri) && this.values == ((C0387setImageUri) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_Promotion_Id_Int_(value=" + this.values + ')';
    }

    public C0387setImageUri(int i) {
        this.values = i;
    }

    public final int valueOf() {
        return this.values;
    }
}
