package o;
/* loaded from: classes4.dex */
public final class ChronometerBindingAdapter {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronometerBindingAdapter) && this.values == ((ChronometerBindingAdapter) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_Position_Int(value=" + this.values + ')';
    }

    public ChronometerBindingAdapter(int i) {
        this.values = i;
    }

    public final int ag$a() {
        return this.values;
    }
}
