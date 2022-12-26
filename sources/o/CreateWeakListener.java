package o;
/* loaded from: classes4.dex */
public final class CreateWeakListener {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateWeakListener) && runAnimators.values((Object) this.toString, (Object) ((CreateWeakListener) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Card_Brand_String_(value=" + this.toString + ')';
    }

    public CreateWeakListener(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String ah$a() {
        return this.toString;
    }
}
