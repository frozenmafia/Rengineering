package o;

import com.google.android.exoplayer2.C;
import o.Visibility;
/* loaded from: classes.dex */
public class getViewVisibility extends WindowIdApi14 {
    public static final Integer toString(String str) {
        runAnimators.ag$a(str, "<this>");
        return Visibility.Mode.valueOf(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer valueOf(java.lang.String r10, int r11) {
        /*
            java.lang.String r0 = "<this>"
            o.runAnimators.ag$a(r10, r0)
            o.transformMatrixToLocal.ah$a(r11)
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r2 = 0
            char r3 = r10.charAt(r2)
            r4 = 48
            int r4 = o.runAnimators.toString(r3, r4)
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r6 = 1
            if (r4 >= 0) goto L33
            if (r0 != r6) goto L24
            return r1
        L24:
            r4 = 45
            if (r3 != r4) goto L2c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            goto L35
        L2c:
            r4 = 43
            if (r3 != r4) goto L32
            r3 = 1
            goto L34
        L32:
            return r1
        L33:
            r3 = 0
        L34:
            r6 = 0
        L35:
            r4 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L3b:
            if (r3 >= r0) goto L5c
            char r8 = r10.charAt(r3)
            int r8 = o.transformMatrixToLocal.toString(r8, r11)
            if (r8 >= 0) goto L48
            return r1
        L48:
            if (r2 >= r7) goto L51
            if (r7 != r4) goto L50
            int r7 = r5 / r11
            if (r2 >= r7) goto L51
        L50:
            return r1
        L51:
            int r2 = r2 * r11
            int r9 = r5 + r8
            if (r2 >= r9) goto L58
            return r1
        L58:
            int r2 = r2 - r8
            int r3 = r3 + 1
            goto L3b
        L5c:
            if (r6 == 0) goto L63
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            goto L68
        L63:
            int r10 = -r2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
        L68:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getViewVisibility.valueOf(java.lang.String, int):java.lang.Integer");
    }

    public static final Long ah$a(String str) {
        runAnimators.ag$a(str, "<this>");
        return Visibility.Mode.toString(str, 10);
    }

    public static final Long toString(String str, int i) {
        runAnimators.ag$a(str, "<this>");
        transformMatrixToLocal.ah$a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char charAt = str.charAt(0);
        int runanimators = runAnimators.toString(charAt, 48);
        long j = C.TIME_UNSET;
        int i2 = 1;
        if (runanimators >= 0) {
            i2 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            }
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int transformmatrixtolocal = transformMatrixToLocal.toString(str.charAt(i2), i);
            if (transformmatrixtolocal < 0) {
                return null;
            }
            if (j2 < j4) {
                if (j4 == j3) {
                    j4 = j / i;
                    if (j2 < j4) {
                    }
                }
                return null;
            }
            long j5 = j2 * i;
            long j6 = transformmatrixtolocal;
            if (j5 < j + j6) {
                return null;
            }
            j2 = j5 - j6;
            i2++;
            j3 = -256204778801521550L;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
