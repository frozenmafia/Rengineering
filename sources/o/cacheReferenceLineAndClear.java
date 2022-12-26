package o;
/* loaded from: classes5.dex */
public final class cacheReferenceLineAndClear {
    private static final boolean valueOf;
    private static final Class<?> values = ah$a("libcore.io.Memory");

    cacheReferenceLineAndClear() {
    }

    static {
        valueOf = ah$a("org.robolectric.Robolectric") != null;
    }

    public static boolean ah$a() {
        return (values == null || valueOf) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> valueOf() {
        return values;
    }

    private static <T> Class<T> ah$a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
