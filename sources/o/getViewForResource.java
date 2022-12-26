package o;
/* loaded from: classes4.dex */
public final class getViewForResource {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getViewForResource) && runAnimators.values((Object) this.values, (Object) ((getViewForResource) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Recent_Fantasypoints_String_(value=" + this.values + ')';
    }

    public getViewForResource(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ag$a() {
        return this.values;
    }
}
