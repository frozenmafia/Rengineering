package o;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* loaded from: classes7.dex */
public final class startListVector<T> {
    final long ag$a;
    final TimeUnit ah$a;
    final T values;

    public startListVector(T t, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(t, "value is null");
        this.values = t;
        this.ag$a = j;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.ah$a = timeUnit;
    }

    public T ag$a() {
        return this.values;
    }

    public long ah$a() {
        return this.ag$a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof startListVector) {
            startListVector startlistvector = (startListVector) obj;
            if (Objects.equals(this.values, startlistvector.values) && this.ag$a == startlistvector.ag$a && Objects.equals(this.ah$a, startlistvector.ah$a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.values.hashCode();
        long j = this.ag$a;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.ag$a + ", unit=" + this.ah$a + ", value=" + this.values + "]";
    }
}
