package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhg  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzhg extends zzzw<zzhg, zzhf> implements zzaba {
    private static final zzhg zzb;
    private int zze;
    private zzha zzf;
    private zzyu zzg = zzyu.zzb;
    private zzyu zzh = zzyu.zzb;

    static {
        zzhg zzhgVar = new zzhg();
        zzb = zzhgVar;
        zzzw.zzF(zzhg.class, zzhgVar);
    }

    private zzhg() {
    }

    public static zzhf zzc() {
        return zzb.zzt();
    }

    public static zzhg zze() {
        return zzb;
    }

    public static zzhg zzf(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzhg) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzhg zzhgVar, int i) {
        zzhgVar.zze = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzhg zzhgVar, zzha zzhaVar) {
        zzhaVar.getClass();
        zzhgVar.zzf = zzhaVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzha zzb() {
        zzha zzhaVar = this.zzf;
        return zzhaVar == null ? zzha.zze() : zzhaVar;
    }

    public final zzyu zzg() {
        return this.zzg;
    }

    public final zzyu zzh() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new zzhf(null);
                }
                return new zzhg();
            }
            return zzE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
