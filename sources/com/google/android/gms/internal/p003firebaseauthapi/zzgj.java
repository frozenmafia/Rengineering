package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgj */
/* loaded from: classes7.dex */
public final class zzgj extends zzzw<zzgj, zzgi> implements zzaba {
    private static final zzgj zzb;
    private int zze;
    private int zzf;

    static {
        zzgj zzgjVar = new zzgj();
        zzb = zzgjVar;
        zzzw.zzF(zzgj.class, zzgjVar);
    }

    private zzgj() {
    }

    public static zzgi zzb() {
        return zzb.zzt();
    }

    public static zzgj zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzgj) zzzw.zzw(zzb, zzyuVar, zzzjVar);
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
                    return new zzgi(null);
                }
                return new zzgj();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
