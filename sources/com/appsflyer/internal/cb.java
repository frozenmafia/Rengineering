package com.appsflyer.internal;
/* loaded from: classes3.dex */
public final class cb {
    public static void AFInAppEventParameterName(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            AFInAppEventType(iArr);
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i ^ iArr[i4];
            i4++;
            int valueOf = i2 ^ valueOf(i5, iArr2);
            i2 = i5;
            i = valueOf;
        }
        int i6 = iArr[iArr.length - 2];
        int i7 = iArr[iArr.length - 1];
        if (!z) {
            AFInAppEventType(iArr);
        }
        iArr3[0] = i2 ^ i7;
        iArr3[1] = i ^ i6;
    }

    private static void AFInAppEventType(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    private static int valueOf(int i, int[][] iArr) {
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }
}
