package o;
/* loaded from: classes3.dex */
public abstract class instantiateProvider {
    public /* synthetic */ instantiateProvider(getTargetTypes gettargettypes) {
        this();
    }

    private instantiateProvider() {
    }

    /* loaded from: classes3.dex */
    public static abstract class values extends instantiateProvider {
        private final kotlin.Pair<Integer, Integer> valueOf;

        public /* synthetic */ values(kotlin.Pair pair, getTargetTypes gettargettypes) {
            this(pair);
        }

        private values(kotlin.Pair<Integer, Integer> pair) {
            super(null);
            this.valueOf = pair;
        }

        public final kotlin.Pair<Integer, Integer> values() {
            return this.valueOf;
        }
    }

    /* loaded from: classes3.dex */
    public static final class valueOf extends instantiateProvider {
        public static final valueOf toString = new valueOf();

        private valueOf() {
            super(null);
        }
    }
}
