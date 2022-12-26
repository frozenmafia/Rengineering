package com.appsflyer.internal;
/* loaded from: classes3.dex */
public final class ce {
    public static int[] AFInAppEventParameterName(char[] cArr, int[] iArr, boolean z) {
        int i = (cArr[0] << 16) + cArr[1];
        int i2 = (cArr[2] << 16) + cArr[3];
        if (!z) {
            AFInAppEventType(iArr);
        }
        int i3 = 0;
        while (i3 < 16) {
            int i4 = i ^ iArr[i3];
            i3++;
            int AFKeystoreWrapper = i2 ^ AFKeystoreWrapper(i4);
            i2 = i4;
            i = AFKeystoreWrapper;
        }
        int i5 = i ^ iArr[16];
        int i6 = iArr[17] ^ i2;
        int[] iArr2 = {i6, i5};
        cArr[0] = (char) (i6 >>> 16);
        cArr[1] = (char) i6;
        cArr[2] = (char) (i5 >>> 16);
        cArr[3] = (char) i5;
        if (!z) {
            AFInAppEventType(iArr);
        }
        return iArr2;
    }

    public static void AFInAppEventType(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int AFKeystoreWrapper(int i) {
        by byVar = by.AFInAppEventParameterName;
        return ((byVar.valueOf[0][i >>> 24] + byVar.valueOf[1][(i >>> 16) & 255]) ^ byVar.valueOf[2][(i >>> 8) & 255]) + byVar.valueOf[3][i & 255];
    }
}
