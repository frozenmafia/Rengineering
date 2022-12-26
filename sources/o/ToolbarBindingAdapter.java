package o;
/* loaded from: classes4.dex */
public final class ToolbarBindingAdapter {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToolbarBindingAdapter) && runAnimators.values((Object) this.ag$a, (Object) ((ToolbarBindingAdapter) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Upi2_Verified_String_(value=" + this.ag$a + ')';
    }

    public ToolbarBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String ah$a() {
        return this.ag$a;
    }
}
