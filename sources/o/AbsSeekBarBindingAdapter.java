package o;
/* loaded from: classes4.dex */
public final class AbsSeekBarBindingAdapter {
    private final double ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbsSeekBarBindingAdapter) && runAnimators.values(Double.valueOf(this.ah$a), Double.valueOf(((AbsSeekBarBindingAdapter) obj).ah$a));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.ah$a);
    }

    public String toString() {
        return "_Old_Amount_Double_(value=" + this.ah$a + ')';
    }

    public AbsSeekBarBindingAdapter(double d) {
        this.ah$a = d;
    }

    public final double ag$a() {
        return this.ah$a;
    }
}
