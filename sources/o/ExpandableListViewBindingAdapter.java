package o;
/* loaded from: classes4.dex */
public final class ExpandableListViewBindingAdapter {
    private final int ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExpandableListViewBindingAdapter) && this.ag$a == ((ExpandableListViewBindingAdapter) obj).ag$a;
    }

    public int hashCode() {
        return this.ag$a;
    }

    public String toString() {
        return "_Promotion_Amt_Int_(value=" + this.ag$a + ')';
    }

    public ExpandableListViewBindingAdapter(int i) {
        this.ag$a = i;
    }

    public final int ah$a() {
        return this.ag$a;
    }
}
