package o;
/* loaded from: classes4.dex */
public final class RadioGroupBindingAdapter {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RadioGroupBindingAdapter) && runAnimators.values((Object) this.ah$a, (Object) ((RadioGroupBindingAdapter) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Redirect_Url_String_(value=" + this.ah$a + ')';
    }

    public RadioGroupBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String values() {
        return this.ah$a;
    }

    /* renamed from: o.RadioGroupBindingAdapter$1  reason: invalid class name */
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
            return "_Result_clicked_is_contact_String(value=" + this.valueOf + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.valueOf = str;
        }

        public final String ag$a() {
            return this.valueOf;
        }
    }
}
