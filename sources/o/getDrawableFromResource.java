package o;
/* loaded from: classes4.dex */
public final class getDrawableFromResource {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getDrawableFromResource) && runAnimators.values((Object) this.values, (Object) ((getDrawableFromResource) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Interaction_String(value=" + this.values + ')';
    }

    public getDrawableFromResource(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ag$a() {
        return this.values;
    }
}
