package com.google.common.primitives;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.math.BigInteger;
import java.util.Comparator;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public final class UnsignedLongs {
    private static long ah$a(long j) {
        return j ^ Long.MIN_VALUE;
    }

    public static int valueOf(long j, long j2) {
        return Longs.ah$a(ah$a(j), ah$a(j2));
    }

    /* loaded from: classes7.dex */
    enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                if (jArr[i] != jArr2[i]) {
                    return UnsignedLongs.valueOf(jArr[i], jArr2[i]);
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    public static long ag$a(long j, long j2) {
        if (j2 < 0) {
            return valueOf(j, j2) < 0 ? 0L : 1L;
        } else if (j >= 0) {
            return j / j2;
        } else {
            long j3 = ((j >>> 1) / j2) << 1;
            return j3 + (valueOf(j - (j3 * j2), j2) < 0 ? 0 : 1);
        }
    }

    public static long toString(long j, long j2) {
        if (j2 < 0) {
            return valueOf(j, j2) < 0 ? j : j - j2;
        } else if (j >= 0) {
            return j % j2;
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            if (valueOf(j3, j2) < 0) {
                j2 = 0;
            }
            return j3 - j2;
        }
    }

    public static long ah$a(String str, int i) {
        markViewHoldersUpdated.toString(str);
        if (str.length() != 0) {
            if (i < 2 || i > 36) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("illegal radix: ");
                sb.append(i);
                throw new NumberFormatException(sb.toString());
            }
            int i2 = toString.ah$a[i];
            long j = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                int digit = Character.digit(str.charAt(i3), i);
                if (digit == -1) {
                    throw new NumberFormatException(str);
                }
                if (i3 > i2 - 1 && toString.ag$a(j, digit, i)) {
                    String valueOf = String.valueOf(str);
                    throw new NumberFormatException(valueOf.length() != 0 ? "Too large for unsigned long: ".concat(valueOf) : new String("Too large for unsigned long: "));
                }
                j = (j * i) + digit;
            }
            return j;
        }
        throw new NumberFormatException("empty string");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class toString {
        static final long[] values = new long[37];
        static final int[] toString = new int[37];
        static final int[] ah$a = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i = 2; i <= 36; i++) {
                long j = i;
                values[i] = UnsignedLongs.ag$a(-1L, j);
                toString[i] = (int) UnsignedLongs.toString(-1L, j);
                ah$a[i] = bigInteger.toString(i).length() - 1;
            }
        }

        static boolean ag$a(long j, int i, int i2) {
            if (j >= 0) {
                long[] jArr = values;
                if (j < jArr[i2]) {
                    return false;
                }
                if (j <= jArr[i2] && i <= toString[i2]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static String values(long j) {
        return ah$a(j, 10);
    }

    public static String ah$a(long j, int i) {
        long ag$a;
        int i2;
        markViewHoldersUpdated.values(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 == 0) {
            return SessionDescription.SUPPORTED_SDP_VERSION;
        }
        if (i3 > 0) {
            return Long.toString(j, i);
        }
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            i2 = 64;
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i4, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            if ((i & 1) == 0) {
                ag$a = (j >>> 1) / (i >>> 1);
            } else {
                ag$a = ag$a(j, i);
            }
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (ag$a * j2)), i);
            i2 = 63;
            for (long j3 = ag$a; j3 > 0; j3 /= j2) {
                i2--;
                cArr[i2] = Character.forDigit((int) (j3 % j2), i);
            }
        }
        return new String(cArr, i2, 64 - i2);
    }
}
