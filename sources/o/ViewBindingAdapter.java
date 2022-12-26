package o;
/* loaded from: classes4.dex */
public final class ViewBindingAdapter {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewBindingAdapter) && runAnimators.values((Object) this.toString, (Object) ((ViewBindingAdapter) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Upi3_Message_String_(value=" + this.toString + ')';
    }

    public final String values() {
        return this.toString;
    }

    /* renamed from: o.ViewBindingAdapter$1  reason: invalid class name */
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
            return "_Utm_referrer_String(value=" + this.toString + ')';
        }

        public final String ag$a() {
            return this.toString;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnViewDetachedFromWindow {
        private final String valueOf;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnViewDetachedFromWindow) && runAnimators.values((Object) this.valueOf, (Object) ((OnViewDetachedFromWindow) obj).valueOf);
        }

        public int hashCode() {
            return this.valueOf.hashCode();
        }

        public String toString() {
            return "_Value_String(value=" + this.valueOf + ')';
        }

        public OnViewDetachedFromWindow(String str) {
            runAnimators.ag$a(str, "value");
            this.valueOf = str;
        }

        public final String values() {
            return this.valueOf;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnViewAttachedToWindow {
        private final boolean ag$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnViewAttachedToWindow) && this.ag$a == ((OnViewAttachedToWindow) obj).ag$a;
        }

        public int hashCode() {
            boolean z = this.ag$a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "_Valid_result_Boolean(value=" + this.ag$a + ')';
        }

        public OnViewAttachedToWindow(boolean z) {
            this.ag$a = z;
        }

        public final boolean ag$a() {
            return this.ag$a;
        }
    }
}
