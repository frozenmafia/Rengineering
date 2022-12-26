package o;
/* loaded from: classes4.dex */
public class enqueueRemove {
    public static int ag$a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
        }
        return ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24) | (16777215 & i);
    }

    public static int toString(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    public static int ag$a(double d, double d2, double d3, double d4) {
        return (values(d) << 16) | (values(d4 * 255.0d) << 24) | (values(d2) << 8) | values(d3);
    }

    private static int values(double d) {
        return Math.max(0, Math.min(255, (int) Math.round(d)));
    }
}
