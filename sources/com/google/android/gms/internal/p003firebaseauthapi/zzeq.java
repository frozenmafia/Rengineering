package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeq */
/* loaded from: classes7.dex */
public final class zzeq extends zzzw<zzeq, zzep> implements zzaba {
    private static final zzeq zzb;
    private int zze;
    private zzet zzf;

    static {
        zzeq zzeqVar = new zzeq();
        zzb = zzeqVar;
        zzzw.zzF(zzeq.class, zzeqVar);
    }

    private zzeq() {
    }

    public static zzep zzb() {
        return zzb.zzt();
    }

    public static zzeq zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzeq) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public static /* synthetic */ void zzg(zzeq zzeqVar, zzet zzetVar) {
        zzetVar.getClass();
        zzeqVar.zzf = zzetVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzet zze() {
        zzet zzetVar = this.zzf;
        return zzetVar == null ? zzet.zzd() : zzetVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzzw
    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzep(null);
                }
                return new zzeq();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
