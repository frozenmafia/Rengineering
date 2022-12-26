package o;
/* loaded from: classes.dex */
public final class ObservableLong {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableLong) && runAnimators.values((Object) this.ah$a, (Object) ((ObservableLong) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Event_String(value=" + this.ah$a + ')';
    }

    /* renamed from: o.ObservableLong$1  reason: invalid class name */
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
            return "_Error_message_String(value=" + this.valueOf + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.valueOf = str;
        }

        public final String ah$a() {
            return this.valueOf;
        }
    }

    public final String values() {
        return this.ah$a;
    }
}
