package o;
/* loaded from: classes4.dex */
public final class ObservableInt {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableInt) && this.toString == ((ObservableInt) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "_Discoverability_status_Int(value=" + this.toString + ')';
    }

    public ObservableInt(int i) {
        this.toString = i;
    }

    public final int ag$a() {
        return this.toString;
    }

    /* renamed from: o.ObservableInt$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final int toString;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && this.toString == ((AnonymousClass1) obj).toString;
        }

        public int hashCode() {
            return this.toString;
        }

        public String toString() {
            return "_Dr_Balance_Int_(value=" + this.toString + ')';
        }

        public AnonymousClass1(int i) {
            this.toString = i;
        }

        public final int ah$a() {
            return this.toString;
        }
    }
}
