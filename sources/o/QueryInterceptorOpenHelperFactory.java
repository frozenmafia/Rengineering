package o;

import java.util.Arrays;
/* loaded from: classes7.dex */
public final class QueryInterceptorOpenHelperFactory {
    static int ah$a(int i, int i2) {
        return (int) ((i - i2) >>> 63);
    }

    static int toString(int i, int i2) {
        return (int) ((i2 - i) >>> 63);
    }

    static int valueOf(int i, int i2) {
        int i3 = i ^ i2;
        return ((i3 - 1) & (~i3)) >>> 63;
    }

    static int values(int i, int i2, int i3) {
        return ((i - 1) & (i3 ^ i2)) ^ i2;
    }

    QueryInterceptorOpenHelperFactory() {
    }

    static int valueOf(int i, boolean z) {
        if (i == 0) {
            return 0;
        }
        if (z) {
            int i2 = (i / 3) << 2;
            int i3 = i % 3;
            return i3 == 0 ? i2 : i2 + i3 + 1;
        }
        return (((i - 1) / 3) + 1) << 2;
    }

    static byte toString(int i) {
        int ah$a = ah$a(i, 26);
        int queryInterceptorOpenHelperFactory = toString(i, 25);
        int ah$a2 = ah$a(i, 52);
        int queryInterceptorOpenHelperFactory2 = toString(i, 51);
        int ah$a3 = ah$a(i, 62);
        int valueOf = valueOf(i, 62);
        int valueOf2 = valueOf(i, 63);
        int values = values(ah$a, i + 0 + 65, 0);
        int values2 = values(queryInterceptorOpenHelperFactory & ah$a2, (i - 26) + 97, 0);
        return (byte) (values(queryInterceptorOpenHelperFactory2 & ah$a3, (i - 52) + 48, 0) | values | values2 | values(valueOf, 43, 0) | values(valueOf2, 47, 0));
    }

    static byte values(int i) {
        int ah$a = ah$a(i, 26);
        int queryInterceptorOpenHelperFactory = toString(i, 25);
        int ah$a2 = ah$a(i, 52);
        int queryInterceptorOpenHelperFactory2 = toString(i, 51);
        int ah$a3 = ah$a(i, 62);
        int valueOf = valueOf(i, 62);
        int valueOf2 = valueOf(i, 63);
        int values = values(ah$a, i + 0 + 65, 0);
        int values2 = values(queryInterceptorOpenHelperFactory & ah$a2, (i - 26) + 97, 0);
        return (byte) (values(queryInterceptorOpenHelperFactory2 & ah$a3, (i - 52) + 48, 0) | values | values2 | values(valueOf, 45, 0) | values(valueOf2, 95, 0));
    }

    static int values(byte b2) {
        int queryInterceptorOpenHelperFactory = toString(b2, 64) & ah$a(b2, 91);
        int queryInterceptorOpenHelperFactory2 = toString(b2, 96) & ah$a(b2, 123);
        int queryInterceptorOpenHelperFactory3 = toString(b2, 47) & ah$a(b2, 58);
        int valueOf = valueOf(b2, 45) | valueOf(b2, 43);
        int valueOf2 = valueOf(b2, 47) | valueOf(b2, 95);
        int values = values(queryInterceptorOpenHelperFactory, (b2 - 65) + 0, 0);
        int values2 = values(queryInterceptorOpenHelperFactory2, (b2 - 97) + 26, 0);
        int values3 = values(queryInterceptorOpenHelperFactory3, (b2 - 48) + 52, 0);
        return values3 | values | values2 | values(valueOf, 62, 0) | values(valueOf2, 63, 0) | values(queryInterceptorOpenHelperFactory | queryInterceptorOpenHelperFactory2 | queryInterceptorOpenHelperFactory3 | valueOf | valueOf2, 0, -1);
    }

    public static String toString(byte[] bArr, boolean z) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return "";
        }
        int i = (length / 3) * 3;
        int valueOf = valueOf(length, z);
        byte[] bArr2 = new byte[valueOf];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            if (z) {
                int i7 = i3 + 1;
                bArr2[i3] = values((i6 >>> 18) & 63);
                int i8 = i7 + 1;
                bArr2[i7] = values((i6 >>> 12) & 63);
                int i9 = i8 + 1;
                bArr2[i8] = values((i6 >>> 6) & 63);
                i3 = i9 + 1;
                bArr2[i9] = values(i6 & 63);
            } else {
                int i10 = i3 + 1;
                bArr2[i3] = toString((i6 >>> 18) & 63);
                int i11 = i10 + 1;
                bArr2[i10] = toString((i6 >>> 12) & 63);
                int i12 = i11 + 1;
                bArr2[i11] = toString((i6 >>> 6) & 63);
                i3 = i12 + 1;
                bArr2[i12] = toString(i6 & 63);
            }
            i2 = i5 + 1;
        }
        int i13 = length - i;
        if (i13 > 0) {
            int i14 = ((bArr[i] & 255) << 10) | (i13 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
            if (!z) {
                bArr2[valueOf - 4] = toString(i14 >> 12);
                bArr2[valueOf - 3] = toString((i14 >>> 6) & 63);
                bArr2[valueOf - 2] = i13 == 2 ? toString(i14 & 63) : (byte) 61;
                bArr2[valueOf - 1] = 61;
            } else if (i13 == 2) {
                bArr2[valueOf - 3] = values(i14 >> 12);
                bArr2[valueOf - 2] = values((i14 >>> 6) & 63);
                bArr2[valueOf - 1] = values(i14 & 63);
            } else {
                bArr2[valueOf - 2] = values(i14 >> 12);
                bArr2[valueOf - 1] = values((i14 >>> 6) & 63);
            }
        }
        return new String(bArr2, Relation.valueOf);
    }

    public static byte[] toString(String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(Relation.valueOf);
        int length = bytes.length;
        byte[] bArr = new byte[toString((length * 6) >> 3)];
        int i = 0;
        int i2 = 0;
        while (i < bytes.length) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < 4 && i < length) {
                int values = values(bytes[i]);
                if (values >= 0) {
                    i4 |= values << (18 - (i3 * 6));
                    i3++;
                }
                i++;
            }
            if (i3 >= 2) {
                int i5 = i2 + 1;
                bArr[i2] = (byte) (i4 >> 16);
                if (i3 >= 3) {
                    i2 = i5 + 1;
                    bArr[i5] = (byte) (i4 >> 8);
                    if (i3 >= 4) {
                        bArr[i2] = (byte) i4;
                        i2++;
                    }
                } else {
                    i2 = i5;
                }
            }
        }
        return Arrays.copyOf(bArr, i2);
    }

    private static int toString(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalArgumentException(j + " cannot be cast to int without changing its value.");
    }
}
