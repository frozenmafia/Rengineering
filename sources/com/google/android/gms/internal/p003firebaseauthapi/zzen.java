package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzen */
/* loaded from: classes7.dex */
public final class zzen extends zzzw<zzen, zzem> implements zzaba {
    private static final zzen zzb;
    private int zze;
    private zzyu zzf = zzyu.zzb;
    private zzet zzg;

    static {
        zzen zzenVar = new zzen();
        zzb = zzenVar;
        zzzw.zzF(zzen.class, zzenVar);
    }

    private zzen() {
    }

    public static zzem zzb() {
        return zzb.zzt();
    }

    public static zzen zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzen) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public static /* synthetic */ void zzi(zzen zzenVar, zzet zzetVar) {
        zzetVar.getClass();
        zzenVar.zzg = zzetVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzet zze() {
        zzet zzetVar = this.zzg;
        return zzetVar == null ? zzet.zzd() : zzetVar;
    }

    public final zzyu zzf() {
        return this.zzf;
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
                    return new zzem(null);
                }
                return new zzen();
            }
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
