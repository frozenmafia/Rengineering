package com.google.ads.interactivemedia.v3.internal;

import java.util.TimeZone;
/* loaded from: classes4.dex */
public final class bms {
    private static final TimeZone a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5 A[Catch: IllegalArgumentException -> 0x01d3, NumberFormatException -> 0x01d5, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d7, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d7, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0074, B:25:0x007a, B:29:0x0084, B:34:0x0094, B:36:0x009c, B:37:0x00a0, B:39:0x00a6, B:44:0x00b3, B:46:0x00bd, B:57:0x00df, B:59:0x00e5, B:61:0x00ec, B:85:0x019a, B:66:0x00f8, B:67:0x0113, B:68:0x0114, B:70:0x011e, B:71:0x012f, B:73:0x013c, B:76:0x0145, B:78:0x0164, B:81:0x0173, B:82:0x0195, B:84:0x0198, B:87:0x01cb, B:88:0x01d2, B:50:0x00cd, B:51:0x00d0, B:45:0x00b8), top: B:104:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb A[Catch: IllegalArgumentException -> 0x01d3, NumberFormatException -> 0x01d5, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d7, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d7, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0074, B:25:0x007a, B:29:0x0084, B:34:0x0094, B:36:0x009c, B:37:0x00a0, B:39:0x00a6, B:44:0x00b3, B:46:0x00bd, B:57:0x00df, B:59:0x00e5, B:61:0x00ec, B:85:0x019a, B:66:0x00f8, B:67:0x0113, B:68:0x0114, B:70:0x011e, B:71:0x012f, B:73:0x013c, B:76:0x0145, B:78:0x0164, B:81:0x0173, B:82:0x0195, B:84:0x0198, B:87:0x01cb, B:88:0x01d2, B:50:0x00cd, B:51:0x00d0, B:45:0x00b8), top: B:104:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date a(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bms.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int b(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i, i2))));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i, i2))));
            }
            i3 = (i3 * 10) - digit2;
            i4++;
        }
        return -i3;
    }

    private static boolean c(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }
}
