package o;
/* loaded from: classes5.dex */
public final class internalSetStateRestorationPolicy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long ah$a(double d) {
        markViewHoldersUpdated.toString(valueOf(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean valueOf(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static double values(double d) {
        markViewHoldersUpdated.values(!Double.isNaN(d));
        return Math.max(d, 0.0d);
    }
}
