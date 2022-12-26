package com.google.android.gms.internal.p003firebaseauthapi;

import sun.misc.Unsafe;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzach  reason: invalid package */
/* loaded from: classes7.dex */
final class zzach extends zzaci {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzach(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaci
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzk(obj, j));
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaci
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzj(obj, j));
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaci
    public final void zzc(Object obj, long j, boolean z) {
        if (zzacj.zzb) {
            zzacj.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzacj.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaci
    public final void zzd(Object obj, long j, byte b2) {
        if (zzacj.zzb) {
            zzacj.zzD(obj, j, b2);
        } else {
            zzacj.zzE(obj, j, b2);
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaci
    public final void zze(Object obj, long j, double d) {
        zzo(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaci
    public final void zzf(Object obj, long j, float f) {
        zzn(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaci
    public final boolean zzg(Object obj, long j) {
        if (zzacj.zzb) {
            return zzacj.zzt(obj, j);
        }
        return zzacj.zzu(obj, j);
    }
}
