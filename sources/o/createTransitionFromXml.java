package o;
/* loaded from: classes5.dex */
public class createTransitionFromXml extends inflateTransition {
    public static final int valueOf(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static final long ag$a(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    public static final int values(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }
}
