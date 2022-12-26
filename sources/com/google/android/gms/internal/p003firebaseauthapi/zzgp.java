package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgp */
/* loaded from: classes7.dex */
public final class zzgp extends zzzw<zzgp, zzgo> implements zzaba {
    private static final zzgp zzb;

    static {
        zzgp zzgpVar = new zzgp();
        zzb = zzgpVar;
        zzzw.zzF(zzgp.class, zzgpVar);
    }

    private zzgp() {
    }

    public static zzgp zzb() {
        return zzb;
    }

    public static zzgp zzc(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzgp) zzzw.zzw(zzb, zzyuVar, zzzjVar);
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
                    return new zzgo(null);
                }
                return new zzgp();
            }
            return zzE(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
