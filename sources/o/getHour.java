package o;
/* loaded from: classes4.dex */
public final class getHour {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getHour) && runAnimators.values((Object) this.values, (Object) ((getHour) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Update_Type_String_(value=" + this.values + ')';
    }

    public getHour(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String values() {
        return this.values;
    }
}
