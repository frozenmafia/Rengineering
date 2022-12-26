package o;
/* loaded from: classes.dex */
public final class getCoroutineContext {
    private final String ah$a;
    private final String values;

    public getCoroutineContext(String str, String str2) {
        runAnimators.ag$a(str, "accessToken");
        runAnimators.ag$a(str2, "refreshToken");
        this.values = str;
        this.ah$a = str2;
    }

    public final String values() {
        return this.values;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    /* loaded from: classes6.dex */
    public static final class valueOf {
        private String ah$a;
        private String values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof valueOf) {
                valueOf valueof = (valueOf) obj;
                return runAnimators.values((Object) this.values, (Object) valueof.values) && runAnimators.values((Object) this.ah$a, (Object) valueof.ah$a);
            }
            return false;
        }

        public int hashCode() {
            return (this.values.hashCode() * 31) + this.ah$a.hashCode();
        }

        public String toString() {
            String str = this.values;
            String str2 = this.ah$a;
            return "Builder(accessToken=" + str + ", refreshToken=" + str2 + ")";
        }

        public valueOf(String str, String str2) {
            runAnimators.ag$a(str, "accessToken");
            runAnimators.ag$a(str2, "refreshToken");
            this.values = str;
            this.ah$a = str2;
        }

        public final getCoroutineContext valueOf() {
            return new getCoroutineContext(this.values, this.ah$a);
        }
    }
}
