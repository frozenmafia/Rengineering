package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bsf {
    private static final bsc a;

    static {
        if (bsb.B() && bsb.C()) {
            int i = bnl.a;
        }
        a = new bsd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int c(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m(b2, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return l(b2, bArr[i]);
        }
        return k(b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.a(charSequence, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new bse(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i, byte[] bArr, int i2, int i3) {
        return a.b(i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(ByteBuffer byteBuffer, int i, int i2) throws bpt {
        bsc bscVar = a;
        if (byteBuffer.hasArray()) {
            return bscVar.c(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return byteBuffer.isDirect() ? bscVar.d(byteBuffer, i, i2) : bsc.f(byteBuffer, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(byte[] bArr, int i, int i2) throws bpt {
        return a.c(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(byte[] bArr) {
        return a.e(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(byte[] bArr, int i, int i2) {
        return a.e(bArr, i, i2);
    }

    private static int k(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
