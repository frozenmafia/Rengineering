package o;

import com.google.android.exoplayer2.C;
/* loaded from: classes3.dex */
public final class onTransitionEnd {
    public static boolean ag$a(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int ah$a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long toString(C$default$setContentDescription c$default$setContentDescription, int i, int i2) {
        c$default$setContentDescription.HaptikSDK$b(i);
        if (c$default$setContentDescription.ag$a() < 5) {
            return C.TIME_UNSET;
        }
        int signupData = c$default$setContentDescription.getSignupData();
        if ((8388608 & signupData) == 0 && ((2096896 & signupData) >> 8) == i2) {
            if (((signupData & 32) != 0) && c$default$setContentDescription.extraCallbackWithResult() >= 7 && c$default$setContentDescription.ag$a() >= 7) {
                if ((c$default$setContentDescription.extraCallbackWithResult() & 16) == 16) {
                    byte[] bArr = new byte[6];
                    c$default$setContentDescription.valueOf(bArr, 0, 6);
                    return toString(bArr);
                }
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    private static long toString(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
