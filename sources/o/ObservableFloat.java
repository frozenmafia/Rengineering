package o;
/* loaded from: classes4.dex */
public final class ObservableFloat {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableFloat) && runAnimators.values((Object) this.values, (Object) ((ObservableFloat) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Enabled_State_String_(value=" + this.values + ')';
    }

    public ObservableFloat(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String valueOf() {
        return this.values;
    }

    /* renamed from: o.ObservableFloat$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final boolean ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && this.ah$a == ((AnonymousClass1) obj).ah$a;
        }

        public int hashCode() {
            boolean z = this.ah$a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "_Discoverability_status_Boolean(value=" + this.ah$a + ')';
        }

        public AnonymousClass1(boolean z) {
            this.ah$a = z;
        }

        public final boolean values() {
            return this.ah$a;
        }
    }
}
