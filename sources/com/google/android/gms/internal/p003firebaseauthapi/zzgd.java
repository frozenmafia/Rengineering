package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgd */
/* loaded from: classes7.dex */
public final class zzgd extends zzzw<zzgd, zzgc> implements zzaba {
    private static final zzgd zzb;
    private int zze;
    private int zzf;

    static {
        zzgd zzgdVar = new zzgd();
        zzb = zzgdVar;
        zzzw.zzF(zzgd.class, zzgdVar);
    }

    private zzgd() {
    }

    public static zzgc zzb() {
        return zzb.zzt();
    }

    public static zzgd zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzgd) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public final int zza() {
        return this.zze;
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
                    return new zzgc(null);
                }
                return new zzgd();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        return (byte) 1;
    }
}
