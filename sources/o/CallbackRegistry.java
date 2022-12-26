package o;
/* loaded from: classes4.dex */
public final class CallbackRegistry {
    private final int ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallbackRegistry) && this.ag$a == ((CallbackRegistry) obj).ag$a;
    }

    public int hashCode() {
        return this.ag$a;
    }

    public String toString() {
        return "_Amount_To_Add_Int__(value=" + this.ag$a + ')';
    }

    public CallbackRegistry(int i) {
        this.ag$a = i;
    }

    public final int valueOf() {
        return this.ag$a;
    }

    /* loaded from: classes4.dex */
    public final class NotifierCallback {
        private final String toString;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotifierCallback) && runAnimators.values((Object) this.toString, (Object) ((NotifierCallback) obj).toString);
        }

        public int hashCode() {
            return this.toString.hashCode();
        }

        public String toString() {
            return "_Button_String(value=" + this.toString + ')';
        }

        public NotifierCallback(String str) {
            runAnimators.ag$a(str, "value");
            this.toString = str;
        }

        public final String ag$a() {
            return this.toString;
        }
    }
}
