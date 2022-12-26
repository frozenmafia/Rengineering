package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjt */
/* loaded from: classes7.dex */
public final class zzjt extends zzzw<zzjt, zzjs> implements zzaba {
    private static final zzjt zzb;
    private int zze;

    static {
        zzjt zzjtVar = new zzjt();
        zzb = zzjtVar;
        zzzw.zzF(zzjt.class, zzjtVar);
    }

    private zzjt() {
    }

    public static zzjt zzb() {
        return zzb;
    }

    public static zzjt zzc(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzjt) zzzw.zzw(zzb, zzyuVar, zzzjVar);
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
                    return new zzjs(null);
                }
                return new zzjt();
            }
            return zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
