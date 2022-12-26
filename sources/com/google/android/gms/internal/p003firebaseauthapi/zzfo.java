package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfo */
/* loaded from: classes7.dex */
public final class zzfo extends zzzw<zzfo, zzfn> implements zzaba {
    private static final zzfo zzb;
    private zzfr zze;
    private int zzf;

    static {
        zzfo zzfoVar = new zzfo();
        zzb = zzfoVar;
        zzzw.zzF(zzfo.class, zzfoVar);
    }

    private zzfo() {
    }

    public static zzfn zzb() {
        return zzb.zzt();
    }

    public static zzfo zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzfo) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public static /* synthetic */ void zzf(zzfo zzfoVar, zzfr zzfrVar) {
        zzfrVar.getClass();
        zzfoVar.zze = zzfrVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzfr zze() {
        zzfr zzfrVar = this.zze;
        return zzfrVar == null ? zzfr.zzd() : zzfrVar;
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
                    return new zzfn(null);
                }
                return new zzfo();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
