package o;
/* loaded from: classes4.dex */
public final class getLifecycleOwner {
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getLifecycleOwner) && this.valueOf == ((getLifecycleOwner) obj).valueOf;
    }

    public int hashCode() {
        return this.valueOf;
    }

    public String toString() {
        return "_Is_Source_Fc_C_T_A_Int_____(value=" + this.valueOf + ')';
    }

    public getLifecycleOwner(int i) {
        this.valueOf = i;
    }

    public final int ah$a() {
        return this.valueOf;
    }
}
