package com.google.android.gms.internal.gtm;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
/* loaded from: classes7.dex */
final class zzua {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(byte b2) {
        return b2 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zze(byte b2) {
        return b2 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzf(byte b2) {
        return b2 < -16;
    }

    private static boolean zzg(byte b2) {
        return b2 > -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b2, byte b3, char[] cArr, int i) throws zzrk {
        if (b2 < -62 || zzg(b3)) {
            throw zzrk.zzpw();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b2, byte b3, byte b4, char[] cArr, int i) throws zzrk {
        if (zzg(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || zzg(b4)))) {
            throw zzrk.zzpw();
        }
        cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws zzrk {
        if (zzg(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || zzg(b4) || zzg(b5)) {
            throw zzrk.zzpw();
        }
        int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + 56320);
    }
}
