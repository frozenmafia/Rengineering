package o;
/* loaded from: classes7.dex */
public final class setSpanSizeLookup {
    private static final Class<?> ah$a = toString("libcore.io.Memory");
    private static final boolean values;

    setSpanSizeLookup() {
    }

    static {
        values = toString("org.robolectric.Robolectric") != null;
    }

    public static boolean valueOf() {
        return (ah$a == null || values) ? false : true;
    }

    private static <T> Class<T> toString(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
