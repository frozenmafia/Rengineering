package o;
/* loaded from: classes4.dex */
public final class Bindable {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Bindable) && runAnimators.values((Object) this.values, (Object) ((Bindable) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Ab_Test_Parameter_String__(value=" + this.values + ')';
    }

    public Bindable(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String values() {
        return this.values;
    }
}
