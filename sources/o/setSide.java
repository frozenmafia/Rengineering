package o;
/* loaded from: classes5.dex */
public final class setSide {
    private static final int values(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    private static final long ag$a(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    private static final int toString(int i, int i2, int i3) {
        return values(values(i, i3) - values(i2, i3), i3);
    }

    private static final long values(long j, long j2, long j3) {
        return ag$a(ag$a(j, j3) - ag$a(j2, j3), j3);
    }

    public static final int ah$a(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - toString(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + toString(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final long toString(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            return j >= j2 ? j2 : j2 - values(j2, j, j3);
        } else if (i < 0) {
            return j <= j2 ? j2 : j2 + values(j, j2, -j3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
