package o;
/* loaded from: classes4.dex */
public final class BindingAdapter {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BindingAdapter) && runAnimators.values((Object) this.ag$a, (Object) ((BindingAdapter) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Active_State_String_(value=" + this.ag$a + ')';
    }

    public BindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String ag$a() {
        return this.ag$a;
    }
}
