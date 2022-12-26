package o;
/* loaded from: classes4.dex */
public final class SpinnerBindingAdapter {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpinnerBindingAdapter) && runAnimators.values((Object) this.valueOf, (Object) ((SpinnerBindingAdapter) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Sender_Id_String_(value=" + this.valueOf + ')';
    }

    public SpinnerBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String ah$a() {
        return this.valueOf;
    }
}
