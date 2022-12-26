package o;
/* loaded from: classes4.dex */
public final class ObservableParcelable {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableParcelable) && this.values == ((ObservableParcelable) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_Filters_Applied_Int_(value=" + this.values + ')';
    }

    public ObservableParcelable(int i) {
        this.values = i;
    }

    public final int ah$a() {
        return this.values;
    }

    /* renamed from: o.ObservableParcelable$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final double ag$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && runAnimators.values(Double.valueOf(this.ag$a), Double.valueOf(((AnonymousClass1) obj).ag$a));
        }

        public int hashCode() {
            return Double.doubleToLongBits(this.ag$a);
        }

        public String toString() {
            return "_Fantasy_Points_Double_(value=" + this.ag$a + ')';
        }

        public AnonymousClass1(double d) {
            this.ag$a = d;
        }

        public final double ah$a() {
            return this.ag$a;
        }
    }
}
