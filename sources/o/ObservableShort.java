package o;
/* loaded from: classes4.dex */
public final class ObservableShort {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableShort) && runAnimators.values((Object) this.valueOf, (Object) ((ObservableShort) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Flow_String(value=" + this.valueOf + ')';
    }

    public ObservableShort(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    /* renamed from: o.ObservableShort$1  reason: invalid class name */
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
            return "_Giphy_media_id_String(value=" + this.valueOf + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.valueOf = str;
        }

        public final String valueOf() {
            return this.valueOf;
        }
    }
}
