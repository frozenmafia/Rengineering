package o;

import o.Transition;
/* loaded from: classes7.dex */
public class setupStartEndListeners implements Iterable<Long>, Transition.ArrayListManager {
    public static final setupStartEndListeners$ah$a values = new setupStartEndListeners$ah$a(null);
    private final long ag$a;
    private final long ah$a;
    private final long toString;

    public setupStartEndListeners(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.ah$a = j;
        this.ag$a = setSide.toString(j, j2, j3);
        this.toString = j3;
    }

    public final long values() {
        return this.ah$a;
    }

    public final long ag$a() {
        return this.ag$a;
    }

    @Override // java.lang.Iterable
    /* renamed from: ah$a */
    public calculateMatrix iterator() {
        return new getTransitionAt(this.ah$a, this.ag$a, this.toString);
    }

    public boolean valueOf() {
        int i = (this.toString > 0L ? 1 : (this.toString == 0L ? 0 : -1));
        int i2 = (this.ah$a > this.ag$a ? 1 : (this.ah$a == this.ag$a ? 0 : -1));
        return i <= 0 ? i2 < 0 : i2 > 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof setupStartEndListeners) {
            if (!valueOf() || !((setupStartEndListeners) obj).valueOf()) {
                setupStartEndListeners setupstartendlisteners = (setupStartEndListeners) obj;
                if (this.ah$a != setupstartendlisteners.ah$a || this.ag$a != setupstartendlisteners.ag$a || this.toString != setupstartendlisteners.toString) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (valueOf()) {
            return -1;
        }
        long j = 31;
        long j2 = this.ah$a;
        long j3 = this.ag$a;
        long j4 = this.toString;
        return (int) ((j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)))) + ((j4 >>> 32) ^ j4));
    }

    public String toString() {
        long j;
        int i = (this.toString > 0L ? 1 : (this.toString == 0L ? 0 : -1));
        StringBuilder sb = new StringBuilder();
        sb.append(this.ah$a);
        if (i > 0) {
            sb.append("..");
            sb.append(this.ag$a);
            sb.append(" step ");
            j = this.toString;
        } else {
            sb.append(" downTo ");
            sb.append(this.ag$a);
            sb.append(" step ");
            j = -this.toString;
        }
        sb.append(j);
        return sb.toString();
    }
}
