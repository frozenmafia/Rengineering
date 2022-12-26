package o;

import o.Visibility;
/* loaded from: classes5.dex */
public final class access$getUNKNOWN$cp {
    private static final String[] ag$a;
    private static final byte[] valueOf;

    private static final char ah$a(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }

    static {
        String[] strArr = new String[93];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            char ah$a = ah$a(i2 >> 12);
            char ah$a2 = ah$a(i2 >> 8);
            char ah$a3 = ah$a(i2 >> 4);
            char ah$a4 = ah$a(i2);
            strArr[i2] = "\\u" + ah$a + ah$a2 + ah$a3 + ah$a4;
            if (i3 > 31) {
                break;
            }
            i2 = i3;
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        ag$a = strArr;
        byte[] bArr = new byte[93];
        while (true) {
            int i4 = i + 1;
            bArr[i] = 1;
            if (i4 > 31) {
                bArr[34] = (byte) 34;
                bArr[92] = (byte) 92;
                bArr[9] = (byte) 116;
                bArr[8] = (byte) 98;
                bArr[10] = (byte) 110;
                bArr[13] = (byte) 114;
                bArr[12] = (byte) 102;
                valueOf = bArr;
                return;
            }
            i = i4;
        }
    }

    public static final void ag$a(StringBuilder sb, String str) {
        runAnimators.ag$a(sb, "<this>");
        runAnimators.ag$a(str, "value");
        sb.append('\"');
        int length = str.length() - 1;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                char charAt = str.charAt(i);
                String[] strArr = ag$a;
                if (charAt < strArr.length && strArr[charAt] != null) {
                    sb.append((CharSequence) str, i2, i);
                    sb.append(strArr[charAt]);
                    i2 = i3;
                }
                if (i3 > length) {
                    break;
                }
                i = i3;
            }
            i = i2;
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final Boolean valueOf(String str) {
        runAnimators.ag$a(str, "<this>");
        if (Visibility.Mode.toString(str, "true", true)) {
            return true;
        }
        return Visibility.Mode.toString(str, com.facebook.hermes.intl.Constants.CASEFIRST_FALSE, true) ? false : null;
    }
}
