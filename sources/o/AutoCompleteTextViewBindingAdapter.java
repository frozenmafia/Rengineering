package o;
/* loaded from: classes4.dex */
public final class AutoCompleteTextViewBindingAdapter {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoCompleteTextViewBindingAdapter) && runAnimators.values((Object) this.ag$a, (Object) ((AutoCompleteTextViewBindingAdapter) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Other_user_type_String(value=" + this.ag$a + ')';
    }

    public AutoCompleteTextViewBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String values() {
        return this.ag$a;
    }

    /* loaded from: classes4.dex */
    public final class FixText {
        private final double values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FixText) && runAnimators.values(Double.valueOf(this.values), Double.valueOf(((FixText) obj).values));
        }

        public int hashCode() {
            return Double.doubleToLongBits(this.values);
        }

        public String toString() {
            return "_Payment_Amount_Double_(value=" + this.values + ')';
        }

        public FixText(double d) {
            this.values = d;
        }

        public final double ag$a() {
            return this.values;
        }
    }

    /* renamed from: o.AutoCompleteTextViewBindingAdapter$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final boolean ag$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && this.ag$a == ((AnonymousClass1) obj).ag$a;
        }

        public int hashCode() {
            boolean z = this.ag$a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "_Password_Entered_Boolean_(value=" + this.ag$a + ')';
        }

        public AnonymousClass1(boolean z) {
            this.ag$a = z;
        }

        public final boolean ah$a() {
            return this.ag$a;
        }
    }

    /* loaded from: classes4.dex */
    public final class IsValid {
        private final int ag$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IsValid) && this.ag$a == ((IsValid) obj).ag$a;
        }

        public int hashCode() {
            return this.ag$a;
        }

        public String toString() {
            return "_Page_number_Int(value=" + this.ag$a + ')';
        }

        public IsValid(int i) {
            this.ag$a = i;
        }

        public final int values() {
            return this.ag$a;
        }
    }
}
