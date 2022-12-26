package com.google.zxing.pdf417.decoder;

import java.math.BigInteger;
/* loaded from: classes7.dex */
final class DecodedBitStreamParser {
    private static final char[] ag$a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] valueOf = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    private static final BigInteger[] values;

    /* loaded from: classes7.dex */
    enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        values = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf2 = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf2;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = values;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf2);
            i++;
        }
    }
}
