package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzha  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzha extends zzzw<zzha, zzgz> implements zzaba {
    private static final zzha zzb;
    private zzhj zze;
    private zzgu zzf;
    private int zzg;

    static {
        zzha zzhaVar = new zzha();
        zzb = zzhaVar;
        zzzw.zzF(zzha.class, zzhaVar);
    }

    private zzha() {
    }

    public static zzgz zzc() {
        return zzb.zzt();
    }

    public static zzha zze() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzha zzhaVar, zzhj zzhjVar) {
        zzhjVar.getClass();
        zzhaVar.zze = zzhjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzha zzhaVar, zzgu zzguVar) {
        zzguVar.getClass();
        zzhaVar.zzf = zzguVar;
    }

    public final zzgr zza() {
        zzgr zzb2 = zzgr.zzb(this.zzg);
        return zzb2 == null ? zzgr.UNRECOGNIZED : zzb2;
    }

    public final zzgu zzb() {
        zzgu zzguVar = this.zzf;
        return zzguVar == null ? zzgu.zzc() : zzguVar;
    }

    public final zzhj zzf() {
        zzhj zzhjVar = this.zze;
        return zzhjVar == null ? zzhj.zzc() : zzhjVar;
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
                    return new zzgz(null);
                }
                return new zzha();
            }
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
