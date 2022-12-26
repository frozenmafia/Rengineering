package o;
/* loaded from: classes4.dex */
public final class LinearLayoutBindingAdapter {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinearLayoutBindingAdapter) && runAnimators.values((Object) this.ag$a, (Object) ((LinearLayoutBindingAdapter) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Proplayer_In_Teams_String__(value=" + this.ag$a + ')';
    }

    public LinearLayoutBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String valueOf() {
        return this.ag$a;
    }
}
