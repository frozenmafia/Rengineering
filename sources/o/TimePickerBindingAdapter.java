package o;
/* loaded from: classes4.dex */
public final class TimePickerBindingAdapter {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimePickerBindingAdapter) && runAnimators.values((Object) this.ah$a, (Object) ((TimePickerBindingAdapter) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Upi1_Verified_String_(value=" + this.ah$a + ')';
    }

    public TimePickerBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    /* renamed from: o.TimePickerBindingAdapter$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final boolean values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && this.values == ((AnonymousClass1) obj).values;
        }

        public int hashCode() {
            boolean z = this.values;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "_Upi_Warning_Message_Visible_Boolean___(value=" + this.values + ')';
        }

        public AnonymousClass1(boolean z) {
            this.values = z;
        }

        public final boolean ag$a() {
            return this.values;
        }
    }
}
