package o;
/* loaded from: classes4.dex */
public final class CalendarViewBindingAdapter {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CalendarViewBindingAdapter) && runAnimators.values((Object) this.values, (Object) ((CalendarViewBindingAdapter) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Payment_Name_String_(value=" + this.values + ')';
    }

    public CalendarViewBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ag$a() {
        return this.values;
    }

    /* renamed from: o.CalendarViewBindingAdapter$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final String values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && runAnimators.values((Object) this.values, (Object) ((AnonymousClass1) obj).values);
        }

        public int hashCode() {
            return this.values.hashCode();
        }

        public String toString() {
            return "_Payment_Option_Promotion_Message_String___(value=" + this.values + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.values = str;
        }

        public final String ah$a() {
            return this.values;
        }
    }
}
