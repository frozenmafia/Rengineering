package o;
/* loaded from: classes4.dex */
public final class CompoundButtonBindingAdapter {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompoundButtonBindingAdapter) && runAnimators.values((Object) this.ag$a, (Object) ((CompoundButtonBindingAdapter) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Position_String(value=" + this.ag$a + ')';
    }

    public CompoundButtonBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String valueOf() {
        return this.ag$a;
    }

    /* renamed from: o.CompoundButtonBindingAdapter$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final int valueOf;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && this.valueOf == ((AnonymousClass1) obj).valueOf;
        }

        public int hashCode() {
            return this.valueOf;
        }

        public String toString() {
            return "_Player_Id_Int_(value=" + this.valueOf + ')';
        }

        public AnonymousClass1(int i) {
            this.valueOf = i;
        }

        public final int ah$a() {
            return this.valueOf;
        }
    }
}
