package o;
/* loaded from: classes7.dex */
public final class writeSerializable<T> {
    private final Object toString;
    public static final toString values = new toString(null);
    private static final writeSerializable$ag$a ah$a = new writeSerializable$ag$a();

    public static int HaptikSDK$a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static <T> Object ag$a(Object obj) {
        return obj;
    }

    public static boolean ah$a(Object obj, Object obj2) {
        return (obj2 instanceof writeSerializable) && runAnimators.values(obj, ((writeSerializable) obj2).values());
    }

    public static final /* synthetic */ writeSerializable valueOf(Object obj) {
        return new writeSerializable(obj);
    }

    public boolean equals(Object obj) {
        return ah$a(this.toString, obj);
    }

    public int hashCode() {
        return HaptikSDK$a(this.toString);
    }

    public final /* synthetic */ Object values() {
        return this.toString;
    }

    private /* synthetic */ writeSerializable(Object obj) {
        this.toString = obj;
    }

    public static final boolean HaptikSDK$c(Object obj) {
        return !(obj instanceof writeSerializable$ag$a);
    }

    public static final boolean ah$b(Object obj) {
        return obj instanceof writeSerializable$ah$a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T values(Object obj) {
        if (obj instanceof writeSerializable$ag$a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T toString(Object obj) {
        if (obj instanceof writeSerializable$ag$a) {
            if (obj instanceof writeSerializable$ah$a) {
                writeSerializable$ah$a writeserializable_ah_a = (writeSerializable$ah$a) obj;
                if (writeserializable_ah_a.ah$a != null) {
                    throw writeserializable_ah_a.ah$a;
                }
            }
            throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
        }
        return obj;
    }

    public static final Throwable ah$a(Object obj) {
        writeSerializable$ah$a writeserializable_ah_a = obj instanceof writeSerializable$ah$a ? (writeSerializable$ah$a) obj : null;
        if (writeserializable_ah_a != null) {
            return writeserializable_ah_a.ah$a;
        }
        return null;
    }

    /* loaded from: classes7.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        public final <E> Object toString(E e) {
            return writeSerializable.ag$a(e);
        }

        public final <E> Object ag$a() {
            return writeSerializable.ag$a(writeSerializable.ah$a);
        }

        public final <E> Object ag$a(Throwable th) {
            return writeSerializable.ag$a(new writeSerializable$ah$a(th));
        }
    }

    public String toString() {
        return invoke(this.toString);
    }

    public static String invoke(Object obj) {
        if (obj instanceof writeSerializable$ah$a) {
            return ((writeSerializable$ah$a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
