package o;
/* loaded from: classes5.dex */
public final class markViewHoldersUpdated {
    public static void values(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void toString(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void values(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(offsetPositionsForMove.valueOf(str, objArr));
        }
    }

    public static void ah$a(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(offsetPositionsForMove.valueOf(str, Character.valueOf(c)));
        }
    }

    public static void values(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(offsetPositionsForMove.valueOf(str, Integer.valueOf(i)));
        }
    }

    public static void ag$a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(offsetPositionsForMove.valueOf(str, Long.valueOf(j)));
        }
    }

    public static void toString(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(offsetPositionsForMove.valueOf(str, obj));
        }
    }

    public static void ag$a(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(offsetPositionsForMove.valueOf(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void ag$a(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new IllegalArgumentException(offsetPositionsForMove.valueOf(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static void ah$a(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(offsetPositionsForMove.valueOf(str, Long.valueOf(j), obj));
        }
    }

    public static void valueOf(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(offsetPositionsForMove.valueOf(str, obj, obj2));
        }
    }

    public static void ah$a(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalArgumentException(offsetPositionsForMove.valueOf(str, obj, obj2, obj3, obj4));
        }
    }

    public static void ag$a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void ah$a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void valueOf(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(offsetPositionsForMove.valueOf(str, Integer.valueOf(i)));
        }
    }

    public static void ah$a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(offsetPositionsForMove.valueOf(str, Long.valueOf(j)));
        }
    }

    public static void ah$a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(offsetPositionsForMove.valueOf(str, obj));
        }
    }

    public static void toString(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(offsetPositionsForMove.valueOf(str, obj, obj2));
        }
    }

    public static <T> T toString(T t) {
        t.getClass();
        return t;
    }

    public static <T> T valueOf(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T toString(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(offsetPositionsForMove.valueOf(str, obj));
    }

    public static int toString(int i, int i2) {
        return ah$a(i, i2, "index");
    }

    public static int ah$a(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(valueOf(i, i2, str));
        }
        return i;
    }

    private static String valueOf(int i, int i2, String str) {
        if (i < 0) {
            return offsetPositionsForMove.valueOf("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return offsetPositionsForMove.valueOf("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int ag$a(int i, int i2) {
        return toString(i, i2, "index");
    }

    public static int toString(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(ag$a(i, i2, str));
        }
        return i;
    }

    private static String ag$a(int i, int i2, String str) {
        if (i < 0) {
            return offsetPositionsForMove.valueOf("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return offsetPositionsForMove.valueOf("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void ag$a(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(ah$a(i, i2, i3));
        }
    }

    private static String ah$a(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return ag$a(i, i3, "start index");
        }
        return (i2 < 0 || i2 > i3) ? ag$a(i2, i3, "end index") : offsetPositionsForMove.valueOf("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }
}
