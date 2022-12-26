package o;
/* loaded from: classes4.dex */
public final class ObservableMap {
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableMap) && this.valueOf == ((ObservableMap) obj).valueOf;
    }

    public int hashCode() {
        return this.valueOf;
    }

    public String toString() {
        return "_Error_code_Int(value=" + this.valueOf + ')';
    }

    public ObservableMap(int i) {
        this.valueOf = i;
    }

    public final int valueOf() {
        return this.valueOf;
    }

    /* loaded from: classes4.dex */
    public final class OnMapChangedCallback {
        private final String ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnMapChangedCallback) && runAnimators.values((Object) this.ah$a, (Object) ((OnMapChangedCallback) obj).ah$a);
        }

        public int hashCode() {
            return this.ah$a.hashCode();
        }

        public String toString() {
            return "_Error_Msg_String_(value=" + this.ah$a + ')';
        }

        public OnMapChangedCallback(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a = str;
        }

        public final String valueOf() {
            return this.ah$a;
        }
    }
}
