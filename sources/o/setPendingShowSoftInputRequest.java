package o;

import java.util.Objects;
/* loaded from: classes7.dex */
public final class setPendingShowSoftInputRequest {
    public static <T> T values(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static <T> void toString(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }
}
