package o;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class onRefresh<T> {
    static final onRefresh<Object> valueOf = new onRefresh<>(null);
    final Object values;

    private onRefresh(Object obj) {
        this.values = obj;
    }

    public boolean valueOf() {
        return NotificationLite.isError(this.values);
    }

    public Throwable ag$a() {
        Object obj = this.values;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof onRefresh) {
            return Objects.equals(this.values, ((onRefresh) obj).values);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.values;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.values;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + NotificationLite.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.values + "]";
    }

    public static <T> onRefresh<T> ah$a() {
        return (onRefresh<T>) valueOf;
    }
}
