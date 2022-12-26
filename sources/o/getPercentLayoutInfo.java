package o;

import com.google.android.datatransport.Priority;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class getPercentLayoutInfo<T> extends shouldHandleMeasuredWidthTooSmall<T> {
    private final T ah$a;
    private final Priority valueOf;
    private final Integer values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPercentLayoutInfo(Integer num, T t, Priority priority) {
        this.values = num;
        Objects.requireNonNull(t, "Null payload");
        this.ah$a = t;
        Objects.requireNonNull(priority, "Null priority");
        this.valueOf = priority;
    }

    @Override // o.shouldHandleMeasuredWidthTooSmall
    public Integer values() {
        return this.values;
    }

    @Override // o.shouldHandleMeasuredWidthTooSmall
    public T ag$a() {
        return this.ah$a;
    }

    @Override // o.shouldHandleMeasuredWidthTooSmall
    public Priority valueOf() {
        return this.valueOf;
    }

    public String toString() {
        return "Event{code=" + this.values + ", payload=" + this.ah$a + ", priority=" + this.valueOf + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof shouldHandleMeasuredWidthTooSmall) {
            shouldHandleMeasuredWidthTooSmall shouldhandlemeasuredwidthtoosmall = (shouldHandleMeasuredWidthTooSmall) obj;
            Integer num = this.values;
            if (num != null ? num.equals(shouldhandlemeasuredwidthtoosmall.values()) : shouldhandlemeasuredwidthtoosmall.values() == null) {
                if (this.ah$a.equals(shouldhandlemeasuredwidthtoosmall.ag$a()) && this.valueOf.equals(shouldhandlemeasuredwidthtoosmall.valueOf())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.values;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.ah$a.hashCode()) * 1000003) ^ this.valueOf.hashCode();
    }
}
