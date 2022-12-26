package o;
/* loaded from: classes4.dex */
public final class SearchViewBindingAdapter {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchViewBindingAdapter) && runAnimators.values((Object) this.values, (Object) ((SearchViewBindingAdapter) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Screen_Name_String_(value=" + this.values + ')';
    }

    /* loaded from: classes4.dex */
    public final class OnSuggestionSelect {
        private final int values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSuggestionSelect) && this.values == ((OnSuggestionSelect) obj).values;
        }

        public int hashCode() {
            return this.values;
        }

        public String toString() {
            return "_Section_I_D_Int__(value=" + this.values + ')';
        }

        public OnSuggestionSelect(int i) {
            this.values = i;
        }

        public final int valueOf() {
            return this.values;
        }
    }

    /* renamed from: o.SearchViewBindingAdapter$1  reason: invalid class name */
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
            return "_Screen_String(value=" + this.toString + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.toString = str;
        }

        public final String ah$a() {
            return this.toString;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnSuggestionClick {
        private final int ag$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSuggestionClick) && this.ag$a == ((OnSuggestionClick) obj).ag$a;
        }

        public int hashCode() {
            return this.ag$a;
        }

        public String toString() {
            return "_Section_Id_Int_(value=" + this.ag$a + ')';
        }

        public OnSuggestionClick(int i) {
            this.ag$a = i;
        }

        public final int valueOf() {
            return this.ag$a;
        }
    }

    public SearchViewBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ag$a() {
        return this.values;
    }

    /* renamed from: o.SearchViewBindingAdapter$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 {
        private final boolean toString;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass2) && this.toString == ((AnonymousClass2) obj).toString;
        }

        public int hashCode() {
            boolean z = this.toString;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "_Search_Boolean(value=" + this.toString + ')';
        }

        public AnonymousClass2(boolean z) {
            this.toString = z;
        }

        public final boolean ag$a() {
            return this.toString;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnQueryTextSubmit {
        private final String toString;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnQueryTextSubmit) && runAnimators.values((Object) this.toString, (Object) ((OnQueryTextSubmit) obj).toString);
        }

        public int hashCode() {
            return this.toString.hashCode();
        }

        public String toString() {
            return "_Search_Term_String_(value=" + this.toString + ')';
        }

        public OnQueryTextSubmit(String str) {
            runAnimators.ag$a(str, "value");
            this.toString = str;
        }

        public final String ag$a() {
            return this.toString;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnQueryTextChange {
        private final String valueOf;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnQueryTextChange) && runAnimators.values((Object) this.valueOf, (Object) ((OnQueryTextChange) obj).valueOf);
        }

        public int hashCode() {
            return this.valueOf.hashCode();
        }

        public String toString() {
            return "_Section_Name_String_(value=" + this.valueOf + ')';
        }

        public OnQueryTextChange(String str) {
            runAnimators.ag$a(str, "value");
            this.valueOf = str;
        }

        public final String valueOf() {
            return this.valueOf;
        }
    }
}
