package o;
/* loaded from: classes4.dex */
public final class DatePickerBindingAdapter {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DatePickerBindingAdapter) && runAnimators.values((Object) this.toString, (Object) ((DatePickerBindingAdapter) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Previous_Value_String_(value=" + this.toString + ')';
    }

    /* loaded from: classes4.dex */
    public final class DateChangedListener {
        private final String ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateChangedListener) && runAnimators.values((Object) this.ah$a, (Object) ((DateChangedListener) obj).ah$a);
        }

        public int hashCode() {
            return this.ah$a.hashCode();
        }

        public String toString() {
            return "_Previous_Reaction_Id_String__(value=" + this.ah$a + ')';
        }

        public DateChangedListener(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a = str;
        }

        public final String ah$a() {
            return this.ah$a;
        }
    }

    /* renamed from: o.DatePickerBindingAdapter$1  reason: invalid class name */
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
            return "_Previous_Screen_Name_String__(value=" + this.ah$a + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a = str;
        }

        public final String ah$a() {
            return this.ah$a;
        }
    }

    public DatePickerBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String valueOf() {
        return this.toString;
    }
}
