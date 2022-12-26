package o;
/* loaded from: classes4.dex */
public final class ProgressBarBindingAdapter {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProgressBarBindingAdapter) && runAnimators.values((Object) this.toString, (Object) ((ProgressBarBindingAdapter) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Result_String(value=" + this.toString + ')';
    }

    public ProgressBarBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String ah$a() {
        return this.toString;
    }
}
