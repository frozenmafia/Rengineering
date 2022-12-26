package o;
/* loaded from: classes5.dex */
public final class fillData {
    public static boolean valueOf(int i, int i2, double d) {
        return ((double) i) > d * ((double) i2) && i2 < 1073741824;
    }

    public static int ah$a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int values(Object obj) {
        return ah$a(obj == null ? 0 : obj.hashCode());
    }

    public static int ag$a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (d * highestOneBit))) {
            int i2 = highestOneBit << 1;
            if (i2 > 0) {
                return i2;
            }
            return 1073741824;
        }
        return highestOneBit;
    }
}
