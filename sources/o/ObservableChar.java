package o;
/* loaded from: classes4.dex */
public final class ObservableChar {
    private final double ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableChar) && runAnimators.values(Double.valueOf(this.ag$a), Double.valueOf(((ObservableChar) obj).ag$a));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.ag$a);
    }

    public String toString() {
        return "_Deposit_E_F_Double__(value=" + this.ag$a + ')';
    }

    /* renamed from: o.ObservableChar$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final String ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && runAnimators.values((Object) this.ah$a, (Object) ((AnonymousClass1) obj).ah$a);
        }

        public int hashCode() {
            return this.ah$a.hashCode();
        }

        public String toString() {
            return "_Device_Fingerprint_String_(value=" + this.ah$a + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a = str;
        }

        public final String ag$a() {
            return this.ah$a;
        }
    }

    public ObservableChar(double d) {
        this.ag$a = d;
    }

    public final double values() {
        return this.ag$a;
    }
}
