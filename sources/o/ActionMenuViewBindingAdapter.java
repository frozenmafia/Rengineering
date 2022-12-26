package o;
/* loaded from: classes4.dex */
public final class ActionMenuViewBindingAdapter {
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionMenuViewBindingAdapter) && this.values == ((ActionMenuViewBindingAdapter) obj).values;
    }

    public int hashCode() {
        boolean z = this.values;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_One_Click_Payment_Enrolled_Boolean___(value=" + this.values + ')';
    }

    public ActionMenuViewBindingAdapter(boolean z) {
        this.values = z;
    }

    public final boolean valueOf() {
        return this.values;
    }
}
