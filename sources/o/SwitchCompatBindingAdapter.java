package o;
/* loaded from: classes4.dex */
public final class SwitchCompatBindingAdapter {
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SwitchCompatBindingAdapter) && this.valueOf == ((SwitchCompatBindingAdapter) obj).valueOf;
    }

    public int hashCode() {
        return this.valueOf;
    }

    public String toString() {
        return "_Slot_Postion_Int_(value=" + this.valueOf + ')';
    }

    public SwitchCompatBindingAdapter(int i) {
        this.valueOf = i;
    }

    public final int valueOf() {
        return this.valueOf;
    }
}
