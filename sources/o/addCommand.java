package o;

import android.view.ViewConfiguration;
/* loaded from: classes3.dex */
public final class addCommand {
    private static int HaptikSDK$a = 0;
    private static int ah$b = 1;
    private static int[] invoke = {1288678032, 755208395, 2055799449, 197195730, 1240210298, -1640224874, -1606669524, -1847548005, -1021083061, 172582291, -1510695830, -2045625020, 428694205, -399417855, -853243473, 728709412, -886123695, -1123386528};
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    private final int ag$a;
    private final boolean ah$a;
    private final long toString;
    private final PathSegment valueOf;
    private final String values;

    public addCommand(String str, String str2, String str3, int i, boolean z, long j, PathSegment pathSegment) {
        runAnimators.ag$a(str, "uniqueId");
        runAnimators.ag$a(str2, toString(new int[]{-1704329215, 110389163, 487554743, 90775509}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5).intern());
        runAnimators.ag$a(pathSegment, "media");
        this.HaptikSDK$b = str;
        this.HaptikSDK$c = str2;
        this.values = str3;
        this.ag$a = i;
        this.ah$a = z;
        this.toString = j;
        this.valueOf = pathSegment;
    }

    public final String HaptikSDK$a() {
        int i = HaptikSDK$a + 123;
        ah$b = i % 128;
        int i2 = i % 2;
        String str = this.HaptikSDK$c;
        try {
            int i3 = ah$b + 47;
            HaptikSDK$a = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String HaptikSDK$b() {
        int i = ah$b + 7;
        HaptikSDK$a = i % 128;
        if ((i % 2 != 0 ? 'Z' : 'W') != 'Z') {
            return this.HaptikSDK$b;
        }
        try {
            String str = this.HaptikSDK$b;
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final long ag$a() {
        int i = HaptikSDK$a + 115;
        ah$b = i % 128;
        int i2 = i % 2;
        long j = this.toString;
        int i3 = HaptikSDK$a + 97;
        ah$b = i3 % 128;
        if ((i3 % 2 == 0 ? ',' : 'C') != ',') {
            return j;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return j;
    }

    public final String ah$a() {
        int i = HaptikSDK$a + 113;
        ah$b = i % 128;
        if ((i % 2 == 0 ? ']' : 'L') != ']') {
            try {
                return this.values;
            } catch (Exception e) {
                throw e;
            }
        }
        String str = this.values;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public final boolean ah$b() {
        boolean z;
        int i = HaptikSDK$a + 105;
        ah$b = i % 128;
        Object[] objArr = null;
        if (i % 2 != 0) {
            z = this.ah$a;
        } else {
            z = this.ah$a;
            super.hashCode();
        }
        int i2 = ah$b + 107;
        HaptikSDK$a = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return z;
        }
        int length = objArr.length;
        return z;
    }

    public boolean equals(Object obj) {
        int i = HaptikSDK$a + 37;
        ah$b = i % 128;
        int i2 = i % 2;
        if (this == obj) {
            int i3 = HaptikSDK$a + 119;
            ah$b = i3 % 128;
            int i4 = i3 % 2;
            return true;
        } else if (!(obj instanceof addCommand)) {
            int i5 = HaptikSDK$a + 69;
            ah$b = i5 % 128;
            return i5 % 2 == 0;
        } else {
            addCommand addcommand = (addCommand) obj;
            if (runAnimators.values((Object) this.HaptikSDK$b, (Object) addcommand.HaptikSDK$b)) {
                try {
                    if (runAnimators.values((Object) this.HaptikSDK$c, (Object) addcommand.HaptikSDK$c) && runAnimators.values((Object) this.values, (Object) addcommand.values)) {
                        if (!(this.ag$a == addcommand.ag$a)) {
                            return false;
                        }
                        if (!(this.ah$a == addcommand.ah$a)) {
                            int i6 = ah$b + 125;
                            HaptikSDK$a = i6 % 128;
                            int i7 = i6 % 2;
                            int i8 = HaptikSDK$a + 33;
                            ah$b = i8 % 128;
                            int i9 = i8 % 2;
                            return false;
                        } else if (this.toString != addcommand.toString) {
                            try {
                                int i10 = ah$b + 67;
                                HaptikSDK$a = i10 % 128;
                                return i10 % 2 != 0;
                            } catch (Exception e) {
                                throw e;
                            }
                        } else if (runAnimators.values(this.valueOf, addcommand.valueOf)) {
                            return true;
                        } else {
                            int i11 = ah$b + 51;
                            HaptikSDK$a = i11 % 128;
                            int i12 = i11 % 2;
                            return false;
                        }
                    }
                    return false;
                } catch (Exception e2) {
                    throw e2;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r4 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        r4 = o.addCommand.HaptikSDK$a + 55;
        o.addCommand.ah$b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if ((r4 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        r4 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r4 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r8 = this;
            int r0 = o.addCommand.HaptikSDK$a
            int r0 = r0 + 11
            int r1 = r0 % 128
            o.addCommand.ah$b = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 == 0) goto L26
            java.lang.String r0 = r8.HaptikSDK$b     // Catch: java.lang.Exception -> L24
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L24
            java.lang.String r3 = r8.HaptikSDK$c     // Catch: java.lang.Exception -> L24
            int r3 = r3.hashCode()     // Catch: java.lang.Exception -> L24
            java.lang.String r4 = r8.values     // Catch: java.lang.Exception -> L24
            if (r4 != 0) goto L4c
            goto L39
        L24:
            r0 = move-exception
            throw r0
        L26:
            java.lang.String r0 = r8.HaptikSDK$b
            int r0 = r0.hashCode()
            java.lang.String r3 = r8.HaptikSDK$c
            int r3 = r3.hashCode()
            java.lang.String r4 = r8.values
            r5 = 83
            int r5 = r5 / r1
            if (r4 != 0) goto L4c
        L39:
            int r4 = o.addCommand.HaptikSDK$a     // Catch: java.lang.Exception -> L4a
            int r4 = r4 + 55
            int r5 = r4 % 128
            o.addCommand.ah$b = r5     // Catch: java.lang.Exception -> L4a
            int r4 = r4 % 2
            if (r4 != 0) goto L47
            r4 = 1
            goto L48
        L47:
            r4 = 0
        L48:
            r4 = 0
            goto L50
        L4a:
            r0 = move-exception
            throw r0
        L4c:
            int r4 = r4.hashCode()
        L50:
            int r5 = r8.ag$a
            boolean r6 = r8.ah$a
            if (r6 == 0) goto L64
            int r6 = o.addCommand.HaptikSDK$a
            int r6 = r6 + 11
            int r7 = r6 % 128
            o.addCommand.ah$b = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L65
            r1 = 1
            goto L65
        L64:
            r2 = r6
        L65:
            int r0 = r0 * 31
            int r0 = r0 + r3
            int r0 = r0 * 31
            int r0 = r0 + r4
            int r0 = r0 * 31
            int r0 = r0 + r5
            int r0 = r0 * 31
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r8.toString
            int r1 = o.ComponentActivity.AnonymousClass2.C03192.toString(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            o.PathSegment r1 = r8.valueOf
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
        L84:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addCommand.hashCode():int");
    }

    public String toString() {
        String str = "Story(uniqueId=" + this.HaptikSDK$b + ", title=" + this.HaptikSDK$c + ", name=" + ((Object) this.values) + ", index=" + this.ag$a + ", seen=" + this.ah$a + ", currentTime=" + this.toString + ", media=" + this.valueOf + ')';
        int i = HaptikSDK$a + 49;
        ah$b = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return str;
    }

    public final int valueOf() {
        int i = HaptikSDK$a + 31;
        ah$b = i % 128;
        int i2 = i % 2;
        int i3 = this.ag$a;
        int i4 = HaptikSDK$a + 93;
        ah$b = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    public final PathSegment values() {
        int i = HaptikSDK$a + 31;
        ah$b = i % 128;
        int i2 = i % 2;
        PathSegment pathSegment = this.valueOf;
        int i3 = HaptikSDK$a + 77;
        ah$b = i3 % 128;
        if ((i3 % 2 == 0 ? '*' : 'c') != '*') {
            return pathSegment;
        }
        Object obj = null;
        super.hashCode();
        return pathSegment;
    }

    private static String toString(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) invoke.clone();
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
