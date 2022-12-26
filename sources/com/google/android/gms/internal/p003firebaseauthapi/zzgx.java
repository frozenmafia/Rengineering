package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgx */
/* loaded from: classes7.dex */
public final class zzgx extends zzzw<zzgx, zzgw> implements zzaba {
    private static final zzgx zzb;
    private zzha zze;

    static {
        zzgx zzgxVar = new zzgx();
        zzb = zzgxVar;
        zzzw.zzF(zzgx.class, zzgxVar);
    }

    private zzgx() {
    }

    public static zzgw zza() {
        return zzb.zzt();
    }

    public static zzgx zzc(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzgx) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public static /* synthetic */ void zze(zzgx zzgxVar, zzha zzhaVar) {
        zzhaVar.getClass();
        zzgxVar.zze = zzhaVar;
    }

    public final zzha zzd() {
        zzha zzhaVar = this.zze;
        return zzhaVar == null ? zzha.zze() : zzhaVar;
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
                    return new zzgw(null);
                }
                return new zzgx();
            }
            return zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
