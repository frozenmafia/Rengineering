package o;

import java.util.TimeZone;
/* loaded from: classes5.dex */
public class getGapForSpan {
    private static final TimeZone toString = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b9, NumberFormatException -> 0x01bb, IndexOutOfBoundsException -> 0x01bd, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b9, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:47:0x00c6, B:49:0x00cc, B:51:0x00d3, B:75:0x0180, B:55:0x00dd, B:56:0x00f8, B:57:0x00f9, B:61:0x0115, B:63:0x0122, B:66:0x012b, B:68:0x014a, B:71:0x0159, B:72:0x017b, B:74:0x017e, B:60:0x0104, B:77:0x01b1, B:78:0x01b8, B:40:0x00b0, B:41:0x00b3), top: B:94:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b9, NumberFormatException -> 0x01bb, IndexOutOfBoundsException -> 0x01bd, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b9, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:47:0x00c6, B:49:0x00cc, B:51:0x00d3, B:75:0x0180, B:55:0x00dd, B:56:0x00f8, B:57:0x00f9, B:61:0x0115, B:63:0x0122, B:66:0x012b, B:68:0x014a, B:71:0x0159, B:72:0x017b, B:74:0x017e, B:60:0x0104, B:77:0x01b1, B:78:0x01b8, B:40:0x00b0, B:41:0x00b3), top: B:94:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date values(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getGapForSpan.values(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean values(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int ah$a(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4++;
        }
        return -i3;
    }

    private static int toString(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
