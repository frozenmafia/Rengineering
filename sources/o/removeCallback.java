package o;
/* loaded from: classes4.dex */
public final class removeCallback {
    private static int[] ag$a = {308231620, 1505713031, -1479036284, 843497527, -1918921873, -799015094, -1228375650, -571612215, -564647899, -651854475, -1250004716, 819005859, -107643060, 870676738, 1410859511, -86642426, 1263196066, 308405679};
    private static int ah$a = 0;
    private static int values = 1;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = new android.os.Bundle();
        r0.putString(values(new int[]{735882207, -24626712, -1943667711, -164893912}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 5).intern(), r4.ag$a());
        r0.putBundle("params", r4.values());
        r4 = o.removeCallback.ah$a + 45;
        o.removeCallback.values = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        if ((r4 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (r4 == true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        r4 = 43 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        return new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r4 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.os.Bundle valueOf(o.AnimationHandler r4) {
        /*
            int r0 = o.removeCallback.ah$a
            int r0 = r0 + 21
            int r1 = r0 % 128
            o.removeCallback.values = r1
            int r0 = r0 % 2
            r1 = 16
            if (r0 != 0) goto L11
            r0 = 16
            goto L13
        L11:
            r0 = 41
        L13:
            if (r0 == r1) goto L18
            if (r4 == 0) goto L61
            goto L1c
        L18:
            r0 = 0
            int r0 = r0.length     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L61
        L1c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2 = 4
            int[] r2 = new int[r2]
            r2 = {x006a: FILL_ARRAY_DATA  , data: [735882207, -24626712, -1943667711, -164893912} // fill-array
            int r3 = android.view.ViewConfiguration.getPressedStateDuration()
            int r1 = r3 >> 16
            int r1 = r1 + 5
            java.lang.String r1 = values(r2, r1)
            java.lang.String r1 = r1.intern()
            java.lang.String r2 = r4.ag$a()
            r0.putString(r1, r2)
            android.os.Bundle r4 = r4.values()
            java.lang.String r1 = "params"
            r0.putBundle(r1, r4)
            int r4 = o.removeCallback.ah$a
            int r4 = r4 + 45
            int r1 = r4 % 128
            o.removeCallback.values = r1
            int r4 = r4 % 2
            r1 = 0
            r2 = 1
            if (r4 != 0) goto L57
            r4 = 0
            goto L58
        L57:
            r4 = 1
        L58:
            if (r4 == r2) goto L60
            r4 = 43
            int r4 = r4 / r1
            return r0
        L5e:
            r4 = move-exception
            throw r4
        L60:
            return r0
        L61:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            return r4
        L67:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.removeCallback.valueOf(o.AnimationHandler):android.os.Bundle");
    }

    private static String values(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) ag$a.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
