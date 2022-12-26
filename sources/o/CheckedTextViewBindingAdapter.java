package o;
/* loaded from: classes4.dex */
public final class CheckedTextViewBindingAdapter {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckedTextViewBindingAdapter) && runAnimators.values((Object) this.valueOf, (Object) ((CheckedTextViewBindingAdapter) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Placement_String(value=" + this.valueOf + ')';
    }

    public CheckedTextViewBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String values() {
        return this.valueOf;
    }
}
