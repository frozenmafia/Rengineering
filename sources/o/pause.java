package o;
/* loaded from: classes.dex */
public interface pause<A> {
    public static final values toString = values.values;

    String toString(A a);

    /* loaded from: classes.dex */
    public static final class values {
        static final /* synthetic */ values values = new values();

        private values() {
        }

        public final pause<Object> valueOf() {
            return C0349values.valueOf;
        }

        /* renamed from: o.pause$values$values  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0349values implements pause<Object> {
            public static final C0349values valueOf = new C0349values();

            private C0349values() {
            }

            @Override // o.pause
            public String toString(Object obj) {
                return String.valueOf(obj);
            }
        }
    }
}
