package o;
/* loaded from: classes7.dex */
public final class setPropagationSpeed {
    public static final int valueOf(int i, int i2) {
        return runAnimators.toString(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final int toString(long j, long j2) {
        return runAnimators.values(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final String toString(long j) {
        return toString(j, 10);
    }

    public static final String toString(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, transformMatrixToLocal.ah$a(i));
            runAnimators.ah$a(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, transformMatrixToLocal.ah$a(i));
        runAnimators.ah$a(l2, "toString(this, checkRadix(radix))");
        sb.append(l2);
        String l3 = Long.toString(j4, transformMatrixToLocal.ah$a(i));
        runAnimators.ah$a(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }
}
