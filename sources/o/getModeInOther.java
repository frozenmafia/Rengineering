package o;
/* loaded from: classes5.dex */
public final class getModeInOther {
    public static void values(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T values(T t) {
        t.getClass();
        return t;
    }

    public static void ag$a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
