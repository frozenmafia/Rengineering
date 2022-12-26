package o;

import java.util.Objects;
/* loaded from: classes.dex */
public final class discoverAndInitialize {
    static final getWrappedDb<Object, Object> valueOf = new toString();

    public static int toString(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int valueOf(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    public static <T> T ag$a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static boolean values(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> getWrappedDb<T, T> valueOf() {
        return (getWrappedDb<T, T>) valueOf;
    }

    public static int ah$a(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    public static long valueOf(long j, String str) {
        if (j > 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j);
    }

    /* loaded from: classes5.dex */
    static final class toString implements getWrappedDb<Object, Object> {
        toString() {
        }

        @Override // o.getWrappedDb
        public boolean valueOf(Object obj, Object obj2) {
            return discoverAndInitialize.values(obj, obj2);
        }
    }
}
