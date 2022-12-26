package o;

import io.reactivex.internal.util.NotificationLite;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class callback<T> {
    static final callback<Object> ah$a = new callback<>(null);
    final Object ag$a;

    private callback(Object obj) {
        this.ag$a = obj;
    }

    public boolean ah$a() {
        return NotificationLite.isError(this.ag$a);
    }

    public Throwable values() {
        Object obj = this.ag$a;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof callback) {
            return discoverAndInitialize.values(this.ag$a, ((callback) obj).ag$a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.ag$a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.ag$a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + NotificationLite.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.ag$a + "]";
    }

    public static <T> callback<T> toString(T t) {
        Objects.requireNonNull(t, "value is null");
        return new callback<>(t);
    }

    public static <T> callback<T> toString(Throwable th) {
        Objects.requireNonNull(th, "error is null");
        return new callback<>(NotificationLite.error(th));
    }

    public static <T> callback<T> ag$a() {
        return (callback<T>) ah$a;
    }
}
