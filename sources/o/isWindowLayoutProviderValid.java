package o;
/* loaded from: classes5.dex */
public final class isWindowLayoutProviderValid {
    public static void ag$a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    public static void ag$a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void toString(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    public static void ag$a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void valueOf(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Must be false");
        }
    }

    public static void ah$a(boolean z, String str) {
        if (z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void values(Object[] objArr) {
        values(objArr, "Array must not contain any null objects");
    }

    public static void values(Object[] objArr, String str) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    public static void valueOf(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    public static void ag$a(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void values(String str) {
        throw new IllegalArgumentException(str);
    }
}
