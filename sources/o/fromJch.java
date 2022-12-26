package o;

import android.text.method.DigitsKeyListener;
/* loaded from: classes6.dex */
public final class fromJch extends DigitsKeyListener {
    private static int ah$a = 1;
    private static int toString = 68;
    private static int values;
    private int ag$a;
    private final Integer valueOf;

    public fromJch(Integer num) {
        super(false, true);
        this.valueOf = num;
        this.ag$a = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
        if (((r10 - r12) + r9) <= r16.ag$a) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
        return new android.text.SpannableStringBuilder(r1, r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return "";
     */
    @Override // android.text.method.DigitsKeyListener, android.text.method.NumberKeyListener, android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence filter(java.lang.CharSequence r17, int r18, int r19, android.text.Spanned r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fromJch.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }

    private static String values(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - toString);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
