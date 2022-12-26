package o;
/* loaded from: classes4.dex */
public final class TabHostBindingAdapter {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TabHostBindingAdapter) && runAnimators.values((Object) this.ag$a, (Object) ((TabHostBindingAdapter) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Snapshot_Id_String_(value=" + this.ag$a + ')';
    }

    public TabHostBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String ah$a() {
        return this.ag$a;
    }

    /* renamed from: o.TabHostBindingAdapter$1  reason: invalid class name */
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
            return "_Sortorder_String(value=" + this.valueOf + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.valueOf = str;
        }

        public final String ah$a() {
            return this.valueOf;
        }
    }
}
