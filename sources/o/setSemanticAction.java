package o;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import o.addExtras;
/* loaded from: classes3.dex */
public final class setSemanticAction {
    private static int HaptikSDK$a = 0;
    private static int HaptikSDK$c = 1;
    private static int ag$a = 0;
    private static char ah$b = 0;
    private static long toString = 6050731602461519205L;
    private final addExtras.toString ah$a;
    private final String valueOf;
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof setSemanticAction)) {
                int i = HaptikSDK$a + 69;
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                return false;
            }
            setSemanticAction setsemanticaction = (setSemanticAction) obj;
            if ((this.values != setsemanticaction.values ? ')' : 'X') != 'X') {
                return false;
            }
            if (!runAnimators.values((Object) this.valueOf, (Object) setsemanticaction.valueOf)) {
                int i3 = HaptikSDK$c + 53;
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            try {
                if (!runAnimators.values(this.ah$a, setsemanticaction.ah$a)) {
                    int i5 = HaptikSDK$c + 105;
                    HaptikSDK$a = i5 % 128;
                    return (i5 % 2 != 0 ? '&' : '1') != '1';
                }
                int i6 = HaptikSDK$c + 85;
                HaptikSDK$a = i6 % 128;
                int i7 = i6 % 2;
                return true;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        if ((r3 == null ? 'P' : 'H') != 'H') goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        if ((r3 == null ? 19 : '7') != 19) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        r2 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        r0 = (((r0 * 31) + r1) * 31) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        r1 = o.setSemanticAction.HaptikSDK$c + 125;
        o.setSemanticAction.HaptikSDK$a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
        r1 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            int r0 = o.setSemanticAction.HaptikSDK$c
            int r0 = r0 + 89
            int r1 = r0 % 128
            o.setSemanticAction.HaptikSDK$a = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 == r1) goto L30
            int r0 = r6.values     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = r6.valueOf     // Catch: java.lang.Exception -> L2e
            int r1 = r1.hashCode()     // Catch: java.lang.Exception -> L2e
            o.addExtras$toString r3 = r6.ah$a     // Catch: java.lang.Exception -> L2e
            r4 = 33
            int r4 = r4 / r2
            r4 = 72
            if (r3 != 0) goto L27
            r5 = 80
            goto L29
        L27:
            r5 = 72
        L29:
            if (r5 == r4) goto L45
            goto L49
        L2c:
            r0 = move-exception
            throw r0
        L2e:
            r0 = move-exception
            throw r0
        L30:
            int r0 = r6.values
            java.lang.String r1 = r6.valueOf
            int r1 = r1.hashCode()
            o.addExtras$toString r3 = r6.ah$a
            r4 = 19
            if (r3 != 0) goto L41
            r5 = 19
            goto L43
        L41:
            r5 = 55
        L43:
            if (r5 == r4) goto L49
        L45:
            int r2 = r3.hashCode()
        L49:
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r0 = r0 + r2
            int r1 = o.setSemanticAction.HaptikSDK$c     // Catch: java.lang.Exception -> L61
            int r1 = r1 + 125
            int r2 = r1 % 128
            o.setSemanticAction.HaptikSDK$a = r2     // Catch: java.lang.Exception -> L61
            int r1 = r1 % 2
            if (r1 == 0) goto L60
            r1 = 0
            int r1 = r1.length     // Catch: java.lang.Throwable -> L5e
            return r0
        L5e:
            r0 = move-exception
            throw r0
        L60:
            return r0
        L61:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSemanticAction.hashCode():int");
    }

    public String toString() {
        String str = "ChallengeCtaData(oppUserId=" + this.values + ", source=" + this.valueOf + ", callback=" + this.ah$a + ")";
        try {
            int i = HaptikSDK$c + 7;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public setSemanticAction(int i, String str, addExtras.toString tostring) {
        runAnimators.ag$a(str, ah$a(TextUtils.getOffsetBefore("", 0), new char[]{40889, 33050, 57445, 37639}, new char[]{60773, 37874, 33877, 21496}, (char) (ExpandableListView.getPackedPositionChild(0L) + 2017), new char[]{25108, 49101, 34124, 29794, 890, 62599}).intern());
        this.values = i;
        this.valueOf = str;
        this.ah$a = tostring;
    }

    public final int ah$a() {
        int i = HaptikSDK$a + 87;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        int i3 = this.values;
        int i4 = HaptikSDK$a + 111;
        HaptikSDK$c = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    public final String valueOf() {
        String str;
        try {
            int i = HaptikSDK$c + 113;
            HaptikSDK$a = i % 128;
            if (i % 2 == 0) {
                str = this.valueOf;
            } else {
                str = this.valueOf;
                int i2 = 96 / 0;
            }
            int i3 = HaptikSDK$c + 65;
            HaptikSDK$a = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 7 : 'c') != 7) {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final addExtras.toString values() {
        int i = HaptikSDK$c + 109;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        try {
            addExtras.toString tostring = this.ah$a;
            int i3 = HaptikSDK$c + 117;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            return tostring;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ah$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ toString) ^ ag$a) ^ ah$b);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
