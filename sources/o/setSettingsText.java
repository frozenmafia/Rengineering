package o;

import com.app.dream11.social.pendingrequest.RequestComponentType;
/* loaded from: classes3.dex */
public final class setSettingsText {
    private static int HaptikSDK$c = 1;
    private static int invoke;
    private static char[] valueOf = {'2', 'd', 'j', 's', 'r', 'q'};
    private final RequestComponentType ag$a;
    private final String ah$a;
    private boolean toString;
    private final setPublicVersion values;

    public boolean equals(Object obj) {
        if (!(this != obj)) {
            int i = HaptikSDK$c + 101;
            invoke = i % 128;
            return i % 2 == 0;
        } else if (!(obj instanceof setSettingsText)) {
            try {
                int i2 = invoke + 21;
                HaptikSDK$c = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 98 / 0;
                    return false;
                }
                return false;
            } catch (Exception e) {
                throw e;
            }
        } else {
            setSettingsText setsettingstext = (setSettingsText) obj;
            if (!runAnimators.values((Object) this.ah$a, (Object) setsettingstext.ah$a)) {
                int i4 = HaptikSDK$c + 19;
                invoke = i4 % 128;
                return !(i4 % 2 == 0);
            } else if (this.ag$a == setsettingstext.ag$a) {
                return runAnimators.values(this.values, setsettingstext.values);
            } else {
                int i5 = HaptikSDK$c + 49;
                invoke = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if ((r3 != null) != true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if ((r3 == null ? org.apache.http.message.TokenParser.SP : 7) != ' ') goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        r2 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
        r3 = o.setSettingsText.invoke + 29;
        o.setSettingsText.HaptikSDK$c = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            int r0 = o.setSettingsText.HaptikSDK$c
            int r0 = r0 + 35
            int r1 = r0 % 128
            o.setSettingsText.invoke = r1
            int r0 = r0 % 2
            r1 = 19
            if (r0 == 0) goto L11
            r0 = 47
            goto L13
        L11:
            r0 = 19
        L13:
            r2 = 0
            if (r0 == r1) goto L32
            java.lang.String r0 = r6.ah$a
            int r0 = r0.hashCode()
            com.app.dream11.social.pendingrequest.RequestComponentType r1 = r6.ag$a
            int r1 = r1.hashCode()
            o.setPublicVersion r3 = r6.values
            r4 = 89
            int r4 = r4 / r2
            r4 = 1
            if (r3 != 0) goto L2c
            r5 = 0
            goto L2d
        L2c:
            r5 = 1
        L2d:
            if (r5 == r4) goto L4a
            goto L4f
        L30:
            r0 = move-exception
            throw r0
        L32:
            java.lang.String r0 = r6.ah$a
            int r0 = r0.hashCode()
            com.app.dream11.social.pendingrequest.RequestComponentType r1 = r6.ag$a
            int r1 = r1.hashCode()
            o.setPublicVersion r3 = r6.values
            r4 = 32
            if (r3 != 0) goto L47
            r5 = 32
            goto L48
        L47:
            r5 = 7
        L48:
            if (r5 == r4) goto L4f
        L4a:
            int r2 = r3.hashCode()
            goto L59
        L4f:
            int r3 = o.setSettingsText.invoke     // Catch: java.lang.Exception -> L60
            int r3 = r3 + 29
            int r4 = r3 % 128
            o.setSettingsText.HaptikSDK$c = r4     // Catch: java.lang.Exception -> L60
            int r3 = r3 % 2
        L59:
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r0 = r0 + r2
            return r0
        L60:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSettingsText.hashCode():int");
    }

    public String toString() {
        String str = "PendingRequestInputData(source=" + this.ah$a + ", type=" + this.ag$a + ", callback=" + this.values + ")";
        int i = HaptikSDK$c + 47;
        invoke = i % 128;
        int i2 = i % 2;
        return str;
    }

    public setSettingsText(String str, RequestComponentType requestComponentType, setPublicVersion setpublicversion) {
        runAnimators.ag$a(str, values(true, new int[]{0, 6, 0, 0}, new byte[]{1, 0, 1, 1, 0, 0}).intern());
        runAnimators.ag$a(requestComponentType, "type");
        this.ah$a = str;
        this.ag$a = requestComponentType;
        this.values = setpublicversion;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ setSettingsText(java.lang.String r3, com.app.dream11.social.pendingrequest.RequestComponentType r4, o.setPublicVersion r5, int r6, o.getTargetTypes r7) {
        /*
            r2 = this;
            r7 = r6 & 2
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L8
            r7 = 0
            goto L9
        L8:
            r7 = 1
        L9:
            if (r7 == 0) goto Lc
            goto L18
        Lc:
            int r4 = o.setSettingsText.invoke     // Catch: java.lang.Exception -> L2f
            int r4 = r4 + 93
            int r7 = r4 % 128
            o.setSettingsText.HaptikSDK$c = r7     // Catch: java.lang.Exception -> L2f
            int r4 = r4 % 2
            com.app.dream11.social.pendingrequest.RequestComponentType r4 = com.app.dream11.social.pendingrequest.RequestComponentType.REQUEST_BAND     // Catch: java.lang.Exception -> L2f
        L18:
            r6 = r6 & 4
            if (r6 == 0) goto L1d
            r0 = 1
        L1d:
            if (r0 == r1) goto L20
            goto L2b
        L20:
            r5 = 0
            int r6 = o.setSettingsText.HaptikSDK$c     // Catch: java.lang.Exception -> L2f
            int r6 = r6 + 25
            int r7 = r6 % 128
            o.setSettingsText.invoke = r7     // Catch: java.lang.Exception -> L2f
            int r6 = r6 % 2
        L2b:
            r2.<init>(r3, r4, r5)
            return
        L2f:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSettingsText.<init>(java.lang.String, com.app.dream11.social.pendingrequest.RequestComponentType, o.setPublicVersion, int, o.getTargetTypes):void");
    }

    public final String values() {
        String str;
        int i = invoke + 87;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? '5' : 'P') != 'P') {
            str = this.ah$a;
            int i2 = 95 / 0;
        } else {
            str = this.ah$a;
        }
        int i3 = HaptikSDK$c + 61;
        invoke = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final RequestComponentType ag$a() {
        int i = invoke + 37;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        RequestComponentType requestComponentType = this.ag$a;
        int i3 = HaptikSDK$c + 43;
        invoke = i3 % 128;
        if (!(i3 % 2 == 0)) {
            Object[] objArr = null;
            int length = objArr.length;
            return requestComponentType;
        }
        return requestComponentType;
    }

    public final setPublicVersion ah$a() {
        int i = invoke + 55;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        setPublicVersion setpublicversion = this.values;
        int i3 = HaptikSDK$c + 47;
        invoke = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return setpublicversion;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return setpublicversion;
    }

    public final boolean valueOf() {
        boolean z;
        int i = HaptikSDK$c + 57;
        invoke = i % 128;
        Object obj = null;
        if (i % 2 == 0) {
            try {
                z = this.toString;
            } catch (Exception e) {
                throw e;
            }
        } else {
            z = this.toString;
            super.hashCode();
        }
        int i2 = invoke + 35;
        HaptikSDK$c = i2 % 128;
        if (i2 % 2 == 0) {
            super.hashCode();
            return z;
        }
        return z;
    }

    private static String values(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(valueOf, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
