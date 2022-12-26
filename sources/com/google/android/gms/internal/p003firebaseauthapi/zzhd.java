package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhd */
/* loaded from: classes7.dex */
public final class zzhd extends zzzw<zzhd, zzhc> implements zzaba {
    private static final zzhd zzb;
    private int zze;
    private zzhg zzf;
    private zzyu zzg = zzyu.zzb;

    static {
        zzhd zzhdVar = new zzhd();
        zzb = zzhdVar;
        zzzw.zzF(zzhd.class, zzhdVar);
    }

    private zzhd() {
    }

    public static zzhc zzb() {
        return zzb.zzt();
    }

    public static zzhd zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzhd) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public static /* synthetic */ void zzh(zzhd zzhdVar, zzhg zzhgVar) {
        zzhgVar.getClass();
        zzhdVar.zzf = zzhgVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzhg zze() {
        zzhg zzhgVar = this.zzf;
        return zzhgVar == null ? zzhg.zze() : zzhgVar;
    }

    public final zzyu zzf() {
        return this.zzg;
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
                    return new zzhc(null);
                }
                return new zzhd();
            }
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
