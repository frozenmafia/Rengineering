package o;
/* loaded from: classes4.dex */
public final class NumberPickerBindingAdapter {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NumberPickerBindingAdapter) && runAnimators.values((Object) this.ah$a, (Object) ((NumberPickerBindingAdapter) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Rank_progress_String(value=" + this.ah$a + ')';
    }

    public NumberPickerBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    /* renamed from: o.NumberPickerBindingAdapter$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final String toString;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && runAnimators.values((Object) this.toString, (Object) ((AnonymousClass1) obj).toString);
        }

        public int hashCode() {
            return this.toString.hashCode();
        }

        public String toString() {
            return "_Rank_String(value=" + this.toString + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.toString = str;
        }

        public final String ag$a() {
            return this.toString;
        }
    }
}
