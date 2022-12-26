package o;
/* loaded from: classes4.dex */
public final class ViewGroupBindingAdapter {
    private final int ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewGroupBindingAdapter) && this.ah$a == ((ViewGroupBindingAdapter) obj).ah$a;
    }

    public int hashCode() {
        return this.ah$a;
    }

    public String toString() {
        return "_Value_Int(value=" + this.ah$a + ')';
    }

    /* renamed from: o.ViewGroupBindingAdapter$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 {
        private final String valueOf;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass2) && runAnimators.values((Object) this.valueOf, (Object) ((AnonymousClass2) obj).valueOf);
        }

        public int hashCode() {
            return this.valueOf.hashCode();
        }

        public String toString() {
            return "_Variant_String(value=" + this.valueOf + ')';
        }

        public AnonymousClass2(String str) {
            runAnimators.ag$a(str, "value");
            this.valueOf = str;
        }

        public final String ah$a() {
            return this.valueOf;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnChildViewRemoved {
        private final String values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnChildViewRemoved) && runAnimators.values((Object) this.values, (Object) ((OnChildViewRemoved) obj).values);
        }

        public int hashCode() {
            return this.values.hashCode();
        }

        public String toString() {
            return "_Visit_utm_campaign_String(value=" + this.values + ')';
        }

        public OnChildViewRemoved(String str) {
            runAnimators.ag$a(str, "value");
            this.values = str;
        }

        public final String valueOf() {
            return this.values;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnAnimationStart {
        private final String ag$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAnimationStart) && runAnimators.values((Object) this.ag$a, (Object) ((OnAnimationStart) obj).ag$a);
        }

        public int hashCode() {
            return this.ag$a.hashCode();
        }

        public String toString() {
            return "_Visit_utm_content_String(value=" + this.ag$a + ')';
        }

        public OnAnimationStart(String str) {
            runAnimators.ag$a(str, "value");
            this.ag$a = str;
        }

        public final String ah$a() {
            return this.ag$a;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnAnimationRepeat {
        private final String ag$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAnimationRepeat) && runAnimators.values((Object) this.ag$a, (Object) ((OnAnimationRepeat) obj).ag$a);
        }

        public int hashCode() {
            return this.ag$a.hashCode();
        }

        public String toString() {
            return "_Visit_utm_medium_String(value=" + this.ag$a + ')';
        }

        public OnAnimationRepeat(String str) {
            runAnimators.ag$a(str, "value");
            this.ag$a = str;
        }

        public final String valueOf() {
            return this.ag$a;
        }
    }

    public ViewGroupBindingAdapter(int i) {
        this.ah$a = i;
    }

    public final int valueOf() {
        return this.ah$a;
    }

    /* renamed from: o.ViewGroupBindingAdapter$1  reason: invalid class name */
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
            return "_Verificationmethod_String(value=" + this.ah$a + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a = str;
        }

        public final String values() {
            return this.ah$a;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnChildViewAdded {
        private final String ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnChildViewAdded) && runAnimators.values((Object) this.ah$a, (Object) ((OnChildViewAdded) obj).ah$a);
        }

        public int hashCode() {
            return this.ah$a.hashCode();
        }

        public String toString() {
            return "_Vicecaptain_In_Teams_String__(value=" + this.ah$a + ')';
        }

        public OnChildViewAdded(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a = str;
        }

        public final String valueOf() {
            return this.ah$a;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnAnimationEnd {
        private final boolean values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAnimationEnd) && this.values == ((OnAnimationEnd) obj).values;
        }

        public int hashCode() {
            boolean z = this.values;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "_View_All_Loaded_Boolean__(value=" + this.values + ')';
        }

        public OnAnimationEnd(boolean z) {
            this.values = z;
        }

        public final boolean ag$a() {
            return this.values;
        }
    }
}
