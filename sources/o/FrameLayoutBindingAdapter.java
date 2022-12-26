package o;
/* loaded from: classes4.dex */
public final class FrameLayoutBindingAdapter {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FrameLayoutBindingAdapter) && this.toString == ((FrameLayoutBindingAdapter) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "_Promo_Id_Int_(value=" + this.toString + ')';
    }

    public FrameLayoutBindingAdapter(int i) {
        this.toString = i;
    }

    public final int values() {
        return this.toString;
    }
}
