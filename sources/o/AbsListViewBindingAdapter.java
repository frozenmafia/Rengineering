package o;
/* loaded from: classes4.dex */
public final class AbsListViewBindingAdapter {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbsListViewBindingAdapter) && runAnimators.values((Object) this.toString, (Object) ((AbsListViewBindingAdapter) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Notificationdeeplink_String(value=" + this.toString + ')';
    }

    /* renamed from: o.AbsListViewBindingAdapter$1  reason: invalid class name */
    /* loaded from: classes4.dex */
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
            return "_Number_Of_Winners_Int__(value=" + this.values + ')';
        }

        public AnonymousClass1(int i) {
            this.values = i;
        }

        public final int ag$a() {
            return this.values;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnScrollStateChanged {
        private final boolean ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnScrollStateChanged) && this.ah$a == ((OnScrollStateChanged) obj).ah$a;
        }

        public int hashCode() {
            boolean z = this.ah$a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "_Offer_Selected_Boolean_(value=" + this.ah$a + ')';
        }

        public OnScrollStateChanged(boolean z) {
            this.ah$a = z;
        }

        public final boolean valueOf() {
            return this.ah$a;
        }
    }

    public AbsListViewBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String ag$a() {
        return this.toString;
    }

    /* loaded from: classes4.dex */
    public final class OnScroll {
        private final String ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnScroll) && runAnimators.values((Object) this.ah$a, (Object) ((OnScroll) obj).ah$a);
        }

        public int hashCode() {
            return this.ah$a.hashCode();
        }

        public String toString() {
            return "_Offer_List_String_(value=" + this.ah$a + ')';
        }

        public OnScroll(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a = str;
        }

        public final String valueOf() {
            return this.ah$a;
        }
    }
}
