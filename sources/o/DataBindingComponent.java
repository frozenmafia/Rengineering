package o;
/* loaded from: classes4.dex */
public final class DataBindingComponent {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataBindingComponent) && runAnimators.values((Object) this.toString, (Object) ((DataBindingComponent) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Channel_Url_String_(value=" + this.toString + ')';
    }

    public DataBindingComponent(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String ah$a() {
        return this.toString;
    }
}
