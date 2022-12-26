package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzga  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzga extends zzzw<zzga, zzfz> implements zzaba {
    private static final zzga zzb;
    private int zze;
    private zzyu zzf = zzyu.zzb;

    static {
        zzga zzgaVar = new zzga();
        zzb = zzgaVar;
        zzzw.zzF(zzga.class, zzgaVar);
    }

    private zzga() {
    }

    public static zzfz zzb() {
        return zzb.zzt();
    }

    public static zzga zzd(zzyu zzyuVar, zzzj zzzjVar) throws zzaae {
        return (zzga) zzzw.zzw(zzb, zzyuVar, zzzjVar);
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
                    return new zzfz(null);
                }
                return new zzga();
            }
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
