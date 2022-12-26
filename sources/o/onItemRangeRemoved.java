package o;
/* loaded from: classes4.dex */
public final class onItemRangeRemoved {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onItemRangeRemoved) && runAnimators.values((Object) this.values, (Object) ((onItemRangeRemoved) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Entry_Point_String_(value=" + this.values + ')';
    }

    public onItemRangeRemoved(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ah$a() {
        return this.values;
    }
}
