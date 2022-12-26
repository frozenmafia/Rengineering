package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhw */
/* loaded from: classes7.dex */
public final class zzhw extends zzzw<zzhw, zzhv> implements zzaba {
    private static final zzhw zzb;
    private zzhz zze;
    private int zzf;
    private int zzg;

    static {
        zzhw zzhwVar = new zzhw();
        zzb = zzhwVar;
        zzzw.zzF(zzhw.class, zzhwVar);
    }

    private zzhw() {
    }

    public static zzhv zzb() {
        return zzb.zzt();
    }

    public static zzhw zzd() {
        return zzb;
    }

    public static zzhw zze(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzhw) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public static /* synthetic */ void zzg(zzhw zzhwVar, zzhz zzhzVar) {
        zzhzVar.getClass();
        zzhwVar.zze = zzhzVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzhz zzf() {
        zzhz zzhzVar = this.zze;
        return zzhzVar == null ? zzhz.zze() : zzhzVar;
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
                    return new zzhv(null);
                }
                return new zzhw();
            }
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
