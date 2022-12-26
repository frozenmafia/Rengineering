package o;
/* loaded from: classes4.dex */
public final class MapChangeRegistry {
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MapChangeRegistry) && this.values == ((MapChangeRegistry) obj).values;
    }

    public int hashCode() {
        boolean z = this.values;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Contest_join_Boolean(value=" + this.values + ')';
    }

    /* renamed from: o.MapChangeRegistry$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final String ag$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && runAnimators.values((Object) this.ag$a, (Object) ((AnonymousClass1) obj).ag$a);
        }

        public int hashCode() {
            return this.ag$a.hashCode();
        }

        public String toString() {
            return "_Contest_Type_String_(value=" + this.ag$a + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.ag$a = str;
        }

        public final String valueOf() {
            return this.ag$a;
        }
    }

    public MapChangeRegistry(boolean z) {
        this.values = z;
    }

    public final boolean values() {
        return this.values;
    }
}
