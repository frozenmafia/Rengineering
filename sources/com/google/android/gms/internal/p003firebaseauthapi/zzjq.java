package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjq  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzjq extends zzzw<zzjq, zzjp> implements zzaba {
    private static final zzjq zzb;
    private int zze;
    private zzyu zzf = zzyu.zzb;

    static {
        zzjq zzjqVar = new zzjq();
        zzb = zzjqVar;
        zzzw.zzF(zzjq.class, zzjqVar);
    }

    private zzjq() {
    }

    public static zzjp zzb() {
        return zzb.zzt();
    }

    public static zzjq zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzjq) zzzw.zzw(zzb, zzyuVar, zzzjVar);
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
                    return new zzjp(null);
                }
                return new zzjq();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
