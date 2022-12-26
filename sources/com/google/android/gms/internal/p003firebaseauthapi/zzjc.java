package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjc */
/* loaded from: classes7.dex */
public final class zzjc extends zzzw<zzjc, zzjb> implements zzaba {
    private static final zzjc zzb;
    private String zze = "";

    static {
        zzjc zzjcVar = new zzjc();
        zzb = zzjcVar;
        zzzw.zzF(zzjc.class, zzjcVar);
    }

    private zzjc() {
    }

    public static zzjc zzb() {
        return zzb;
    }

    public static zzjc zzc(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzjc) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public final String zzd() {
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
                    return new zzjb(null);
                }
                return new zzjc();
            }
            return zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
