package o;
/* loaded from: classes7.dex */
public abstract class removeAdapter {

    /* loaded from: classes7.dex */
    public static final class toString {
        private final double ag$a;
        private final double toString;

        private toString(double d, double d2) {
            this.ag$a = d;
            this.toString = d2;
        }

        public removeAdapter valueOf(double d) {
            markViewHoldersUpdated.values(!Double.isNaN(d));
            if (internalSetStateRestorationPolicy.valueOf(d)) {
                return new removeAdapter$ag$a(d, this.toString - (this.ag$a * d));
            }
            return new values(this.ag$a);
        }
    }

    public static removeAdapter values(double d) {
        markViewHoldersUpdated.values(internalSetStateRestorationPolicy.valueOf(d));
        return new values(d);
    }

    public static removeAdapter valueOf(double d) {
        markViewHoldersUpdated.values(internalSetStateRestorationPolicy.valueOf(d));
        return new removeAdapter$ag$a(0.0d, d);
    }

    public static removeAdapter valueOf() {
        return valueOf.toString;
    }

    /* loaded from: classes7.dex */
    static final class values extends removeAdapter {
        removeAdapter ah$a = null;
        final double valueOf;

        values(double d) {
            this.valueOf = d;
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.valueOf));
        }
    }

    /* loaded from: classes7.dex */
    static final class valueOf extends removeAdapter {
        static final valueOf toString = new valueOf();

        public String toString() {
            return "NaN";
        }

        private valueOf() {
        }
    }
}
