package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzff */
/* loaded from: classes7.dex */
public final class zzff extends zzzw<zzff, zzfe> implements zzaba {
    private static final zzff zzb;
    private zzfi zze;
    private int zzf;

    static {
        zzff zzffVar = new zzff();
        zzb = zzffVar;
        zzzw.zzF(zzff.class, zzffVar);
    }

    private zzff() {
    }

    public static zzfe zzb() {
        return zzb.zzt();
    }

    public static zzff zzd() {
        return zzb;
    }

    public static zzff zze(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzff) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public static /* synthetic */ void zzg(zzff zzffVar, zzfi zzfiVar) {
        zzfiVar.getClass();
        zzffVar.zze = zzfiVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzfi zzf() {
        zzfi zzfiVar = this.zze;
        return zzfiVar == null ? zzfi.zzd() : zzfiVar;
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
                    return new zzfe(null);
                }
                return new zzff();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
