package o;
/* loaded from: classes4.dex */
public final class ZoomControlsBindingAdapter {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoomControlsBindingAdapter) && runAnimators.values((Object) this.ag$a, (Object) ((ZoomControlsBindingAdapter) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Walletbalance_String(value=" + this.ag$a + ')';
    }

    public ZoomControlsBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String values() {
        return this.ag$a;
    }
}
