package o;
/* loaded from: classes3.dex */
public final class setCircular {
    public final float ag$a;
    public final int toString;

    public setCircular(int i, float f) {
        this.toString = i;
        this.ag$a = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setCircular setcircular = (setCircular) obj;
        return this.toString == setcircular.toString && Float.compare(setcircular.ag$a, this.ag$a) == 0;
    }

    public int hashCode() {
        return ((this.toString + androidx.databinding.library.baseAdapters.BR.userTeamVM) * 31) + Float.floatToIntBits(this.ag$a);
    }
}
