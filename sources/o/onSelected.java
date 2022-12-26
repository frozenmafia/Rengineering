package o;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import o.ItemTouchHelper;
/* loaded from: classes7.dex */
class onSelected {
    private static long ah$a(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    private static long toString(byte[] bArr, int i, int i2) {
        return (ah$a(bArr, i) >> i2) & 67108863;
    }

    private static void ah$a(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    private static void valueOf(byte[] bArr, byte[] bArr2, int i) {
        int min = Math.min(16, bArr2.length - i);
        System.arraycopy(bArr2, i, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] valueOf(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        int i = 0;
        long onselected = toString(bArr, 0, 0) & 67108863;
        int i2 = 2;
        long onselected2 = toString(bArr, 3, 2) & 67108611;
        long onselected3 = toString(bArr, 6, 4) & 67092735;
        long onselected4 = toString(bArr, 9, 6) & 66076671;
        long onselected5 = toString(bArr, 12, 8) & 1048575;
        long j = onselected3 * 5;
        long j2 = onselected4 * 5;
        long j3 = onselected5 * 5;
        byte[] bArr3 = new byte[17];
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        int i3 = 0;
        while (i3 < bArr2.length) {
            valueOf(bArr3, bArr2, i3);
            long onselected6 = j8 + toString(bArr3, i, i);
            long onselected7 = j5 + toString(bArr3, 3, i2);
            long onselected8 = j4 + toString(bArr3, 6, 4);
            long onselected9 = j6 + toString(bArr3, 9, 6);
            long onselected10 = j7 + (toString(bArr3, 12, 8) | (bArr3[16] << 24));
            long j9 = (onselected6 * onselected) + (onselected7 * j3) + (onselected8 * j2) + (onselected9 * j) + (onselected2 * 5 * onselected10);
            long j10 = (onselected6 * onselected2) + (onselected7 * onselected) + (onselected8 * j3) + (onselected9 * j2) + (onselected10 * j) + (j9 >> 26);
            long j11 = (onselected6 * onselected3) + (onselected7 * onselected2) + (onselected8 * onselected) + (onselected9 * j3) + (onselected10 * j2) + (j10 >> 26);
            long j12 = (onselected6 * onselected4) + (onselected7 * onselected3) + (onselected8 * onselected2) + (onselected9 * onselected) + (onselected10 * j3) + (j11 >> 26);
            long j13 = (onselected6 * onselected5) + (onselected7 * onselected4) + (onselected8 * onselected3) + (onselected9 * onselected2) + (onselected10 * onselected) + (j12 >> 26);
            long j14 = (j9 & 67108863) + ((j13 >> 26) * 5);
            j5 = (j10 & 67108863) + (j14 >> 26);
            i3 += 16;
            j4 = j11 & 67108863;
            j6 = j12 & 67108863;
            j7 = j13 & 67108863;
            j8 = j14 & 67108863;
            i = 0;
            i2 = 2;
        }
        long j15 = j4 + (j5 >> 26);
        long j16 = j15 & 67108863;
        long j17 = j6 + (j15 >> 26);
        long j18 = j17 & 67108863;
        long j19 = j7 + (j17 >> 26);
        long j20 = j19 & 67108863;
        long j21 = j8 + ((j19 >> 26) * 5);
        long j22 = j21 & 67108863;
        long j23 = (j5 & 67108863) + (j21 >> 26);
        long j24 = j22 + 5;
        long j25 = (j24 >> 26) + j23;
        long j26 = j16 + (j25 >> 26);
        long j27 = j18 + (j26 >> 26);
        long j28 = (j20 + (j27 >> 26)) - 67108864;
        long j29 = j28 >> 63;
        long j30 = ~j29;
        long j31 = (j25 & 67108863 & j30) | (j23 & j29);
        long j32 = (j26 & 67108863 & j30) | (j16 & j29);
        long j33 = (j27 & 67108863 & j30) | (j18 & j29);
        long ah$a = (((j22 & j29) | (j24 & 67108863 & j30) | (j31 << 26)) & 4294967295L) + ah$a(bArr, 16);
        long ah$a2 = (((j31 >> 6) | (j32 << 20)) & 4294967295L) + ah$a(bArr, 20) + (ah$a >> 32);
        long ah$a3 = (((j32 >> 12) | (j33 << 14)) & 4294967295L) + ah$a(bArr, 24) + (ah$a2 >> 32);
        long ah$a4 = ah$a(bArr, 28);
        byte[] bArr4 = new byte[16];
        ah$a(bArr4, ah$a & 4294967295L, 0);
        ah$a(bArr4, ah$a2 & 4294967295L, 4);
        ah$a(bArr4, ah$a3 & 4294967295L, 8);
        ah$a(bArr4, ((((j33 >> 18) | (((j20 & j29) | (j28 & j30)) << 8)) & 4294967295L) + ah$a4 + (ah$a3 >> 32)) & 4294967295L, 12);
        return bArr4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void toString(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!ItemTouchHelper.RecoverAnimation.values(valueOf(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
