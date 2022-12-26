package o;
/* loaded from: classes4.dex */
public final class Observable {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Observable) && this.toString == ((Observable) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "_Count_Bank_Int_(value=" + this.toString + ')';
    }

    public Observable(int i) {
        this.toString = i;
    }

    public final int values() {
        return this.toString;
    }

    /* loaded from: classes4.dex */
    public final class OnPropertyChangedCallback {
        private final boolean toString;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPropertyChangedCallback) && this.toString == ((OnPropertyChangedCallback) obj).toString;
        }

        public int hashCode() {
            boolean z = this.toString;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "_Coupon_Applied_Boolean_(value=" + this.toString + ')';
        }

        public OnPropertyChangedCallback(boolean z) {
            this.toString = z;
        }

        public final boolean values() {
            return this.toString;
        }
    }
}
