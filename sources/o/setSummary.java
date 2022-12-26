package o;
/* loaded from: classes7.dex */
public final class setSummary {
    private static final setSummary ah$a = new valueOf().values();
    private final long toString;
    private final long values;

    setSummary(long j, long j2) {
        this.values = j;
        this.toString = j2;
    }

    public static valueOf ag$a() {
        return new valueOf();
    }

    public long values() {
        return this.values;
    }

    public long valueOf() {
        return this.toString;
    }

    /* loaded from: classes7.dex */
    public static final class valueOf {
        private long toString = 0;
        private long ah$a = 0;

        valueOf() {
        }

        public setSummary values() {
            return new setSummary(this.toString, this.ah$a);
        }

        public valueOf toString(long j) {
            this.toString = j;
            return this;
        }

        public valueOf valueOf(long j) {
            this.ah$a = j;
            return this;
        }
    }
}
