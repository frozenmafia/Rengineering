package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgu */
/* loaded from: classes7.dex */
public final class zzgu extends zzzw<zzgu, zzgt> implements zzaba {
    private static final zzgu zzb;
    private zzij zze;

    static {
        zzgu zzguVar = new zzgu();
        zzb = zzguVar;
        zzzw.zzF(zzgu.class, zzguVar);
    }

    private zzgu() {
    }

    public static zzgt zza() {
        return zzb.zzt();
    }

    public static zzgu zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzgu zzguVar, zzij zzijVar) {
        zzijVar.getClass();
        zzguVar.zze = zzijVar;
    }

    public final zzij zzd() {
        zzij zzijVar = this.zze;
        return zzijVar == null ? zzij.zzc() : zzijVar;
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
                    return new zzgt(null);
                }
                return new zzgu();
            }
            return zzE(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
