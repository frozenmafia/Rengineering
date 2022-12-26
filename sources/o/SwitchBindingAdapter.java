package o;
/* loaded from: classes4.dex */
public final class SwitchBindingAdapter {
    private final int ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SwitchBindingAdapter) && this.ag$a == ((SwitchBindingAdapter) obj).ag$a;
    }

    public int hashCode() {
        return this.ag$a;
    }

    public String toString() {
        return "_Slot_Position_Int_(value=" + this.ag$a + ')';
    }

    public SwitchBindingAdapter(int i) {
        this.ag$a = i;
    }

    public final int ag$a() {
        return this.ag$a;
    }
}
