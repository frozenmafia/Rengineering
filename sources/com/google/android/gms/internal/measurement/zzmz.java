package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
/* loaded from: classes7.dex */
final class zzmz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (zze(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || zze(b4) || zze(b5)) {
            throw zzkp.zzc();
        }
        int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + 56320);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzc(byte b2, byte b3, char[] cArr, int i) {
        if (b2 < -62 || zze(b3)) {
            throw zzkp.zzc();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzd(byte b2) {
        return b2 >= 0;
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!zze(b3)) {
            if (b2 == -32) {
                if (b3 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b3 < -96) {
                    b2 = -19;
                }
            }
            if (!zze(b4)) {
                cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                return;
            }
        }
        throw zzkp.zzc();
    }
}
