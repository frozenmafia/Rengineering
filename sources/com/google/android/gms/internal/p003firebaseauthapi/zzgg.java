package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgg  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzgg extends zzzw<zzgg, zzgf> implements zzaba {
    private static final zzgg zzb;
    private int zze;
    private zzyu zzf = zzyu.zzb;

    static {
        zzgg zzggVar = new zzgg();
        zzb = zzggVar;
        zzzw.zzF(zzgg.class, zzggVar);
    }

    private zzgg() {
    }

    public static zzgf zzb() {
        return zzb.zzt();
    }

    public static zzgg zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzgg) zzzw.zzw(zzb, zzyuVar, zzzjVar);
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
                    return new zzgf(null);
                }
                return new zzgg();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
