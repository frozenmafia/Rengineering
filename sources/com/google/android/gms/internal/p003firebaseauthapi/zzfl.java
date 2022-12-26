package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfl  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzfl extends zzzw<zzfl, zzfk> implements zzaba {
    private static final zzfl zzb;
    private int zze;
    private zzfr zzf;
    private zzyu zzg = zzyu.zzb;

    static {
        zzfl zzflVar = new zzfl();
        zzb = zzflVar;
        zzzw.zzF(zzfl.class, zzflVar);
    }

    private zzfl() {
    }

    public static zzfk zzb() {
        return zzb.zzt();
    }

    public static zzfl zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzfl) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzfl zzflVar, zzfr zzfrVar) {
        zzfrVar.getClass();
        zzflVar.zzf = zzfrVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzfr zze() {
        zzfr zzfrVar = this.zzf;
        return zzfrVar == null ? zzfr.zzd() : zzfrVar;
    }

    public final zzyu zzf() {
        return this.zzg;
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
                    return new zzfk(null);
                }
                return new zzfl();
            }
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
