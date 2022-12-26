package o;
/* loaded from: classes4.dex */
public final class checkAndCastToBindingComponent {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof checkAndCastToBindingComponent) && runAnimators.values((Object) this.toString, (Object) ((checkAndCastToBindingComponent) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Id_String(value=" + this.toString + ')';
    }

    public checkAndCastToBindingComponent(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String ah$a() {
        return this.toString;
    }
}
