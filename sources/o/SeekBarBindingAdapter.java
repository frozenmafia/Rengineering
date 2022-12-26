package o;
/* loaded from: classes4.dex */
public final class SeekBarBindingAdapter {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeekBarBindingAdapter) && runAnimators.values((Object) this.values, (Object) ((SeekBarBindingAdapter) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Section_Title_String_(value=" + this.values + ')';
    }

    /* loaded from: classes4.dex */
    public final class OnProgressChanged {
        private final String ag$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProgressChanged) && runAnimators.values((Object) this.ag$a, (Object) ((OnProgressChanged) obj).ag$a);
        }

        public int hashCode() {
            return this.ag$a.hashCode();
        }

        public String toString() {
            return "_Selection_String(value=" + this.ag$a + ')';
        }

        public OnProgressChanged(String str) {
            runAnimators.ag$a(str, "value");
            this.ag$a = str;
        }

        public final String ag$a() {
            return this.ag$a;
        }
    }

    public SeekBarBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String valueOf() {
        return this.values;
    }

    /* renamed from: o.SeekBarBindingAdapter$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 {
        private final int values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && this.values == ((AnonymousClass1) obj).values;
        }

        public int hashCode() {
            return this.values;
        }

        public String toString() {
            return "_Selection_Int(value=" + this.values + ')';
        }

        public AnonymousClass1(int i) {
            this.values = i;
        }

        public final int valueOf() {
            return this.values;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnStartTrackingTouch {
        private final String toString;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnStartTrackingTouch) && runAnimators.values((Object) this.toString, (Object) ((OnStartTrackingTouch) obj).toString);
        }

        public int hashCode() {
            return this.toString.hashCode();
        }

        public String toString() {
            return "_Service_Provider_String_(value=" + this.toString + ')';
        }

        public OnStartTrackingTouch(String str) {
            runAnimators.ag$a(str, "value");
            this.toString = str;
        }

        public final String ah$a() {
            return this.toString;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnStopTrackingTouch {
        private final String ag$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnStopTrackingTouch) && runAnimators.values((Object) this.ag$a, (Object) ((OnStopTrackingTouch) obj).ag$a);
        }

        public int hashCode() {
            return this.ag$a.hashCode();
        }

        public String toString() {
            return "_Send_Button_State_String__(value=" + this.ag$a + ')';
        }

        public OnStopTrackingTouch(String str) {
            runAnimators.ag$a(str, "value");
            this.ag$a = str;
        }

        public final String values() {
            return this.ag$a;
        }
    }
}
