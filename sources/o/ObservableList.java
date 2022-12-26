package o;
/* loaded from: classes4.dex */
public final class ObservableList {
    private final boolean ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableList) && this.ah$a == ((ObservableList) obj).ah$a;
    }

    public int hashCode() {
        boolean z = this.ah$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Email_Entered_Boolean_(value=" + this.ah$a + ')';
    }

    /* loaded from: classes4.dex */
    public final class OnListChangedCallback {
        private final double toString;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnListChangedCallback) && runAnimators.values(Double.valueOf(this.toString), Double.valueOf(((OnListChangedCallback) obj).toString));
        }

        public int hashCode() {
            return Double.doubleToLongBits(this.toString);
        }

        public String toString() {
            return "_Entry_Fee_Double_(value=" + this.toString + ')';
        }

        public OnListChangedCallback(double d) {
            this.toString = d;
        }

        public final double ah$a() {
            return this.toString;
        }
    }

    public ObservableList(boolean z) {
        this.ah$a = z;
    }

    public final boolean ah$a() {
        return this.ah$a;
    }
}
