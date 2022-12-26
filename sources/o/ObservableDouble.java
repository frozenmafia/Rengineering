package o;
/* loaded from: classes4.dex */
public final class ObservableDouble {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableDouble) && this.toString == ((ObservableDouble) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "_Current_level_Int(value=" + this.toString + ')';
    }

    /* renamed from: o.ObservableDouble$1  reason: invalid class name */
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
            return "_Device_String(value=" + this.valueOf + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.valueOf = str;
        }

        public final String ah$a() {
            return this.valueOf;
        }
    }

    public ObservableDouble(int i) {
        this.toString = i;
    }

    public final int valueOf() {
        return this.toString;
    }
}
