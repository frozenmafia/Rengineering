package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzla  reason: invalid package */
/* loaded from: classes7.dex */
final class zzla {
    private static long zzb(byte[] bArr, int i, int i2) {
        return (zzc(bArr, i) >> i2) & 67108863;
    }

    private static long zzc(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long zzb = zzb(bArr, 0, 0);
        int i = 3;
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        long j = zzb3 * 5;
        long j2 = zzb4 * 5;
        long j3 = zzb5 * 5;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        int i3 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 < length) {
                int min = Math.min(16, length - i3);
                System.arraycopy(bArr2, i3, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i2, (byte) 0);
                }
                long zzb6 = j8 + zzb(bArr3, 0, 0);
                long zzb7 = j5 + zzb(bArr3, i, 2);
                long zzb8 = j4 + zzb(bArr3, 6, 4);
                long zzb9 = j6 + zzb(bArr3, 9, 6);
                long zzb10 = j7 + (zzb(bArr3, 12, 8) | (bArr3[16] << 24));
                long j9 = (zzb6 * zzb) + (zzb7 * j3) + (zzb8 * j2) + (zzb9 * j) + (zzb2 * 5 * zzb10);
                long j10 = (zzb6 * zzb2) + (zzb7 * zzb) + (zzb8 * j3) + (zzb9 * j2) + (zzb10 * j) + (j9 >> 26);
                long j11 = (zzb6 * zzb3) + (zzb7 * zzb2) + (zzb8 * zzb) + (zzb9 * j3) + (zzb10 * j2) + (j10 >> 26);
                long j12 = (zzb6 * zzb4) + (zzb7 * zzb3) + (zzb8 * zzb2) + (zzb9 * zzb) + (zzb10 * j3) + (j11 >> 26);
                long j13 = (zzb6 * zzb5) + (zzb7 * zzb4) + (zzb8 * zzb3) + (zzb9 * zzb2) + (zzb10 * zzb) + (j12 >> 26);
                j7 = j13 & 67108863;
                long j14 = (j9 & 67108863) + ((j13 >> 26) * 5);
                j8 = j14 & 67108863;
                j5 = (j10 & 67108863) + (j14 >> 26);
                i3 += 16;
                j6 = j12 & 67108863;
                j4 = j11 & 67108863;
                i2 = 17;
                i = 3;
            } else {
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
                long j31 = (j23 & j29) | (j25 & 67108863 & j30);
                long j32 = (j16 & j29) | (j26 & 67108863 & j30);
                long j33 = (j18 & j29) | (j27 & 67108863 & j30);
                long zzc = (((j22 & j29) | (j24 & 67108863 & j30) | (j31 << 26)) & 4294967295L) + zzc(bArr, 16);
                long zzc2 = (((j31 >> 6) | (j32 << 20)) & 4294967295L) + zzc(bArr, 20) + (zzc >> 32);
                long zzc3 = (((j32 >> 12) | (j33 << 14)) & 4294967295L) + zzc(bArr, 24) + (zzc2 >> 32);
                long zzc4 = zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & 4294967295L, 0);
                zzd(bArr4, zzc2 & 4294967295L, 4);
                zzd(bArr4, zzc3 & 4294967295L, 8);
                zzd(bArr4, ((((((j28 & j30) | (j29 & j20)) << 8) | (j33 >> 18)) & 4294967295L) + zzc4 + (zzc3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
        }
    }
}
