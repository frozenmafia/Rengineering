package o;

import java.math.RoundingMode;
import o.ConcatAdapter;
/* loaded from: classes5.dex */
public final class onDetachedFromRecyclerView {
    private static final double toString = Math.log(2.0d);
    static final double[] valueOf = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    static double ag$a(double d, RoundingMode roundingMode) {
        if (!internalSetStateRestorationPolicy.valueOf(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AnonymousClass5.valueOf[roundingMode.ordinal()]) {
            case 1:
                ConcatAdapter.Config.ag$a(ag$a(d));
                return d;
            case 2:
                return (d >= 0.0d || ag$a(d)) ? d : ((long) d) - 1;
            case 3:
                return (d <= 0.0d || ag$a(d)) ? d : ((long) d) + 1;
            case 4:
                return d;
            case 5:
                if (ag$a(d)) {
                    return d;
                }
                return ((long) d) + (d > 0.0d ? 1 : -1);
            case 6:
                return Math.rint(d);
            case 7:
                double rint = Math.rint(d);
                return Math.abs(d - rint) == 0.5d ? d + Math.copySign(0.5d, d) : rint;
            case 8:
                double rint2 = Math.rint(d);
                return Math.abs(d - rint2) == 0.5d ? d : rint2;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.onDetachedFromRecyclerView$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            valueOf = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                valueOf[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                valueOf[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                valueOf[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                valueOf[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                valueOf[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                valueOf[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static long values(double d, RoundingMode roundingMode) {
        double ag$a = ag$a(d, roundingMode);
        ConcatAdapter.Config.valueOf(((-9.223372036854776E18d) - ag$a < 1.0d) & (ag$a < 9.223372036854776E18d), d, roundingMode);
        return (long) ag$a;
    }

    public static boolean ag$a(double d) {
        return internalSetStateRestorationPolicy.valueOf(d) && (d == 0.0d || 52 - Long.numberOfTrailingZeros(internalSetStateRestorationPolicy.ah$a(d)) <= Math.getExponent(d));
    }
}
