package o;

import com.facebook.soloader.MinElf;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getDeclaredMethods {
    private static Map<Integer, List<Integer>> HaptikSDK$b = null;
    private static final int ag$a = 3;
    private static final int ah$a = 6;
    private static List<Integer> ah$b = null;
    private static boolean toString = false;
    private static byte[] valueOf = null;
    private static final int values = 3;

    public static String[] values(String str, onRequery onrequery) throws IOException {
        String[] getdeclaredmethods;
        return (HaptikSDK$b == null || (getdeclaredmethods = toString(str)) == null) ? MinElf.valueOf(onrequery) : getdeclaredmethods;
    }

    private static boolean values(String str, int i) {
        int i2;
        int i3 = values;
        while (true) {
            int length = str.length();
            i2 = ag$a;
            if (i3 >= length - i2 || i >= valueOf.length || (str.codePointAt(i3) & 255) != valueOf[i]) {
                break;
            }
            i3++;
            i++;
        }
        return i3 == str.length() - i2;
    }

    private static int ah$a(String str) {
        int i = 5381;
        for (int i2 = values; i2 < str.length() - ag$a; i2++) {
            i = str.codePointAt(i2) + (i << 5) + i;
        }
        return i;
    }

    private static int valueOf(String str) {
        List<Integer> list = HaptikSDK$b.get(Integer.valueOf(ah$a(str)));
        if (list == null) {
            return -1;
        }
        for (Integer num : list) {
            int intValue = num.intValue();
            if (values(str, intValue)) {
                return intValue;
            }
        }
        return -1;
    }

    private static String valueOf(int i) {
        if (i >= ah$b.size()) {
            return null;
        }
        int intValue = ah$b.get(i).intValue();
        int i2 = intValue;
        while (true) {
            byte[] bArr = valueOf;
            if (i2 >= bArr.length || bArr[i2] <= 32) {
                break;
            }
            i2++;
        }
        int i3 = (i2 - intValue) + ah$a;
        char[] cArr = new char[i3];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i4 = 0; i4 < i3 - ah$a; i4++) {
            cArr[values + i4] = (char) valueOf[intValue + i4];
        }
        cArr[i3 - 3] = '.';
        cArr[i3 - 2] = 's';
        cArr[i3 - 1] = 'o';
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String[] ag$a(int r6, int r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r6 = r6 + r7
            int r7 = o.getDeclaredMethods.ah$a
            int r6 = r6 - r7
            r7 = 0
            r1 = 0
            r2 = 0
        Lc:
            byte[] r3 = o.getDeclaredMethods.valueOf
            int r4 = r3.length
            r5 = 0
            if (r6 >= r4) goto L3e
            r3 = r3[r6]
            r4 = 10
            if (r3 == r4) goto L3e
            r4 = 32
            if (r3 != r4) goto L2b
            if (r1 == 0) goto L3a
            java.lang.String r1 = valueOf(r2)
            if (r1 != 0) goto L25
            return r5
        L25:
            r0.add(r1)
            r1 = 0
            r2 = 0
            goto L3a
        L2b:
            r1 = 48
            if (r3 < r1) goto L3d
            r1 = 57
            if (r3 <= r1) goto L34
            goto L3d
        L34:
            int r2 = r2 * 10
            int r3 = r3 + (-48)
            int r2 = r2 + r3
            r1 = 1
        L3a:
            int r6 = r6 + 1
            goto Lc
        L3d:
            return r5
        L3e:
            if (r1 == 0) goto L4a
            java.lang.String r6 = valueOf(r2)
            if (r6 != 0) goto L47
            return r5
        L47:
            r0.add(r6)
        L4a:
            int r6 = r0.size()
            if (r6 != 0) goto L51
            return r5
        L51:
            int r6 = r0.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDeclaredMethods.ag$a(int, int):java.lang.String[]");
    }

    static String[] toString(String str) {
        int valueOf2;
        if (toString && str.length() > ah$a && (valueOf2 = valueOf(str)) != -1) {
            return ag$a(valueOf2, str.length());
        }
        return null;
    }
}
