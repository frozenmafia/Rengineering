package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzack  reason: invalid package */
/* loaded from: classes7.dex */
final class zzack {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzc(byte b2, byte b3, byte b4, char[] cArr, int i) throws zzaae {
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
        throw zzaae.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzd(byte b2) {
        return b2 >= 0;
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws zzaae {
        if (zze(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || zze(b4) || zze(b5)) {
            throw zzaae.zzd();
        }
        int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + 56320);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(byte b2, byte b3, char[] cArr, int i) throws zzaae {
        if (b2 < -62 || zze(b3)) {
            throw zzaae.zzd();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }
}
