package o;
/* loaded from: classes4.dex */
public final class TextViewBindingAdapter {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextViewBindingAdapter) && this.values == ((TextViewBindingAdapter) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_State_Id_Int_(value=" + this.values + ')';
    }

    /* loaded from: classes4.dex */
    public final class AfterTextChanged {
        private final String ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AfterTextChanged) && runAnimators.values((Object) this.ah$a, (Object) ((AfterTextChanged) obj).ah$a);
        }

        public int hashCode() {
            return this.ah$a.hashCode();
        }

        public String toString() {
            return "_Type_String(value=" + this.ah$a + ')';
        }

        public AfterTextChanged(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a = str;
        }

        public final String values() {
            return this.ah$a;
        }
    }

    /* renamed from: o.TextViewBindingAdapter$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final String valueOf;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && runAnimators.values((Object) this.valueOf, (Object) ((AnonymousClass1) obj).valueOf);
        }

        public int hashCode() {
            return this.valueOf.hashCode();
        }

        public String toString() {
            return "_Transaction_Id_String_(value=" + this.valueOf + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.valueOf = str;
        }

        public final String valueOf() {
            return this.valueOf;
        }
    }

    /* loaded from: classes4.dex */
    public final class BeforeTextChanged {
        private final String toString;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BeforeTextChanged) && runAnimators.values((Object) this.toString, (Object) ((BeforeTextChanged) obj).toString);
        }

        public int hashCode() {
            return this.toString.hashCode();
        }

        public String toString() {
            return "_Transaction_Date_String_(value=" + this.toString + ')';
        }

        public BeforeTextChanged(String str) {
            runAnimators.ag$a(str, "value");
            this.toString = str;
        }

        public final String ah$a() {
            return this.toString;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnTextChanged {
        private final String valueOf;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTextChanged) && runAnimators.values((Object) this.valueOf, (Object) ((OnTextChanged) obj).valueOf);
        }

        public int hashCode() {
            return this.valueOf.hashCode();
        }

        public String toString() {
            return "_Transaction_Type_String_(value=" + this.valueOf + ')';
        }

        public OnTextChanged(String str) {
            runAnimators.ag$a(str, "value");
            this.valueOf = str;
        }

        public final String ah$a() {
            return this.valueOf;
        }
    }

    public TextViewBindingAdapter(int i) {
        this.values = i;
    }

    public final int values() {
        return this.values;
    }
}
