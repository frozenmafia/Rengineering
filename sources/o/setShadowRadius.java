package o;
/* loaded from: classes4.dex */
public final class setShadowRadius {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setShadowRadius) && runAnimators.values((Object) this.values, (Object) ((setShadowRadius) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Trans_Type_String_(value=" + this.values + ')';
    }

    public setShadowRadius(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String values() {
        return this.values;
    }
}
