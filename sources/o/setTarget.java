package o;
/* loaded from: classes4.dex */
public final class setTarget {
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setTarget) && this.valueOf == ((setTarget) obj).valueOf;
    }

    public int hashCode() {
        return this.valueOf;
    }

    public String toString() {
        return "_No_Of_Slots_Filled_Int___(value=" + this.valueOf + ')';
    }

    public setTarget(int i) {
        this.valueOf = i;
    }

    public final int valueOf() {
        return this.valueOf;
    }
}
