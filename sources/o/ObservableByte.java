package o;
/* loaded from: classes4.dex */
public final class ObservableByte {
    private final double valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableByte) && runAnimators.values(Double.valueOf(this.valueOf), Double.valueOf(((ObservableByte) obj).valueOf));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.valueOf);
    }

    public String toString() {
        return "_Credits_Remaining_Double_(value=" + this.valueOf + ')';
    }

    public ObservableByte(double d) {
        this.valueOf = d;
    }

    public final double ag$a() {
        return this.valueOf;
    }

    /* renamed from: o.ObservableByte$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final int valueOf;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && this.valueOf == ((AnonymousClass1) obj).valueOf;
        }

        public int hashCode() {
            return this.valueOf;
        }

        public String toString() {
            return "_Current_Page_Size_Int__(value=" + this.valueOf + ')';
        }

        public AnonymousClass1(int i) {
            this.valueOf = i;
        }

        public final int valueOf() {
            return this.valueOf;
        }
    }
}
