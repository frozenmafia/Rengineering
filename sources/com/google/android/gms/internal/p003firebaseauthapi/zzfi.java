package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfi  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzfi extends zzzw<zzfi, zzfh> implements zzaba {
    private static final zzfi zzb;
    private int zze;

    static {
        zzfi zzfiVar = new zzfi();
        zzb = zzfiVar;
        zzzw.zzF(zzfi.class, zzfiVar);
    }

    private zzfi() {
    }

    public static zzfh zzb() {
        return zzb.zzt();
    }

    public static zzfi zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
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
                    return new zzfh(null);
                }
                return new zzfi();
            }
            return zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
