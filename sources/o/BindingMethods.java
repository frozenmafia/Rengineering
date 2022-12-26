package o;
/* loaded from: classes4.dex */
public final class BindingMethods {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BindingMethods) && runAnimators.values((Object) this.toString, (Object) ((BindingMethods) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Add_Cash_Source_String__(value=" + this.toString + ')';
    }

    public BindingMethods(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String ag$a() {
        return this.toString;
    }
}
