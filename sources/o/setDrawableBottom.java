package o;
/* loaded from: classes4.dex */
public final class setDrawableBottom {
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setDrawableBottom) && this.values == ((setDrawableBottom) obj).values;
    }

    public int hashCode() {
        boolean z = this.values;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Success_Flag_Boolean_(value=" + this.values + ')';
    }

    public setDrawableBottom(boolean z) {
        this.values = z;
    }

    public final boolean valueOf() {
        return this.values;
    }
}
