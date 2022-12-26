package o;
/* loaded from: classes5.dex */
public final class assertNotMainThread {
    public static <T> T valueOf(T t) {
        t.getClass();
        return t;
    }

    public static void toString(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void toString(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void toString(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void values(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void valueOf(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void values(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
