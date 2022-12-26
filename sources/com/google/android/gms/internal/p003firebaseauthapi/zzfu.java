package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfu  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzfu extends zzzw<zzfu, zzft> implements zzaba {
    private static final zzfu zzb;
    private int zze;
    private zzyu zzf = zzyu.zzb;

    static {
        zzfu zzfuVar = new zzfu();
        zzb = zzfuVar;
        zzzw.zzF(zzfu.class, zzfuVar);
    }

    private zzfu() {
    }

    public static zzft zzb() {
        return zzb.zzt();
    }

    public static zzfu zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzfu) zzzw.zzw(zzb, zzyuVar, zzzjVar);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzyu zze() {
        return this.zzf;
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
                    return new zzft(null);
                }
                return new zzfu();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
