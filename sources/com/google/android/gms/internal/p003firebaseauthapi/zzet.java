package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzet  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzet extends zzzw<zzet, zzes> implements zzaba {
    private static final zzet zzb;
    private int zze;

    static {
        zzet zzetVar = new zzet();
        zzb = zzetVar;
        zzzw.zzF(zzet.class, zzetVar);
    }

    private zzet() {
    }

    public static zzes zzb() {
        return zzb.zzt();
    }

    public static zzet zzd() {
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
                    return new zzes(null);
                }
                return new zzet();
            }
            return zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
