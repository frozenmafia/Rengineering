package o;
/* loaded from: classes4.dex */
public final class ViewDataBindingKtx$StateFlowListener$startCollection$1 {
    private final double values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewDataBindingKtx$StateFlowListener$startCollection$1) && runAnimators.values(Double.valueOf(this.values), Double.valueOf(((ViewDataBindingKtx$StateFlowListener$startCollection$1) obj).values));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.values);
    }

    public String toString() {
        return "_New_Amount_Double_(value=" + this.values + ')';
    }

    public ViewDataBindingKtx$StateFlowListener$startCollection$1(double d) {
        this.values = d;
    }

    public final double ag$a() {
        return this.values;
    }
}
